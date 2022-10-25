public class Program3 
{
    public static void main(String[] args)
    {
        int i,j;
        int n=14;
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=n;j++)
            {
                if(i==0 || i==n || j==0 || j==n || (j+i<=n/2 && i<=n/2 && j<=n/2) || (j-i>=n/2 && i<=n/2 && j>=n/2) )
                {
                    System.out.print(" *");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
