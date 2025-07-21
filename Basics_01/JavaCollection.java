import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class JavaCollection {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        // Stack<Integer> stack = new Stack<>();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack.peek());
        
        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(100);
        // list.add(200);
        // list.add(300);
        // System.out.println(list);
    }
}
