package com.amdocs;

import java.util.Stack;

public class RPNCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    Stack<Double> stack = new Stack<Double>(); 
    private double operand1,operand2,result;
    
    Operation op;
    
	public double solve (String input)
	{
		String[] inputString = input.split(" ");
		
		for(int i=0;i<inputString.length;i++)
		 {
			 if(inputString[i].equals("+"))
			 {
				 operand1 = stack.pop();
				 operand2 = stack.pop();
				 op = new Addition();
				 result = op.getResult(operand1, operand2);
				// result = operand1 + operand2;
				 stack.push(result);
			 }
			 else if(inputString[i].equals("-"))
			 {
				 operand1 = stack.pop();
				 operand2 = stack.pop();
				 op = new Subtraction();
				 result = op.getResult(operand1, operand2);
				 //result = operand2 - operand1;
				 stack.push(result);
			 }
			 else if(inputString[i].equals("/")) 
			 {
				 operand1 = stack.pop();
				 operand2 = stack.pop();
				 op = new Division();
				 result = op.getResult(operand1, operand2);
				 //result = operand2 / operand1;
				 stack.push(result); 
			 }
			 else if(inputString[i].equals("*")) 
			 {
				 operand1 = stack.pop();
				 operand2 = stack.pop();
				 op = new Multiplication();
				 result = op.getResult(operand1, operand2);
				 //result = operand1 * operand2;
				 stack.push(result); 
			 }
			 else {
				 double ip = Double.parseDouble(inputString[i]);  
				 stack.push(ip);
			 }		 
		 }
		return stack.peek();
	}

}
