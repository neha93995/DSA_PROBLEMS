class MyLinkedList {
    
    Node head;
    
    class Node{
        int val;
        Node next;
        Node(){
    
        }
        Node(int val)
        {
            this.val = val;
        }
    }
    

    public MyLinkedList() {

        // head = new Node();
    }
    
    public int get(int index) {

        Node temp = head;
        while(index>=0)
        {
            temp =temp.next;
            index--;
        }
        System.out.println("get");
        displayll();
        return temp.val;
        
    }
    
    public void addAtHead(int val) {

        System.out.println(head.val);
        System.out.println(head.next);
        displayll();

        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        System.out.println("addAtHead");
        displayll();
        
    }
    
    public void addAtTail(int val) {
        Node newNode  = new Node(val);
        Node temp = head;

        while(temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next = newNode;
        System.out.println("addAtTail");
        displayll();
        
    }
    
    public void addAtIndex(int index, int val) {
        Node temp = head;

        if(temp==null)
        {
            return ;
        }

        for(int i=0; i<index-1; i++)
        {
            temp = temp.next;
        }
        Node newNode =  new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("addAtindex");
        displayll();
        
    }
    
    public void deleteAtIndex(int index) {

        Node temp = head;

        if(index==0)
        {
            head = temp.next;
        }

        for(int i=0; i<index-1; i++)
        {
            temp = temp.next;
        }

        if(temp == null)
        {
            return;
        }

        temp.next=temp.next.next;
        System.out.println("Delete");
        displayll();
        
    }

     public void displayll(){

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;


        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */


public class LinkedListLeetcode {
    public static void main(String[] args) {

        MyLinkedList obj = new MyLinkedList();
        // int param_1 = obj.get(1);
        // obj.addAtHead(1);
        // obj.addAtTail(3);
        // obj.addAtIndex(1,2);
        // obj.get(1);
        // obj.deleteAtIndex(1);
        // obj.get(1);
        obj.displayll();
        
    }
}
