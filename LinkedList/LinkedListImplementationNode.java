package LinkedList;

public class LinkedListImplementationNode {
    //Java have default linked list integer class

    private Node head;
    private Node tail;
    private int size;

    public LinkedListImplementationNode(){
        this.size=0;
    }

    public void insertAtTheFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }
        size+=1;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;

        private Node next;

        public Node(int value){
            this.value = value;

        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;

        }

    }


}
