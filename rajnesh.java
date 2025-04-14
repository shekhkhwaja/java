import java.util.Scanner;
public class rajnesh {
     void add()
     {  Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of a=");
        int a=in.nextInt();
        System.out.println("Enter the value of b=");
        int b=in.nextInt();
        int c=a+b;
        System.out.println("value of c="+c);
     }
     public static void main(String[] args)
     {
        rajnesh obj=new rajnesh();
        obj.add();
     }
    
}
