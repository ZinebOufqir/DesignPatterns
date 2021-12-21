package com.templatemethod;

public class TestTemplateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DataProcessor obj= new ExcelFile();
			obj.readProcessandSave();
			//Instead Of
			/*obj.readData();
			  obj.processData();
			  obj.saveData();*/
			
			obj = new TextFile();
			obj.readProcessandSave();
			//Instead Of
			/*
			obj2.readData();
			obj2.processData();
			obj2.saveData();*/
			
 	}

}
