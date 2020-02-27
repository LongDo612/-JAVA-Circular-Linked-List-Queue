public class CircularLinkedListQueue<E> {

    private class Node {
        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public void enqueue(E e) {
        Node newNode = new Node(e);
        if (head==null){
            head = tail = newNode;
            newNode.next = head;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    public void dequeue() {
        Node temp = head;
         if (head==tail){
            head = tail = null;
        }
        else {
            head = head.next;
            tail.next = head;
        }
    }

    public void displayQueue() {
        Node current = head;
        do {
            System.out.println(current.data);
            current = current.next;
        }
        while (current!=head);
    }
}
