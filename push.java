public class push {
    public static void main(String[] args) {
        {
            int arr[][]={ {1,2,3,4,5},{2,3,4,5,6},{5,6,7,8,9}};
            int total=0;
            for(int i=0;i<arr.length;i++)
            {
                total=total+arr[i].length;
            }
            int c[]=new int[total];
            int k=0;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    c[k]=arr[i][j];
                    k++;
                }

            }
            for(k=0;k<c.length;k++)
            {
                System.out.print(c[k]);
            }
        }
    }
    
}
