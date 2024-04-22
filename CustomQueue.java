package Exceptionhandling_assignment;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class CustomQueue<T> {
    private List<T> queue;

    // Constructor
    public CustomQueue() {
        this.queue = new ArrayList<>();
    }

    // Enqueue operation
    public void enqueue(T value) {
        queue.add(value);
    }

    // Dequeue operation
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue.remove(0);
    }

    // Peek operation
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue.get(0);
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        CustomQueue<Object> queue = new CustomQueue<>();

        // Enqueue strings and integers
        queue.enqueue("First");
        queue.enqueue(2);
        queue.enqueue("Third");
        queue.enqueue(4);

        // Dequeue and display elements until the queue is empty
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}
