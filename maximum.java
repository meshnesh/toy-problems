package toys;

public class maximum {
	
	public static void main(String[] args) {
		
		int array[] = new int[]{10, 11, 88, 2, 12, 120};
		
		//calling the getMaxvalue
		int max = getMax(array);
		System.out.println("Maximum Value is: "+max);
		
		
		//calling the getMin value
		int min = getMin(array);
		System.out.println("Minimum Value is: "+min);

		

	}
	//method of getting the maximum value
	public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0];
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	//method of getting the minimum value
	public static int getMin(int[] inputArray){ 
	    int minValue = inputArray[0];
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	         minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	  }

}
