package exception;

/**
 * Created by xuweijie on 2017/3/3.
 * 异常处理公共类
 */
public class CustomException extends Exception {
    //异常信息
    private String message;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
