import java.util.Scanner;

public class UniqueCharInString
{
    static boolean isUnique(String str)
    {
        if(str.length()>128)
        {
            return false;
        }

        boolean[] charCheck = new boolean[128];
        for(int i=0;i<str.length();i++)
        {
            int val = str.charAt(i);
            if(charCheck[val])
            {
                return false;
            }
            charCheck[val] = true;
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        boolean char1 = isUnique(str1);

        System.out.println("Character in string is unique : " +char1);
    }
    
}
