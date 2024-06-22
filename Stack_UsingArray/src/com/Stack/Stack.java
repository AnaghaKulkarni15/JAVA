package com.Stack;

public class Stack <T> {
	private int top;
	private int size;
	private T arr[];
	
	@SuppressWarnings("unchecked")
	public Stack(int size) {
		this.top = -1;
		this.size = size;
		this.arr = (T[]) new Object[size];
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(top == size-1) {
			return true;
		}
		return false;
	}
	
	public void push(T data) {
		if(isFull()) {
			return;
		}
		top++;
		arr[top] = data;
	}
	
	public void displaystack() {
		if(isEmpty()) {
			return;
		}
		System.out.println("Elemnts in Stack:");
		for(int i = top ; i>=0 ; i--) {
			System.out.println(arr[i]+" ");
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			return;
		}
		if(isFull()|| top<size-1) {
		top--;
		//System.out.println("");
		//System.out.println(arr[top]);
		}
	}
	
	
	
	
}
