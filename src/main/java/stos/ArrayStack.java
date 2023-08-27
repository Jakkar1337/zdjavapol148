package stos;

public class ArrayStack implements Stack {
    private String[] stackData;
    private int buffer = 100;

    private int top;

    public ArrayStack() {
        stackData = new String[buffer];
        top = -1;
    }

    @Override
    public void push(String item) throws CustomFullStackException {
        if (top >= buffer - 1) {
            throw new CustomFullStackException("Full stack exception");
        }
        stackData[++top] = item;
    }

    @Override
    public String pop() throws EmptyStackException {
        if (top < 0) {
            throw new EmptyStackException("Empty stack exception");
        }
        String item = stackData[top--];
        return item;
    }

    @Override
    public String peek() throws EmptyStackException {
        if (top < 0) {
            throw new EmptyStackException("Empty stack exception");
        }
        return stackData[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

}
