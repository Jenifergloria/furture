package com.imo;

public class TestDebug {

	
	public static void main(String [] args){
		
		int score = 50;
		for(int i=score;i<60;i++){
			score ++;
		}
		
 		test();
		
		System.out.println(score);
	}
	
	public static void test(){
		System.out.println(".........");
	}
}
