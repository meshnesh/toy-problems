package toys;

public class GCF {
	
	
	
	public static int divide(){
		
        int num1=1000000;
        int num2=100000;
        int gcf=0;
        for(int i=1; i<=num1 || i<=num2; i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                gcf=i;
            }
        }
		return gcf;
		}
	public static void main(String[] args) {
		
        System.out.println(divide());
	}

}
