package Datastuructures2;

public  class Dequeue {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node front;
    public Node rear;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("list empty");
            return;
        }
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }
        public void display () {
            Node current = front;
            if (current == null) {
                System.out.println("empty");
                return;
            }
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }

        public static void main (String[]args){
            Dequeue dq = new Dequeue();
            dq.enqueue(5);
            dq.enqueue(4);
            dq.enqueue(3);
            dq.enqueue(7);
            dq.enqueue(8);
            dq.dequeue();
            dq.display();

        }
    }
