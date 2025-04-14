import java.util.Scanner;
public class ascii {
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    char ch;
    System.out.println("Enter the char=");
    ch=in.next().charAt(0);
    int i=(int)ch;
    System.out.print("value="+i);

    }
}
