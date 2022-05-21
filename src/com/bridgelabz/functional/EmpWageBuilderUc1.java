package com.bridgelabz.functional;

public class EmpWageBuilderUc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        double x = Math.random();
	        int empPresent =(int) Math.floor(x*10) % 2;
			if (empPresent == 0) {
				
			
				System.out.println("emplyee is present");
			}
				else
				
			    System.out.println("emplyee is abscent");
	 	
	}

}
