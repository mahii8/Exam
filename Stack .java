public class Stack {
     int maxSize;
     int[] stackArray;
     int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = value;
        } else {
            System.out.println("Cannot push " + value);
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top];
            top--;
            return poppedValue;
        } else {
            System.out.println(" Cannot pop from an empty stack.");
            return -1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
