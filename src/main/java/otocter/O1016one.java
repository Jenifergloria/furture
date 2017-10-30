package otocter;

import java.util.Arrays;



public class O1016one {
	
	public int show(int[] scores){
		Arrays.sort(scores);
		System.out.print(Arrays.toString(scores));
		return scores.length;
	}
	
}
