package toys;

public class combinestring { 
//	
//	
//	public static void main(String a1, String b1){
//
//	    int index = 0;

//	    int len1 = a1.length() > b1.length()? a1.length():b1.length();
//	    int len2 = a1.length() > b1.length()? b1.length():a1.length();
//
//	    for(int i=0;i<len1;i++){
//
//	        if(len2>0){
//	            System.out.print(""+a1.charAt(index)+b1.charAt(index));
//	            index++;
//	            len2--;
//	        }
//	        else{
//
//	            if(i<a1.length())
//	            {
//	                System.out.print(""+a1.charAt(index));
//	                index++;
//	            }
//	            else
//	            {
//	                System.out.print(""+b1.charAt(index));
//	                index++;
//	            }                       
//
//	        }  
//	    }
//	}
//}
	   












//
//public static void main(String[] args) {
//
//	String a = "abc", b = "def", c = "adbcef";
//	
//	System.out.println("String interleaved " + isInterleaved(a.toCharArray(),b.toCharArray(),c.toCharArray()));
//
//}
//
//static boolean isInterleaved(char[] cs, char[] cs2,char[] cs3)
//{
//	int M = cs.length;
//	int N = cs2.length;
//	
//	if ((M+N) != cs3.length)
//	return false;
//	
//	// result[i][j] is true if C[0..i+j-1] is an interleaving of A[0..i-1] and B[0..j-1].
//	boolean result[][] = new boolean[M+1][N+1];
//	
//	for(int i=0;i<=M;i++)
//	result[i][0]=true;
//	
//	for(int i=0;i<=N;i++)
//	result[0][i]=true;
//	
//	for (int i=1; i<=M; i++)
//	{
//		for (int j=1; j<=N; j++)
//		{
//		// If both A and B are empty, then C must also be empty (due to length matching)
//		// And since one empty string is interleaving of other two empty
//		// strings, result[0][0] is true.
//		if (i==1 && j==1)
//		result[i][j] = true;
//		
//		// If A is empty, check one-to-one match with B 
//		else if (i==1 && cs2[j-1]==cs3[j-1])
//		result[i][j] = result[i][j-1];
//		
//		// If B is empty, check one-to-one match with A
//		else if (j==1 && cs[i-1]==cs3[i-1])
//		result[i][j] = result[i-1][j];
//		
//		// Regular check for interleaving
//		if (cs[i-1]==cs3[i+j-1] && cs2[j-1]==cs3[i+j-1])
//		result[i][j]=(result[i-1][j] || result[i][j-1]);
//		
//		else if(cs[i-1]==cs3[i+j-1])
//		result[i][j] = result[i-1][j];
//		
//		else if (cs2[j-1]==cs3[i+j-1])
//		result[i][j] = result[i][j-1];
//		
//		}
//	}
//
//	return result[M][N];
//	}
//}
//










	
	