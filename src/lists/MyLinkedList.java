package lists;

/**
 * Created by rohan on 3/6/16.
 */
public class MyLinkedList {

    /**
     * Add Node
     * Removed Node
     * Find Node
     */

    Node head;
    Node tail;

    public void add(int data){
        Node n = new Node(data);

        if(tail == null){
            head = n;
            tail = n;

        }else{
            tail.nextNode = n;
            tail = n;
        }

    }

}
