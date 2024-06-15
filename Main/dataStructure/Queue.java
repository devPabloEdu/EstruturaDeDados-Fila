package dataStructure;


public class Queue {
    private Node first;
    private Node last;
    private int length;

    public class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }
    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length++;
    }
    public void getFirst(){
        if (first != null) {
            System.out.println("First: " + first.value);
        } else {
            System.out.println("Fila esta vazia");
        }
    }
    public void getLast() {
        if (last != null) {
            System.out.println("Last: " + last.value);
        } else {
            System.out.println("Fila esta vazia");
        }
    }
    public void getLength(){
        System.out.println("length: " + length);
    }

    public void print(){
        System.out.println("--------------------");
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("------------------------");
    }
    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (length == 0){
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
    public Node dequeue(){
        if (first == null) return null;
        Node temp = first;
        first = first.next;
        temp = null;
        length--;
        if(length==0 || length ==1){
            first = null;
            last = null;
        }
        return temp;
    }

    public static void main (String[] args) {
        Queue myQueue = new Queue(1);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.print();

        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.print();
        myQueue.dequeue();
        myQueue.print();
    }
}
