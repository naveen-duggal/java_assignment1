public class CheckPangram 
{
    //method to convert string into lowercase
    static String stringIntoUpper(String sr)
    {
        String sr1="";
        for(int i=0;i<sr.length();i++)
        {
            if(sr.charAt(i)>='A' && sr.charAt(i)<='Z')
            {
                sr1=sr1+(sr.charAt(i));
            }
            else
            {
                sr1=sr1+(char)(sr.charAt(i)-32);
            }
        }
        return sr1;

    }
    public static void main(String[] args)
    {
        boolean x=false;
        String str="ABCD EFGH ijkl MNOPQRS TUVWxyz";
        str=str.replace(" ","");

        //convert string into Uppercase
        String s1=stringIntoUpper(str);

        char[] ch=s1.toCharArray();
        int [] ar=new int[26];

        for(int i=0;i<ch.length;i++)
        {
            int index=ch[i]-65;
            ar[index]++;
            //ar[ch[i]-65]++;
        }

        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==0)
            {
                System.out.println("It's not pangram");
                x=true;
                break;
            }
        }
        if(x==false)
        {
        System.out.println("It's pangram");
        }
    }
    
}
