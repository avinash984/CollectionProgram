package stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        System.out.println( stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.search("A"));
        System.out.println(stack.search("Z"));
        System.out.println(stack.isEmpty());
    }
}
