package com.viscus.explore.wajeun;

public class IntegerTest {
	public static void main(String[] arguments) {
		for (int i = 0; i < 10000; i++) {
			if(i % 17 == 0){
				System.out.println(Integer.toString(i));
			}
		}
	}
}
