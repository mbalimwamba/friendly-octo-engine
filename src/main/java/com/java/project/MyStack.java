package com.java.project;

public class MyStack
{
    private int arr[];
    private int top;
    private int capacity;
 
    public MyStack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
 
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(1);
        }
 
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }
 
    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
 
        System.out.println("Pop --> " + peek());
 
        return arr[top--];
    }
 
    public int peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(1);
        }
 
        return -1;
    }
 
    public int size() {
        return top + 1;
    }
 
    public Boolean isEmpty()
    {
        return top == -1;              
    }
 
    public Boolean isFull() {
        return top == capacity - 1;     
    }
}
