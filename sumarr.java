// to sum the value of the array//
import java.util.Scanner;
public class sumarr {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array=");
        int n=obj.nextInt();
        System.out.println("Entered values are=");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        arr[i]=obj.nextInt();
        }
        int sum=0;
        for(int j=0;j<arr.length;j++)
        {
        System.out.println("Entered values are="+arr[j]);
        
        sum+=arr[j];
        
        }
        System.out.println("sum="+sum);5

    }
    
}
