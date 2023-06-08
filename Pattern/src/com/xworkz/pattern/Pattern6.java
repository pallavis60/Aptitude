package com.xworkz.pattern;

public class Pattern6 {

	public static void main(String[] args) {
		
		
		for(int i=0;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				if(i==j||i+j==10) {
					System.out.print("#");
				}else {
				System.out.print("  ");
			}
		}
		System.out.println(" ");
		

	}

}
}
