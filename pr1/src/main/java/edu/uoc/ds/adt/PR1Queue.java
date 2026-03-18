package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;
import edu.uoc.ds.adt.util.Point;

public class PR1Queue {

    public final int CAPACITY = 10;

    private Queue<Point> queue;

   /* public PR1Queue() {
        newQueue(CAPACITY);
    }*/
    public PR1Queue(int capacity) {
        newQueue(capacity);
    }

    public void newQueue(int capacity) {
        queue = new QueueArrayImpl<>(capacity);
    }

    public Queue<Point> getQueue() {
        return this.queue;
    }

    public void add(Point p) {
        this.queue.add(p);
    }

    public Point poll() {
        return this.queue.poll();
    }
}
