import java.util.*;
public class CheckAnagram 
{
    //method to sort the string 
    static String sort(String sr)
    {
        char arr[] = sr.toCharArray();
        char temp;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        String newsr = new String(arr);
        return newsr;

    }

    //method to find the length of string Optional insteadof write str.length()
    static int findLength(String sr)
    {
        int len=0;
        for(char c:sr.toCharArray())
        {
            len++;
        }
        return len;
    }

    //method to convert string into lowercase
    static String stringIntoLower(String sr)
    {
        String sr1="";
        for(int i=0;i<sr.length();i++)
        {
            if(sr.charAt(i)>='a' && sr.charAt(i)<='z')
            {
                sr1=sr1+(sr.charAt(i));
            }
            else
            {
                sr1=sr1+(char)(sr.charAt(i)+32);
            }
        }
        return sr1;

    }

    //method to check two string are anagram of each other
    static boolean anagram(String sr1,String sr2)
    {
        int n1 = findLength(sr1);
        int n2 = findLength(sr2);

        //if length of both string is not same,
        //then they cannot be anagram

        if(n1!=n2)
        return false;

        //String into lowercsae
        String str1=stringIntoLower(sr1);
        String str2=stringIntoLower(sr2);
        
        //Sort both string
        String str3=sort(str1);
        String str4=sort(str2);
        System.out.println(str3);
        System.out.println(str4);

        //compare sorted strings
        //n1 is the length of string
        for(int i=0;i<n1;i++)
        {
            if(str3.charAt(i)!=str4.charAt(i))
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String sr1 = "Bad Credit";
        String sr2 = "Debit Card";
        
        sr1=sr1.replace(" ","");
        sr2=sr2.replace(" ","");

        if(anagram(sr1, sr2))
        {
            System.out.println("The two string are anagram of each other");
        }
        else
        {
            System.out.println("The two string are not anagram of each other");
        }
    }
    
}
