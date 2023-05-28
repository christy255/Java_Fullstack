package Datastuructures2;

import java.util.Stack;

public class QueueStack {
    private Stack <Integer> stack1=new Stack<>();
    private Stack <Integer> stack2=new Stack<>();
    public void enqueue(int item){
        stack1.push(item);
    }
    public int dequeue(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        QueueStack queue=new QueueStack();
        queue.enqueue(9);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(10);
        System.out.println(queue.dequeue());
    }
}
