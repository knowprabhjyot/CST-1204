public class MyCustomException extends Exception {

    private String message;

    public MyCustomException(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return "Hey Man, this is your custom exception message :" + message;
    }
}