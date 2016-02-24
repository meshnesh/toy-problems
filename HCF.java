package toys;

public class GCF {
	
	
	
	public static int divide(int num1, int num2){
		
        
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
	
public static int sum(){
		
        int num1= divide(30, 9);
        int num3=divide(64, 8);
        int sum=0;
        sum = num1 + num3;
		return sum;
		}
	public static void main(String[] args) {
		int num1=20;
        int num2=10;
        System.out.println(divide(num1, num2));
        System.out.println(sum());
	}

}
