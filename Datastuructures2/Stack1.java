package Datastuructures2;


public class Stack1 {
    int count=0;
    static class Node {
        int data ;
        Node next;
            public  Node (int data){
                this.data=data;
            }
    }
    public Node top;

    public void push(int data){
        Node newNode=new Node(data);
        count++;
        if (top == null) {
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
    }
     public void pop(){
        if (top==null)
            System.out.println("stack underflow");
        else
            top=top.next;
        count--;
     }
     public void display(){
        Node current =top;
         while (current != null){
             System.out.println(current.data + " ");
             current=current.next;
         }
     }

    public static void main(String[] args) {
        Stack1  s = new Stack1();
        Stack1  s1= new Stack1();
        s.push(1);
        s.push(3);
        s.push(2);
        s.push(6);
        s.push(7);
        s.push(9);
        s.pop();
        s.pop();
        s.display();

        System.out.println("the elemnts in the stack is "+s.count);
    }
}

