public class LinkedList {

    Node head;

 

    class Node{
        int data;
        Node next;

        Node(int newData)
        {
            data = newData;
            next = null;
        }
    }

    // Implementation of insertion of a node at the end

    public void insertAtEnd(int newData) //3
    {
        Node newNode = new Node(newData);

        //when linked list is empty 
        if(head==null)
        {
            head = new Node(newData);
            return;
        }

        // when linked list is not empty

        newNode.next = null;
        Node temp = head;

        while(temp.next!=null)
        {
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }


    // inset element at starting point

    public void insertAtStart(int newData)
    {
        Node newNode = new Node(newData);

        newNode.next = head;
        head = newNode;
        return;


    }

    // inset element anywhere

    public void insertAtAnywhere(int newData, int position)
    {
        Node temp = head;
        for(int i=0; i<position-1; i++)
        {
            temp = temp.next;
        }

        if(temp==null)
        {
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = temp.next;
        temp.next = newNode;

        
    }

    // delete element 

    public void deleteElement(int position)
    {
        Node temp = head;

        if(position==0)
        {
            head = temp.next;
        }
        for(int i=0; i<position-1 && temp!=null; i++)
        {
            temp = temp.next;
        }

        if(temp==null)
        {
            return;
        }

        temp.next=temp.next.next;



    }

    //  reverse linked list

    public void reverse()
    {
        Node curr = head;
        Node next = null;
        Node prev = null;

        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return;
    }

    // reverse linked list using recursion 

    public void reverseRec()
    {

        recursion(head,null);
    }
    public void recursion(Node curr, Node prev)
    {
        if(curr.next==null)
        {
            head = curr;
            curr.next = prev;
            return;
        }
        else{
            Node next = curr.next;
            curr.next = prev;
            recursion(next, curr);
        }
    }

    // reverse some part of string

    public void reverseBetween(int left, int right) {
        
        displayll();
        System.out.println("\n---------------");
        Node curr = head;
        Node next = null;
        Node prev = null;

        Node leftNode =null;
        Node leftNode2 = null;

        if(left==right)
        {
            displayll();
            return;
        }

        while(curr !=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
         
        }
        head=prev;
        
        displayll();


    }

    // find middle element of the linked list

    public void middleElement()
    {
        Node slow=head;
        Node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.data);
    }



    // implementation of displaying the linkedList

    public void displayll(){

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;


        }
    }



    // loop detection in linked list by using floyd's problem

    public void loopDetection()
    {
        Node slow =head;
        Node fast = head;

        boolean isloop = false;
        while(fast!=null && fast.next!=null)
        {
            slow= slow.next;
            fast= fast.next.next;

            if(fast==slow)
            {
                isloop=true;
                break;
            }
        }

        if(isloop)
        {
            System.out.println("Loop is detected !");
        }
        else{
            System.out.println("Loop is not detected!");
        }
    }




    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();

        // inset at end

        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);

        // inset at start

        // ll.insertAtStart(5);


        System.out.println("linked list");
        ll.displayll();

        // // inset at any position

        // int position = 3;
        // ll.insertAtAnywhere(111,position);
        // System.out.println("\n insert element at "+position);
        // ll.displayll();

        // // deletion at any position

        // ll.deleteElement(2);

        // System.out.println("\n delete element at "+position);
        // ll.displayll();


        // // reverse linked list
        // System.out.println("\n reverse linked list element");
        // ll.reverse();
        // ll.displayll();

        // // reverse by using recursion

        // System.out.println("\nreverse linked list by using recursion");
        // ll.reverseRec();
        // ll.displayll();

        // // find the middle element of the linked list
        // System.out.println("\n middle element of linked list is ");
        // ll.middleElement();

        // // loop detection in linked list

        // // just for creating looping in linked list
        
        // // Node temp  = ll.head;
        // // while(temp.next!=null)
        // // {
        // //     temp=temp.next;
        // // }
        // // temp.next = ll.head;

        // // ll.displayll(); // infinite loop 
        // ll.loopDetection();

        ll.reverseBetween(1, 3);
    }
}
