import java.util.Scanner;
public class reverse {
    public static void main(String[] args) // main method 
    {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the value for reverse order=");
       int num=in.nextInt();
       int rev;
       while(num!=0)
       {
        rev=num;
        rev=rev/num;
        rev=rev%num;
       }
       System.out.println("rerversed value="+rev);
    }
    
}
