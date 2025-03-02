package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

public class PR0Queue {

    //Attributes
    public final int CAPACITY = 15;

    //Queue
    private Queue<Integer> queue;

    public PR0Queue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }

    /*
    public String clearFullQueue() {
        StringBuilder sb = new StringBuilder();
        char r;
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
        }
        return sb.toString();
    }
    */

    public Queue<Integer> getQueue() {
        return this.queue;
    }

    public void add(Integer c) {
        this.queue.add(c);
    }

    public int poll() {
        return queue.poll();
    }
}
