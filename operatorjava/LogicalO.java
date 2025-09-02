package com.operatorjava;

public class LogicalO {

	public static void main(String[] args) {
		// Logical && ,|| , Not
        int a = 10, b = 20;

        // AND 
        if (a < b && b < a) 
            System.out.println("Both conditions are true (a < b AND b <a).");
        // OR 
        if (a > b || b < a) 
            System.out.println("At least one condition is true (a > b OR b < a).");       
        // NOT
        boolean result = (a < b); // true
        System.out.println("Before NOT: " + result);  
        System.out.println("After NOT: " + !result); 
	}

}
