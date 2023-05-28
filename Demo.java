import java.lang.*;


public class Demo {
    public static void main (String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtBeginning(9);
        list.insertAtBeginning(2);
        list.insertAtBeginning(6);
        list.insertAtBeginning(5);
        System.out.println(" ");
        list.deleteAtPos(0);
        list.display();
    }
}
