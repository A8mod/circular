package circular;

import org.w3c.dom.Node;

public class CircularList {
    class Nodec
    {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

    }
    int size = 0;
    Node head = null;
    Node tail = null;

CircularList(){
 tail.next = head;

}

    public static void main(String[] args) {
        CircularList list = new CircularList();
        System.out.println(list);

    }


    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("[");
        Node temp = this.head;
        while(temp!= null){
            response.append(temp.data);
            if(temp.next != null){
                response.append(" ==>" );
            }
            temp = temp.next;
            
        }
        response.append("]");
        return response.toString();

    }
}
