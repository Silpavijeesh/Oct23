package basic.day6;


import java.util.Stack;

public class DataTest2 {

	public static void main(String[] args) {
		Stack ob=new Stack(); //inbuilt stack from java.util. in this inbuilt package we have some inbuilt methods also.
		ob.push(30);
		ob.push(35);
		ob.push(45);
		ob.push(53);
		ob.push(35);
		System.out.println(ob);// there is no inbuilt ob.display() method in this inbuilt steck.so I use syso.
         ob.peek();
         System.out.println(ob);
         ob.pop();
         System.out.println(ob);
         ob.add(3, 40);
         ob.add(0, 4);
         System.out.println(ob);
         ob.addElement(5);
         System.out.println(ob);
         ob.capacity();
         System.out.println(ob);
       
         ob.pop();
         System.out.println(ob);
         ob.peek();
         System.out.println(ob);
        ob.pop();
        System.out.println(ob); 
        
         ob.containsAll(ob);
         System.out.println(ob);
         ob.push(80);
         System.out.println(ob);
         
         
     
	}

}
