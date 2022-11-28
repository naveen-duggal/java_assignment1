public class Palindrome 
{
    public static void main(String[] args)
    {
        int num = 2552;
        int sum=0;
        int temp=num;
        while(num>0)
        {
            int r=num%10;
            sum = (sum*10)+r;
            num=num/10;
        }

        if(temp==sum)
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
    
}
