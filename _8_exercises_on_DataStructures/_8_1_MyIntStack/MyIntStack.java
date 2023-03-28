public class MyIntStack {
    private int[] contents;
    private int tos; // Top of the stack

    // constructors
    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    public boolean push(int element) {
        if (isFull()) {
            // throw an IllegalStateException if the stack is full
            throw new IllegalStateException("Stack is full");
            // Alternatively, we could return false here instead of throwing an exception
            // return false;
        }
        else {
            contents[++tos] = element;
            return true;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        else {
            return contents[tos--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        else {
            return contents[tos];
        }
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    public boolean isFull() {
        return tos == contents.length - 1;
    }

    public void increaseCapacity(int newCapacity) {
        int[] newContents = new int[newCapacity];
        for (int i = 0; i < contents.length; i++) {
            newContents[i] = contents[i];
        }
        contents = newContents;
    }
}