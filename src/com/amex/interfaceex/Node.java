package com.amex.interfaceex;

import java.util.Iterator;

public class Node implements Iterable<Node> {


    // READ --  Ierator and Iterable
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node node) {
        this.data = data;
        this.next = node;
    }

    class NodeIterator implements Iterator<Node> {

        Node head = null;

        NodeIterator(Node head) {
            this.head = head;
        }

        @Override
        public boolean hasNext() {
            return head != null;
        }

        @Override
        public Node next() {

            Node x = head;
            head = head.next;
            return x;
        }
    }

    @Override
    public Iterator<Node> iterator() {


        return new NodeIterator(this);
    }
}
