import java.util.Scanner;
public class MaxCharInString 
{
    static void maxChar(String str1)
    {
        int count=0;
        char maxRepeatedChar=' ';
        int maxCount=0;

        for(int i=0;i<str1.length();i++)
        {
            count=0;
            for(int j=i;j<str1.length();j++)
            {
                if(str1.charAt(i)==str1.charAt(j))
                {
                    count++;
                }
            }
            if(maxCount<count)
            {
                maxCount=count;
                maxRepeatedChar=str1.charAt(i);
            }
        }

        System.out.println(maxRepeatedChar +" is present "+ maxCount +" times" );
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str= str.toLowerCase();
        maxChar(str);

    }
    
}
