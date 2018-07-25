package interview;

import java.util.Arrays;
import java.util.Random;

public class Rdm {

	
	public static void main(String[] args) {
		int[] numbers = new int[500];  
		 int Smallest = Integer.MAX_VALUE;
	   
	    for(int i = 0; i < numbers.length; i++) {
	      numbers[i] = (int)(Math.random()*500 + 1);
	      int a= numbers[i];
	      System.out.println(a);
	      
	     
	      if(Smallest>numbers[i]) {
	    	  Smallest = numbers[i];
	    	  
	    	
	      }
	    }//end for loop
	 //   System.out.println("Numbers Generated: " + Arrays.toString(numbers));
	    System.out.println("The Smallest Number is " + Smallest);
	   
	    
	    
	   
		
		
	}
}
