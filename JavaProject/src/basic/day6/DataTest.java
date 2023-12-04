package basic.day6;

import dataStructures.day1.MyStack;

public class DataTest {

	public static void main(String[] args) {
	MyStack ob =new MyStack(5);
	ob.push(30);
	ob.push(10);
	ob.push(45);
	ob.display();
     ob.pop();
     System.out.println("-------------------------");
     ob.display();
    // ob.peek();
     //ob.display();
     ob.push(57);
     ob.push(8);
     ob.display();
     ob.pop();
     ob.display();
     ob.peek();
     ob.display();
     ob.pop();
     ob.pop();
     ob.pop();
     ob.display();
	}

}
