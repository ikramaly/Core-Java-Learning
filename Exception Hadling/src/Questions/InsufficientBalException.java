package Questions;

import org.w3c.dom.ls.LSOutput;
// this is the step1
public class InsufficientBalException extends Exception {

    public InsufficientBalException(String msg) {
        super(msg);
    }
}
