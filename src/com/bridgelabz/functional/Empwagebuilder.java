package com.bridgelabz.functional;

public class Empwagebuilder {

	

		static int wagePerHours =20;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     double x =Math.random();
	     double y =Math.floor(x*10);
	     
	     System.out.println(x);
	     System.out.println(y);
	     int empPresent =(int) y %2;
	     //System.out.println("empPresent");
	     int empWage =0;
	     if (empPresent == 0) {
				
	 		
				System.out.println("emplyee is  absent");
			}
	     
				else {
				
		  System.out.println("emplyee is  present");
	            int FULL_DAY_HOUR = 0;
				int WAGE_PER_HOUR = 0;
				empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
	     
	     
		}
		
		
		System.out.println("emplyee wage ="+empWage);

		  }
	}


