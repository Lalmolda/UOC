package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

public class PR0Stack {
    public final int CAPACITY = 15;

    private Stack<Integer> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<Integer>(CAPACITY);
    }

    /*
    public String clearAllStack() {
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop()).append(" ");
        return sb.toString();
    }
    */

    public Stack<Integer> getStack() {
        return this.stack;
    }

    public void push(Integer c) {
        this.stack.push(c);
    }

    public int pop() {
        return stack.pop();
    }
}
