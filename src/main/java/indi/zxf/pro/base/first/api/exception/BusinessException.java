package indi.zxf.pro.base.first.api.exception;

/**
 * @author zhouxiaofa
 * @date 2023/1/11 21:52
 **/
public class BusinessException extends Exception {

    private static final long serialVersionUID = 1L;
    protected int code;

    public BusinessException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(String message, int code) {
        super(message);
        this.code = code;
    }

    public BusinessException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(int code, String message, Object... args) {
        super(String.format(message, args));
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
