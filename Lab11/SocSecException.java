package Git.Gitee.javalab.Lab11;

public class SocSecException extends Exception {
    String error;
    @Override
    public String toString() {
        return "Invalid social security number,"+error;
    }

    /**
     * Task #1.1
     * The constructor will call the superclass constructor.
     * It will set the message associated
     * with the exception to “Invalid social security number” concatenated with the error
     * string.
     * @param error
     */
    public SocSecException(String error) {
        super("Invalid social security number," + error);
        this.error = error;
    }

}
