public class TestMyIntStack {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(3);

        // Test push()
        System.out.println(stack.push(1));  // true
        System.out.println(stack.push(2));  // true
        System.out.println(stack.push(3));  // true
        System.out.println(stack.push(4));  // false (or throws an exception if we prefer)

        // Test pop()
        System.out.println(stack.pop());  // 3
        System.out.println(stack.pop());  // 2
        System.out.println(stack.pop());  // 1
        System.out.println(stack.pop());  // throws an exception

        // Test peek()
        System.out.println(stack.push(5));  // true
        System.out.println(stack.push(6));  // true
        System.out.println(stack.peek());  // 6

        // Test increaseCapacity()
        stack.increaseCapacity(5);
        System.out.println(stack.push(7));  // true
        System.out.println(stack.push(8));  // true
        System.out.println(stack.push(9));  // true
        System.out.println(stack.push(10)); // true
        System.out.println(stack.push(11)); // false (or throws an exception if we prefer)



