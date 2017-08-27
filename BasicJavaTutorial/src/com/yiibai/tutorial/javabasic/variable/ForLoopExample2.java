package com.yiibai.tutorial.javabasic.variable;

public class ForLoopExample2 {
    public static void main(String[] args) {

        // Declare a variable, step in loop
    	int value = 1;
        int value1 = 0;
        int value2 = 0;
        // Declare a variable value with the start value is 0
        // After each iteration, value will increase 3
        // And the loop will end when the value greater than or equal to 10
        for (int step = 1; step <= 100; step = step + 1) {
        	
        	value1 = value;
        	value = value + 1;
        	value2 = value2 + value1;
        	
            System.out.println("Step =" + step + "  value = " + value2);

        }

    }
}