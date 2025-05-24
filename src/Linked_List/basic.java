package Linked_List;




public class basic {
   public static class Node {
       public int data;
       public Node next;

       Node(int data) {
           this.data = data;
       }
   }

   //reversing a linked list
   public static void reverse(Node head){
       if (head==null) return;
       reverse(head.next);
       System.out.println(head.data);

   }


   //Recursive printing
   public static void display(Node head){
       if (head==null) return;
       System.out.print(head.data+" ");
       display(head.next);
   }

    public static void printer(Node head) {
        if (head.next == null) {
            System.out.println("Only Element is: " + head.data);
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }


        public static void main(String[] args) {
            Node x = new Node(5);
            Node y = new Node(7);
            System.out.println(y);
            Node z = new Node(9);
            Node x1 = new Node(15);
            Node x2 = new Node(20);

//            5->7->9->15->20
            x.next=y;
            y.next=z;
            z.next=x1;
            x1.next=x2;
            x2.next=null;

            reverse(x);
            System.out.println();

//            //printing all the elements when size is known
//            Node temp=x;
//            for (int i = 0; i<5 ; i++) {
//                System.out.println(temp.data);
//                temp=temp.next;
//            }
//
//
//            System.out.println(x.next); //address of y
//            System.out.println(y.next); //address of z
//            System.out.println(z); //address of z
            display(x);
            System.out.println();
            printer(x);



        }
    }
