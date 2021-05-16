package org.example.queue;

public class ArrayQueue<T> implements Queue<T> {

    private T[] items;
    private int n = 0;

    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity) {
        items = (T[])new Object[capacity];
        n = capacity;
    }

    public ArrayQueue() {
        this(10);
    }

    @Override
    public void enqueue(T t) {
        if (tail == n) return;
        items[tail] = t;
        ++tail;
    }

    @Override
    public T dequeue() {
        if (head == tail) return null;
        return items[head++];
    }

    @Override
    public void show() {
        System.out.println("################ start ################ ");
        for (T item : items) {
            System.out.println(item);
        }
        System.out.println("################  end  ################ ");
    }
}
