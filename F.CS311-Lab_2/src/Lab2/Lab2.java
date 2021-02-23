package Lab2;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Lab2 {
        
	private int top;
	//private int size;
	private int arr[];
	
	
	
	//Check is stack empty
	      public boolean isEmpty()
	      {
	    	 return (top == -1);
	      }
	      
	      // show top element
	      public int peek()
	      {
	          if (!isEmpty())
	              return arr[top];
	          return -1;
	      }
	      
	      // show stack size
	      public int size()
	      {
	          return top + 1;
	      }
	      
	      //pop top element
	      
	      public int pop()
	      {
	          // check for stack underflow
	          if (!isEmpty())
	         
	           return arr[top--];
	      }
	      
	      
	     //push element top
	      public void push(int x)
	      {
	          if (!isEmpty())
	          
	          arr[++top] = x;
	      }
	     
	     // public boolean isFull()
	     // {
	      //    return top == capacity - 1;   
	    //  }
	      
	     
	   public static void main(String[] args) {
			// TODO Auto-generated method stub
			Stack mystack = new Stack();
			mystack.push(1);
			mystack.push(2);
			mystack.push(3);
			mystack.push(4);
			mystack.push(5);
			mystack.push(6);
			mystack.push(1);
			mystack.push(5);
			mystack.push(6);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("============================================MENU============================================");
			System.out.println(" 1.empty\n 2.peek\n 3.push\n 4.pop\n 5.size\n 6.printStack");
			
			
			for(;;) {
				System.out.print("\nEnter your command: ");
				String songolt = sc.next();
				
				switch(songolt) {
				case "empty":
					System.out.println("Is empty: " + mystack.isEmpty());
					break;
				case "peek":
					System.out.println("Peek element: " + mystack.peek());
					break;
				case "push": 
				{
					System.out.print("Enter push element: ");
					try {
					mystack.push(sc.nextInt());
					} 
					catch(Exception e) {
						System.out.println("push case error!");
					}
					break;
				}
				case "pop": 
					try {
					System.out.println("Pop: " + mystack.pop());
					} 
				catch(Exception e) {
					System.out.println("pop case error!");
					}
				break; 
				case "size":
					System.out.println("Size: " + mystack.size()); 
					break;
				case "printStack":
				{
					Object[] starr = mystack.toArray();
					for(int i = 0; i < starr.length; i++)
						System.out.println(starr[i] + "");
				}
			    case "exit": 
					System.exit(0); sc.close(); 
					break;
				default: 
					System.out.println("Your command is wrong. Enter another command, please ..."); 
					break;
				}
			}
	
	   }
}
	

