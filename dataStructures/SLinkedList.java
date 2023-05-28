package dataStructures;

public class SLinkedList {
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

    public void delete( int data) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        if (temp == tail) {
            tail = prev;
            tail.next = null;
        }
        prev.next= temp.next;
    }

    public void insertBefore(int nextTo, int data) {
        Node newNode = new Node(data);
        Node temp = head, prev = null;
        if (temp != null && temp.data == nextTo) {
            newNode.next=head;
            head=newNode;
            return;
        }
        while (temp != null && temp.data !=nextTo){
            prev = temp;
            temp=temp.next;
        }
        if (temp ==null){
            return;
        }
            prev.next=newNode;
            newNode.next=tail;
    }
    public void insertAfter(int nextTo,int data){
        Node temp=head,prev=null;
        Node newNode=new Node(data);
        while(temp!=null && temp.data!=nextTo){
            prev=temp;
            temp=temp.next;
        }
        if (temp==null){
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void reverse(){
        Node current=head,prev=null,next=null;
        while(current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

        public static void main (String[] args){
            SLinkedList list = new SLinkedList();
            list.display();
            list.addNode(20);
            list.addNode(60);
            list.addNode(10);
            list.addNode(50);
            list.delete( 10);
//            list.insertBefore(20, 20);
//            list.insertBefore(50, 30);
//            list.insertAfter(30,30);
            list.reverse();
            list.display();
        }
}
