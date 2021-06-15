package com.java.project;

 
class StackProlemSoution
{
    public static void main (String[] args)
    {
        MyStack stack = new MyStack(3);
 
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
