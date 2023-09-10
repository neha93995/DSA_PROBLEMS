import java.util.HashMap;
import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        hm.put(args, hm);
        System.out.println(hm);
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(7);
        stack.push(5);
        stack.push(5);
        stack.push(6);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search(7));
        System.out.println(stack);
    }
}
