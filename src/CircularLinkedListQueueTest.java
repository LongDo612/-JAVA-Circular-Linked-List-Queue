public class CircularLinkedListQueueTest {
    public static void main(String[] args) {
        CircularLinkedListQueue<Integer> queue = new CircularLinkedListQueue<>();
        queue.enqueue(1);
        queue.enqueue(6);
        queue.enqueue(9);
        queue.enqueue(2);
        queue.dequeue();
        queue.displayQueue();
    }
}
