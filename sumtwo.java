public class sumtwo {
    public static void main(String[] args) {
        int arr[][]={ {1,2,3,4,5},{5,4,3,2,1},{7,9,8,6,5}};
        int sum=0,sum1=0;
       for(int i=0;i<arr.length;i++)
       {
         sum=0;
        for (int j=0;j<arr[i].length;j++)
        {
            
            sum=sum+arr[i][j];
        }
        System.out.println("Sum of "+i+" row is"+sum);
        sum1+=sum;
       }System.out.println(sum1);
    }
    
}
