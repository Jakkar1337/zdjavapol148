package stos;

public class Main {
    public static void main(String[] args) {

        Stack stack = new ArrayStack();

            try {
                stack.push("Hello");
                stack.push("World");
                System.out.println("Peek: " + stack.peek());
                System.out.println("Pop: " + stack.pop());
                System.out.println("Pop: " + stack.pop());
                System.out.println("Is Empty: " + stack.isEmpty());
            } catch (CustomFullStackException | EmptyStackException e) {
                e.printStackTrace();
            }
        }
    }
