//Program to remove dupliacte from a string
public class RemDuplicateInString
{
    public static void main(String[] args)
    {
       
        int[] arr1 = new int[26];
        String str = "naveen";
        
        for(int i=0;i<str.length();i++)
        {
            arr1[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str.length();i++)
        {
            if(arr1[str.charAt(i)-'a']>0)
            {
                System.out.println(str.charAt(i));
                arr1[str.charAt(i)-'a']=0;
            }
        }
    }
}