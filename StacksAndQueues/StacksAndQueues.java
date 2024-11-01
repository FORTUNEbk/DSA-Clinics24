package StacksAndQueues;

import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority); 
    }

    @Override
    public String toString() {
        return name + "(priority: " + priority + ")";
    }
}

public class StacksAndQueues {
    public static void main(String[] args) {
        PriorityQueue<Task> queue = new PriorityQueue<>();

        queue.add(new Task("task1", 2));
        queue.add(new Task("task2", 1));
        queue.add(new Task("task3", 3));

        System.out.println("Order of tasks by priority:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll().getName());
        }
    }
}

