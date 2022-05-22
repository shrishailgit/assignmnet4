package com.bridgelabz.functional;

public class SwitchcaseUC4 {



		static final int WAGE_PER_HOUR =20;
		static final int FULL_DAY_HOUR =16;
		static final int PART_TIME_HOUR =8;
		public static void main(String[] args, int empWage) {
		int empPresent = 0;
		switch (empPresent) {
		
		case 1:
			System.out.println("Employee is Part Time");
			empWage =WAGE_PER_HOUR * PART_TIME_HOUR;
		break;
		case 2:
			System.out.println("Employee is Part Time");
			empWage =WAGE_PER_HOUR * FULL_DAY_HOUR;	
		break;
		default:
			System.out.println("Employee Wage= " +empWage);
		
		}	
		
	}

}
