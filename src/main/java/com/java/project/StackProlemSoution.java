package com.java.project;

class Stack
{
    private int arr[];
    private int top;
    private int capacity;
 
    Stack(int size)
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
 
class StackProlemSoution
{
    public static void main (String[] args)
    {
        Stack stack = new Stack(3);
 
        stack.push(42);     
        stack.push(66); 
        stack.push(99);
 
        stack.pop();       
        stack.pop();  
        stack.pop();
        
        stack.push(54);      
 
        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());
 
        stack.pop();        
        
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}
