package com.xworkz.pattern;

public class Pattern5 {
	
	public static void main(String[] args) {
	  
	  for(int i=1 ; i<=5;i++) {
		  for(int j=0;j<=5;j++) {
			 if((i==1 & j==0)||(i==2 & j==1)) {
			 System.out.print("*");
		  }
			 else {
				 System.out.print("");
			 }
			 System.out.println();
		 
	  }
	}
}
}
