package BT.Queue;
import java.util.EmptyStackException;
public class CircularQueue {
    private Node front;
    private Node rear;
    private int numbNodes;

    public CircularQueue() {
        front = rear = null;
    }

    public static class Node{
        private int data;
        private Node link;


        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }


        public void enQueue(int data){
            Node temp = new Node(data);
            if (front == null){
                front = rear = temp;
                numbNodes++;
            }else {
                rear.link = temp;
                rear = temp;
                rear.link = front;
                numbNodes++;
            }
        }
        public void deQueue(){
            if (front == null){
                throw new EmptyStackException();
            }else if (front == rear){
                front = rear = null;
                numbNodes--;
            }else {
                front = front.link;
                rear.link = front;
                numbNodes--;
            }
        }
        public void displayQueue(){
            if (front==null){
                System.out.println("Empty");
            }else {
                Node temp = front;
                for (int i=0;i<numbNodes;i++){
                    System.out.println(temp.getData());
                    temp = temp.link;
                }
            }
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue();
        circularQueue.enQueue(4);
        circularQueue.enQueue(5);
        circularQueue.enQueue(6);
        circularQueue.enQueue(7);
        circularQueue.deQueue();
        circularQueue.displayQueue();
    }
}
