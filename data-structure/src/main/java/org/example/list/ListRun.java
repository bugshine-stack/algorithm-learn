package org.example.list;

public class ListRun {
    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList<String>();

        list.show();

        list.addLast("hello1");
        list.addLast("hello2");
        list.addLast("hello3");
        list.addLast("hello4");
        list.addLast("hello5");
        list.addLast("hello6");
        list.addLast("hello7");

        list.reversedShow();
    }
}
