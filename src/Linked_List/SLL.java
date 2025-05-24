package Linked_List;

public class SLL {
    private Node head;
    private Node tail;
    private int size;

    public SLL() {
        this.size=0;
    }
    //Input function
    public void insert (int val) {
        Node node = new Node(val);
        node.next=head;
        head=node;

        if (tail==null){
            tail=head;
        }
        size+=1;
    }


    //insert at end
    public void insertAtEnd (int val){
        Node temp = new Node(val);
        if (tail==null){
            insert(val);
            return;
        }
        tail.next=temp;
        temp=tail;
        size++;
    }




    //display function
    public void display() {
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private int data;
        private Node next;
        
        public Node (int value){
            this.value=value;
        }
        public Node (int value,Node next){
            this.value=value;
            this.next=next;
        }
        
    }
}
