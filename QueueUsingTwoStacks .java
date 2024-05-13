public class QueueUsingTwoStacks {
     int[] stack1;
     int[] stack2;
     int top1;
     int top2;

    public QueueUsingTwoStacks(int capacity) {
        stack1 = new int[capacity];
        stack2 = new int[capacity];
        top1 = -1;
        top2 = -1;
    }

    public void enqueue(int item) {
        if (top1 == stack1.length - 1) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        stack1[++top1] = item;
    }

    public int dequeue() {
        if (top1 == -1 && top2 == -1) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        if (top2 == -1) {
            while (top1 >= 0) {
                stack2[++top2] = stack1[top1--];
            }
        }

        return stack2[top2--];
    }

    public int peek() {
        if (top1 == -1 && top2 == -1) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }

        if (top2 == -1) {
            while (top1 >= 0) {
                stack2[++top2] = stack1[top1--];
            }
        }

        return stack2[top2];
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeued: " + queue.dequeue());

        queue.enqueue(4);

        System.out.println("Peeked: " + queue.peek());

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        System.out.println("Peeked: " + queue.peek());

        System.out.println("Dequeued: " + queue.dequeue());
    }
}
