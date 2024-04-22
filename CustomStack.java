package Exceptionhandling_assignment;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class CustomStack {
    private List<Integer> stack;

    // Constructor
    public CustomStack() {
        this.stack = new ArrayList<>();
    }

    // Push operation
    public void push(int value) {
        stack.add(value);
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int lastIndex = stack.size() - 1;
        int poppedValue = stack.get(lastIndex);
        stack.remove(lastIndex);
        return poppedValue;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        // Pushing integers onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Popping and displaying integers until the stack is empty
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
