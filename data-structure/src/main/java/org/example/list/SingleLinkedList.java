package org.example.list;

public class SingleLinkedList<T> {

    private Node head;
    private int length;

    private static class Node<T> {
        T data;
        Node next;
        Node(T t, Node next) {
            this.data = t;
            this.next = next;
        }

        Node(T t) {
            this(t, null);
        }
    }

    public void addLast(T t) {
        Node node = new Node(t);
        if (head == null) {
            head = node;
        } else {
            Node tmpNode = head;
            while (tmpNode.next != null) {
                tmpNode = tmpNode.next;
            }
            tmpNode.next = node;
        }
        this.length++;
    }

    public void show() {
        if (head != null) {
            Node node = head;
            while (node !=null) {
                System.out.println(node.data);
                node = node.next;
            }
        }
    }

    public void reversedShow() {
        if (head != null) {
            this.findNode(head);
        }
    }

    private Node findNode(Node node) {
        if (node.next == null) {
            System.out.println(node.data);
            return node;
        } else {
            this.findNode(node.next);
            System.out.println(node.data);
            return node;
        }
    }
}
