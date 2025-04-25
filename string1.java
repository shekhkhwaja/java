import java.util.Scanner;
public class string1 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the String=");
         String str=obj.nextLine();

        String newStr="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
        if(newStr.indexOf(c)==-1)
        {
           newStr+=c;
        }
    }
  System.out.println("newstring="+newStr);

    
}
}
