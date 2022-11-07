
 /*
  * Laboreinheit: Algorithmen und Datenstrukturen – Aufgabenblatt 1
  * @author Skander Ayari
  * @Matricule number : 579140
  *  created at 31.05.2021
  */

 package Myapp;

public class Stack {


    public Stack() {
    }


    private static Node top;
    private static int size;

    private static class Node {

        private final Student data;
        private Node next;

        public Node(Student data) {
            this.data = data;
        }
    }

    public static void push(Student s) {
        Node tempNode = new Node(s);
        tempNode.next = top;
        top = tempNode;
        size++;
    }

    public static void pop() {
        try {
            top = top.next;
            size--;
        } catch (Exception e) {
            System.out.println("Stackunderflow");
        }
    }

    public static void peek() {
        if (isEmpty()) {
            System.out.println("Stack ist lehr , gibt kein oberste Element");
        } else {
            System.out.println(top.data.toString());
        }
    }

    public static int size() {
        return size;
    }

    public static void empty() {
        if (isEmpty())
            System.out.println("Stack is empty");
        else System.out.println("Stack is not empty");
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        while (size != 0) {
            if (size > -1) {
                Stack.pop();
            }
        }
    }

    public static void print() {
        Node current = top;
        if (size == 0)
            System.out.println("Keine Studenten die gelesen werden , weil Anzahl der Elemente im Stack ist:0");
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

}



