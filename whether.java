import java.util.Scanner;
public class whether {
    public static void main(String[] args)
    {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter a number=");
      int n=in.nextInt();
      if(n%5==0 || n%11==0)
        {
            System.out.println("given no is divisible");
        }
        else
        {
            System.out.println("not divisible by 5 and 11");

        }
    }

}
