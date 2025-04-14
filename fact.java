import java.util.Scanner;
public class fact {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
       int fact=1;
        int num;
        System.out.println("Enter the num=");
        num=in.nextInt();
        while(num!=0)
        {
            fact=fact*num;
            num--;
        }
      System.out.println("value is="+fact);5

    }
    
}
