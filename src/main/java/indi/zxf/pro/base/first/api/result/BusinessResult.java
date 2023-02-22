package indi.zxf.pro.base.first.api.result;

/**
 * 展示数据统一封装
 *
 * @author zhouxiaofa
 * @date 2023/1/11 22:03
 **/
public class BusinessResult {

    private BusinessResult() {

    }

    /**
     * 定义统一封装数据格式(code + message + object)
     **/
    public static <O> Wrapper<O> wrap(int code, String message, O o) {
        return new Wrapper(code, message, o);
    }

    /**
     * 定义统一封装数据格式(code + message)
     **/
    public static <O> Wrapper<O> wrap(int code, String message) {
        return wrap(code, message, null);
    }

    /**
     * 定义统一封装数据格式(code)
     **/
    public static <O> Wrapper<O> wrap(int code) {
        return wrap(code, null);
    }

    /**
     * 定义统一封装数据格式(wrapper)
     */
    public static <O> O unwrap(Wrapper<O> wrapper) {
        return wrapper.getData();
    }

    /**
     * 定义统一返回数据格式[正确格式](code + message)
     **/
    public static <O> Wrapper<O> ok() {
        return new Wrapper();
    }

    /**
     * 定义统一返回数据格式[正确格式](code + message + object)
     **/
    public static <O> Wrapper<O> ok(O o) {
        return new Wrapper(200, "操作成功", o);
    }

    /**
     * 定义统一返回数据格式[错误格式](code + message)
     **/
    public static <O> Wrapper<O> error(int errorCode, String message) {
        return new Wrapper(errorCode, message);
    }

}
