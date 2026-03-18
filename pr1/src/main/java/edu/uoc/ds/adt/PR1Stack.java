package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;
import edu.uoc.ds.adt.util.Point;

public class PR1Stack {
    public final int CAPACITY = 10;

    private Stack<Point> stack;

    /*public PR1Stack() {
        newStack();
    }*/
    public PR1Stack(int capacity) {
        newStack(capacity);
    }

    public void newStack(int capacity) {
        stack = new StackArrayImpl<Point>(capacity);
    }

    public Stack<Point> getStack() {
        return this.stack;
    }

    public void push(Point p) {
        this.stack.push(p);
    }

    public Point pop() {
        return this.stack.pop();
    }
}
