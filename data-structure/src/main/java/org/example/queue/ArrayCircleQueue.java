package org.example.queue;

/**
 * 循环队列会浪费一个空间
 * @param <T>
 */
public class ArrayCircleQueue<T> implements Queue<T> {

    private T[] items;
    private int n = 0;

    private int head = 0;
    private int tail = 0;

    public ArrayCircleQueue(int capacity) {
        items = (T[])new Object[capacity];
        n = capacity;
    }

    public ArrayCircleQueue() {
        this(10);
    }

    @Override
    public void enqueue(T t) {
        if ((tail + 1) % n == head) return;
        items[tail] = t;
        tail = (tail + 1) % n;
    }

    @Override
    public T dequeue() {
        if (head == tail) return null;
        T out = items[head];
        head = (head + 1) % n;
        return out;
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
