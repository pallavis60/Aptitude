package com.xworkz.pattern;

public class Pattern2 {

	public static void main(String[] args) {
		
		for(int i=1;i<4;i++) {
			if(i!=1) {
				for(int j=0;j<4;j++) {
					if(j==2||j==3 && i==3) {
						System.out.print(i +" ");
					}
				}
					
			}
			System.out.println(i +" ");
		}

	}

}
