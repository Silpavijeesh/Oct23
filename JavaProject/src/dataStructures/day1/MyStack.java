package dataStructures.day1;
import java.util.Stack;
public class MyStack {
	
	private int size;
	private int[] a;
	private int top;  
	
	public MyStack(int s) {
		size=s;
		a= new int[size];
		top=-1;
	}
	public boolean isFull() {
		return top == size-1;
	}
	public boolean isEmpty() {
		return top == -1;
		
	}
	public int peek() {
		return a[top];//return top of the element without removing it. 
		
	}
	public void push(int item) {
		if (isFull())
		System.out.println("can't insert the value");
		else {
			top++;
			a[top]=item;
			System.out.println("Item has been inserted");
		}
	}
	
	public int pop() {
		int deleted= -1;
		if(isEmpty())
			System.out.println("no more element left in the stack");
		else {
			
	       deleted=a[top];
	       top--;
		}
		return deleted;
		
		}
	public void display() {
		System.out.println("content of stack");
		int temp=top;
		while(temp>-1) {
			System.out.println(a[temp]);
			temp--;
		}
	}

	
	public static void main(String[] args) {
		MyStack s=new MyStack(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.display();
		//s.push(6);
		s.pop();
		System.out.println("After popping:");
		s.display();
         s.pop();
        s.pop();
         s.pop();
         s.pop();
         s.display();
         s.pop();
	}
 
}
