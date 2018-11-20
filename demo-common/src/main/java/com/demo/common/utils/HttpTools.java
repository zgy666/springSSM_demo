package com.demo.common.utils;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class HttpTools {
    private static Logger log = Logger.getLogger(HttpTools.class);

    /*****
     * HTTP连接超时时间
     *****/
    public static final int CONNECT_TIMEOUT = 10000;

    /*****
     * HTTP套接字SOCKET超时时间
     *****/
    public static final int SOCKET_TIMEOUT = 60000;

    public static String post(String url, Map<String, String> params, int connectTimeout, int readTimeout) {
        CloseableHttpClient httpClient = null;
        HttpPost httppost = new HttpPost(url);

        try {
            httpClient = HttpTools.getHttpClient();

            if (params == null || params.size() == 0) {
                return "";
            }

            // 创建参数队列
            List<NameValuePair> formparams = new ArrayList<NameValuePair>();
            for (String key : params.keySet()) {
                formparams.add(new BasicNameValuePair(key, params.get(key)));
            }
            UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
            httppost.setEntity(uefEntity);

            //配置request
            HttpTools.configRequest(httppost, connectTimeout, readTimeout);

            HttpResponse response = null;
            try {
                response = httpClient.execute(httppost);
            } catch (Exception e) {
                log.error("time out ", e);
            }

            try {
                if (response == null) {
                    return "";
                } else {
                    if (response.getStatusLine().getStatusCode() >= 400) {
                    }
                }
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    return EntityUtils.toString(entity, "UTF-8");
                }
            } finally {

            }
        } catch (SocketTimeoutException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (httppost != null) {
                httppost.releaseConnection();
            }
        }
        return "";
    }

    private static void configRequest(HttpPost httppost, int connectTimeout, int readTimeout) {
        // 设置请求和传输超时时间
        RequestConfig requestConfig = RequestConfig.custom()
                .setSocketTimeout(readTimeout)
                .setConnectTimeout(connectTimeout)
                .setConnectionRequestTimeout(connectTimeout)
                .setStaleConnectionCheckEnabled(true)
                .build();
        httppost.setConfig(requestConfig);
        return;
    }

    private static CloseableHttpClient getHttpClient() {
        SSLContext sslcontext = SSLContexts.createSystemDefault();
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext) {

            @Override
            public Socket connectSocket(
                    int connectTimeout,
                    Socket socket,
                    HttpHost host,
                    InetSocketAddress remoteAddress,
                    InetSocketAddress localAddress,
                    HttpContext context) throws IOException, ConnectTimeoutException {
                if (socket instanceof SSLSocket) try {
                    PropertyUtils.setProperty(socket, "host", host.getHostName());
                } catch (NoSuchMethodException ex) {
                    log.error(ex);
                } catch (IllegalAccessException ex) {
                    log.error(ex);
                } catch (InvocationTargetException ex) {
                    log.error(ex);
                }

                return super.connectSocket(connectTimeout, socket, host, remoteAddress, localAddress, context);
            }
        };

        CloseableHttpClient httpclient = HttpClients.custom()
                .setSSLSocketFactory(sslsf)
                .build();
        return httpclient;
    }

}
