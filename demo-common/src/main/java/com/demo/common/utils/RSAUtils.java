package com.demo.common.utils;


import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

/**
 * RSA相关工具类
 */
public class RSAUtils {
    public static byte[] generateSHA1withRSASigature(String src, String priKey, String charset) throws Exception
    {
        Signature sigEng = Signature.getInstance("SHA1withRSA");
        byte[] pribyte = Base64Utils.decode(priKey);
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(pribyte);
        KeyFactory fac = KeyFactory.getInstance("RSA");
        RSAPrivateKey privateKey = (RSAPrivateKey) fac.generatePrivate(keySpec);
        sigEng.initSign(privateKey);
        sigEng.update(src.getBytes(charset));
        byte[] signature = sigEng.sign();
        return signature;
    }

}