package com.factory;

public class CalculateFactory {

	public Calculate getCalculation(String type) {
		
		Calculate obj = null;
		if(type.toLowerCase().equals("add")) {
			obj= new Add();
		}
		if(type.toLowerCase().equals("divide")) {
			obj = new Divide();
		}
		if(type.toLowerCase().equals("substract")) {
			obj= new Substract();
		}
		else {
			System.out.println("we don't do that");
		}
		return obj;
	}
}
