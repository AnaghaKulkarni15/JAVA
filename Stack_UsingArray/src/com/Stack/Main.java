package com.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<Integer> s1 = new Stack<Integer>(5);
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(20);
		s1.push(50);
		
		s1.displaystack();
		
		s1.pop();
		//System.out.println("After pop operation :");
		s1.displaystack();
		
		s1.pop();
		s1.displaystack();

	}

}
