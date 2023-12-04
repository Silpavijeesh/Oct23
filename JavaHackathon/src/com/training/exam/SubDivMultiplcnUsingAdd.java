package com.training.exam;
//write a java program to implement*,-,/ operator.you should use only the + operator
public class SubDivMultiplcnUsingAdd {

	public static void main(String[] args) {
		int a=11, b=5;
		System.out.println("product : " +multiply(a,b));
		System.out.println("Divide:  " +divide(a,b));
		System.out.println("Subtraction: "+subtraction(a,b));		
	}
    private static int subtraction(int a,int b) {
    	
    	return a+(-1 *b);
    }
    private static int divide(int a,int b) {
    	int quotient=0;
    	while(a>=b) {
    		a=a-b;
    		quotient++;
    	}
    	return quotient;	
    }
    
    private static int multiply(int a,int b) {
    	int product=0;
    	for(int i=1;i<=b;i++) {
    		product=product+a;
    	}
    	return product;
    }
    
    
    
    
}
