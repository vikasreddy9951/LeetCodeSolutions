package LinkedLists;

public class linkedList {
    private Node head;
    public linkedList(){
        this.head=null;
    }
    public void add(int data){
        Node newnode = new Node(data);
        if(head ==null){
            head = newnode;
        }else{
            Node current = head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newnode;
        }
    }
    public void printAll(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value+ " ");
            current = current.next;
        }
        System.out.println("null");
    }

    public class Node{
        int value;
        Node next;
        public Node(){
        }
        public Node(int value){
            this.value=value;
            this.next=null;
        }
    }
    public Node removeDuplicates(Node head){
        Node current=head;
        while(current!=null){
            if(current.next==null){
                break;
            }
            if(current.value==current.next.value){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return head;
    }
    public static void main(String[] args){
        linkedList ll= new linkedList();
        ll.add(1);
        ll.add(1);
        ll.add(3);
        ll.add(4);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(6);
        ll.removeDuplicates(ll.head);

        ll.printAll(ll.head);
    }
}
