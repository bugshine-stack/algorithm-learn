package org.example.queue;

public interface Queue<T> {

    void enqueue(T t);

    T dequeue();

    void show();
}
