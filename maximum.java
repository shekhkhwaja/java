import java.util.Scanner;
public class maximum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter the size of array=");
         int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {

        arr[i]=obj.nextInt();
        }
        int max=0;
        for(int j=0;j<arr.length;j++)
        if(max<arr[j])
        {
        max=arr[j];
    }
    System.out.println("max value="+max);
}
}
