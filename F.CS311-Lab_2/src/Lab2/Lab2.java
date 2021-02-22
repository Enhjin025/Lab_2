package Lab2;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Lab2 {
        
	private int top;
	private int capacity;
	private int arr[];
	
	
	
	
	      public boolean isEmpty() {
	    	 return (top == -1);
	     }
	      public int peek()
	      {
	          if (!isEmpty())
	              return arr[top];
	          return -1;
	      }
	      public int size()
	      {
	          return top + 1;
	      }
	      public int pop()
	      {
	          // check for stack underflow
	          if (isEmpty())
	         
	           return arr[top--];
	      }
	      public void push(int x)
	      {
	          if (!isEmpty())
	          
	          arr[++top] = x;
	      }
	      public Boolean isFull()
	      {
	          return top == capacity - 1;    // or return size() == capacity;
	      }
	      
	     
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
			System.out.println("empty\npeek\npush\npop\nsize");
			
			
			for(;;) {
				System.out.print("\nEnter your command: ");
				String songolt = sc.next();
				
				switch(songolt) {
				case "empty": System.out.println("Is empty: " + mystack.isEmpty()); break;
				case "peek": System.out.println("Peek element: " + mystack.peek()); break;
				case "push": {
					System.out.print("Enter push element: ");
					try {
					mystack.push(sc.nextInt());
					} 
					catch(Exception e) {
						System.out.println("push case error!");
					}
					break;
				}
				case "pop": try {
					System.out.println("Pop: " + mystack.pop());
					} 
				catch(Exception e) {
					System.out.println("pop case error!");
					}
				break; 
				case "size":
					System.out.println("Size: " + mystack.size()); 
					break;
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
	

