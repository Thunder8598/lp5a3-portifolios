public class DemoException extends Exception {
    public DemoException(String msg) {
        super(msg);
    }

    public DemoException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
