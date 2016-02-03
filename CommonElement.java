// Using Java, come up with an algorithm to identify common elements or 
// numbers between two given arrays. Do NOT use any inbuilt methods.

public class CommonElement{
 
    public static void main(String a[]){
        int[] arr1 = {10,12,4,9,2};
        int[] arr2 = {16,8,12,9,30,32,4};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
