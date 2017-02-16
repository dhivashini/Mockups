package com.dhiva.Mocks;

//Write an implementation of a Stack that supports push(), pop(), and min() functions in constant time.

public class Node{
private int data;
public Node next;

public Node(int data){
    this.data = data;
}
}

public class Stack{
public static StackNode top = null;
public static StackNode min = null;

public static void push(int data){

    if(top==null){
        top = new StackNode(data);
        min = top;
     }

    if(data<min.data){
        StackNode n = new StackNode(data);
        n.next = min;
        min = n;
    }
     
    StackNode temp = new StackNode(data);
    temp.next = top;
    top = temp;    
}

public static int pop(){
    
    if(top==null)
       // throw exception;
       
    int temp = top.data;
    
    if(temp == min.data){
        min = min.next;
    }
    top = top.next;
    return temp;   
}

public static int min(){
    return min.data;
}

public static void main(String[] args){
    push(5);
    push(3);
   int poppedElement = pop();
   int minimum = min();
    
    /*
    push(): 5,4,2
    min(): 2
    pop(): 2
    min(): 4
    push(): 1, 5, 7,0, 8
    pop(): 8
    pop(): 0
    pop(): 7
    pop(): 5
    pop(): 
    min(): 0        
    
    top: 1 -> 4 -> 5 -> 
    min: 1 -> 4 -> 5 ->
    
    */
    
    
}

}

//Write an implementation of a Queue that supports push(), pop(), and min() functions in constant time.

public class Queue{
public Node front=null;
public Node end=null;
public Node min = null;

public static void push(int data){
    if(front==null&&end==null){
        front = new Node(data);
        end = front;
        min =front;
        return;
    }
    
    if(data<min.data){
        Node n = new node(data);
        n.next = min;
        min = n;
    }
    
    Node temp = new Node(data);
    end.next = temp;
    end = temp;
}

public static int pop(){
   if(front==null&&end==null)
   //throw exception
   if(front.data==min.data){
       min = min.next;
   }
   int data = front.data;
   front = front.next;
   return data;
}

public static int min(){
    return min.data;
}

}

/*
    push(): 5,4,2
    min(): 2
    pop(): 2
    min(): 4
    push(): 1, 5, 7,0, 8
    pop(): 8
    pop(): 0
    pop(): 7
    pop(): 5
    pop(): 
    min(): 0  

front: 5
end:4 -> 5
min: 4 -> 5 


//krishna's feedback
(++)
* able to write code
* with guidance able to test the implementaion

(--)
* jumps into the problem without outlining the overall approach, what DS will be used to solve the problem
* doesnt have backbone to support her implementation which is correct, always asks for approval.
* lacks testing skills
* doesnt speaks clearly/confident, not sure whether the candidate knows the DS/algos throughly
* sytax error in class
* doesnt clearly specifies class/member access scope
* lacks OO skills, defines members/methods public static, which is an issues when the solution is extended to multi-threading

