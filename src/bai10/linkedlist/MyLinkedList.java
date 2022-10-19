package bai10.linkedlist;

import bai2.A;
import bai3.Array;
import bai4.declare_class.Product;

import java.util.ArrayList;

public class MyLinkedList<E> {
    public Node head;
    public int numNodes;

    public void add(E data) {
        if (head == null) {
            head = new Node(data);
            numNodes++;
        } else {
            add(numNodes, data);
        }
    }

    public void add(int index, E data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        Node newNode = new Node(data);
        temp.next = newNode;
//        temp.next.next = holder;
        newNode.next = holder;
        numNodes++;
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(2, 1000);

        Node temp = list.head;
        for (int i = 0; i < list.numNodes; i++) {
            System.out.println(temp.value);
            temp = temp.next;
//            System.out.println(list.head.value);
//            list.head = list.head.next;
        }
    }
}
