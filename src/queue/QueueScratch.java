package queue;

class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int actualElementCount;

    public Queue(int size) {
        this.arr = new int[size];
        this.front = 0;
        this.rear = -1;
        this.capacity = size;
        this.actualElementCount = 0;

    }

    public boolean isQueueFull() {
        return actualElementCount == capacity;
    }

    public boolean isQueueEmpty() {
        return actualElementCount == 0;
    }

    public void enqueue(int a) {
        if (isQueueFull()) {
            System.out.println("Queueu is full");
            System.exit(-1);
        }
        rear = (rear + 1) % capacity;
        arr[rear] = a;
        actualElementCount++;

    }


    public int dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queueu is Empty");
            System.exit(-1);
        }
        int x = arr[front];
        front = (front + 1) % capacity;
        actualElementCount--;
        return x;
    }

    public int peek() {
        if (isQueueEmpty()) {
            System.out.println("Empty");
        }
        return arr[front];
    }

    public void displayQueue() {
        for (int i = 0; i < actualElementCount; i++) {
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");

        }
        System.out.println();
    }

}

public class QueueScratch {
    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.enqueue(15);
        q.enqueue(16);
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.enqueue(15);
        q.enqueue(16);
        q.displayQueue();
        q.dequeue();

        q.displayQueue();
        System.out.println(q.peek());
    }
}
