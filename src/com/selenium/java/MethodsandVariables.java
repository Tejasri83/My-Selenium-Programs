package com.selenium.java;

public class MethodsandVariables {
	int i=20;
	//method
	public void add(){
		int i=30;
		int j=40;
		int sum=i+j;
		System.out.println(sum);
	}
	//main method
	public static void main(String[] args)
	{
		//object
		MethodsandVariables mv=new MethodsandVariables();
		mv.add();//calling method with object reference
		System.out.println(mv.i);//calling variables
		
		
	}
	
	

}
