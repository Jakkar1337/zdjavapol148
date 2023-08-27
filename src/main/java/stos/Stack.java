package stos;

public interface Stack {
    void push(String item) throws CustomFullStackException, CustomFullStackException;
    String pop() throws EmptyStackException;
    String peek() throws EmptyStackException;
    boolean isEmpty();
}

class CustomFullStackException extends Exception {
    public CustomFullStackException(String message) {
        super(message);
    }
}

class EmptyStackException extends Exception {
    public EmptyStackException(String message) {
        super(message);
    }

}
