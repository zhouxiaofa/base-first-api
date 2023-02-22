package indi.zxf.pro.base.first.api.exception;

/**
 * 统一异常定义
 *
 * @author zhouxiaofa
 * @date 2023/1/11 21:42
 **/
public class Exception extends RuntimeException{

    private static final long serialVersionUID = 1L;

    /**
     * 异常定义(message + cause)
     *
     * @param       message-->异常信息
     * @param       cause-->异常原因
     */
    public Exception(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 异常定义(message)
     *
     * @param       message-->异常信息
     */
    public Exception(String message) {
        super(message);
    }

    /**
     * 异常定义(cause)
     *
     * @param       cause-->异常原因
     */
    public Exception(Throwable cause) {
        super(cause);
    }
}
