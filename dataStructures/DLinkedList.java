package dataStructures;

public class DLinkedList {

    class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
        }
    }
    public Node head;
    public Node tail;

    public void addNode(int data){
       Node newNode=new Node(data);
        if(head == null){
            head=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
        }
        tail=newNode;
    }

    public void display(){
       Node temp=tail;
        if (temp == null){
            System.out.println("empty");
            return;
        }
        while(temp != null) {
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }
    public void delete(int data){
        Node temp=head,current=null,back=null;
        if(temp!=null && temp.data == data){
            head =temp.next;
            head.prev=null;
            return;
        }
        while (temp != null && temp.data !=data){
            temp.prev = temp;
            temp=temp.next;
        }
        if (temp ==null){
            return;
        }
        if(temp==tail){
            tail=temp.prev;
            tail.next=null;
        }

    }

    public static void main(String[] args) {
        DLinkedList list=new DLinkedList();
        list.display();
        list.addNode(20);
        list.addNode(60);
        list.addNode(40);
        list.addNode(10);
        list.display();
//        list.delete(10);
//        list.display();

    }
}
