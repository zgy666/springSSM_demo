package wrapper;

import java.io.Serializable;

public class WrapMapper<T> implements Serializable{

    /**
     * 序列化标识
     */
    private static final long serialVersionUID = 4893280118017319089L;

    /**
     * 成功码.
     */
    private static final int SUCCESS_CODE = 200;

    /**
     * 成功信息.
     */
    private static final String SUCCESS_MESSAGE = "OK";

    /**
     * 成功，但无数据
     */
    private static final int SUCCESS_NODATA_CODE = 2200;

    /**
     * 成功，但无数据
     */
    private static final String SUCCESS_NODATA_MESSAGE = "无数据";

    /**
     * 错误码.
     */
    private static final int ERROR_CODE = 500;

    /**
     * 错误信息.
     */
    private static final String ERROR_MESSAGE = "内部异常";

    /**
     * 错误码：参数非法
     */
    private static final int ILLEGAL_ARGUMENT_CODE_ = 100;

    /**
     * 错误信息：参数非法
     */
    private static final String ILLEGAL_ARGUMENT_MESSAGE = "参数非法";


    /**
     * 错误码：rf调用接口超时
     */
    private static final int RFTIME_OUT_CODE_ = 600;

    /**
     * 错误信息：rf调用接口超时
     */
    private static final String RFTIME_OUT_MESSAGE = "调用超时";

    /**
     * 错误码：rf密文错误
     */
    private static final int RF_CIPHERTEXT_CODE_ = 700;

    /**
     * 错误信息：rf密文错误
     */
    private static final String RF_CIPHERTEXT_MESSAGE = "密文错误";

    /**
     * 错误码：用户未登录
     */
    private static final int NOT_LOGIN_CODE_ = 900;

    /**
     * 错误信息：用户未登录
     */
    private static final String NOT_LOGIN_MESSAGE = "用户未登录";

    /**
     * 编号.
     */
    private int code;

    /**
     * 信息.
     */
    private String message;

    /**
     * 结果数据
     */
    private T result;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static int getSuccessCode() {
        return SUCCESS_CODE;
    }

    public static String getSuccessMessage() {
        return SUCCESS_MESSAGE;
    }

    public static int getSuccessNodataCode() {
        return SUCCESS_NODATA_CODE;
    }

    public static String getSuccessNodataMessage() {
        return SUCCESS_NODATA_MESSAGE;
    }

    public static int getErrorCode() {
        return ERROR_CODE;
    }

    public static String getErrorMessage() {
        return ERROR_MESSAGE;
    }

    public static int getIllegalArgumentCode() {
        return ILLEGAL_ARGUMENT_CODE_;
    }

    public static String getIllegalArgumentMessage() {
        return ILLEGAL_ARGUMENT_MESSAGE;
    }

    public static int getRftimeOutCode() {
        return RFTIME_OUT_CODE_;
    }

    public static String getRftimeOutMessage() {
        return RFTIME_OUT_MESSAGE;
    }

    public static int getRfCiphertextCode() {
        return RF_CIPHERTEXT_CODE_;
    }

    public static String getRfCiphertextMessage() {
        return RF_CIPHERTEXT_MESSAGE;
    }

    public static int getNotLoginCode() {
        return NOT_LOGIN_CODE_;
    }

    public static String getNotLoginMessage() {
        return NOT_LOGIN_MESSAGE;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
