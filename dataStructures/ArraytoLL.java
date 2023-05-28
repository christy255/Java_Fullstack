package dataStructures;

public class ArraytoLL {
        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        public Node head = null;
        public Node tail = null;

        public void addNode(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }

    public void display() {
       Node temp = head;
        if (temp == null) {
            System.out.println("empty");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ArraytoLL arr=new ArraytoLL();
        int[] array=new int [] {1,2,3,4,5};
        for (int i = 0; i < array.length ; i++) {
            arr.addNode(array[i]);
        }
        arr.display();

        }
}
