package org.example.queue;

public class QueueRun {

    public static void main(String[] args) {
        testArrayCircleQueue();
    }

    public static void testArrayQueue() {
        Queue<String> queue = new ArrayQueue<>();
        queue.enqueue("hello1");
        queue.enqueue("hello2");
        queue.enqueue("hello3");
        queue.enqueue("hello4");
        queue.enqueue("hello5");
        queue.show();

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.show();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.show();
    }

    public static void testArrayCircleQueue() {
        Queue<String> queue = new ArrayCircleQueue<>();
        queue.enqueue("hello1");
        queue.enqueue("hello2");
        queue.enqueue("hello3");
        queue.enqueue("hello4");
        queue.enqueue("hello5");
        queue.enqueue("hello6");
        queue.enqueue("hello7");
        queue.enqueue("hello8");
        queue.enqueue("hello9");
        queue.enqueue("hello10");
        queue.enqueue("hello11");
        queue.enqueue("hello12");
        queue.show();

        System.out.println(queue.dequeue());
        queue.enqueue("hello11");
        queue.show();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.show();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.show();
    }
}
