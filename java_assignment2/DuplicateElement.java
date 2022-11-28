public class DuplicateElement 
{
    public static void main(String[] args)
    {
        int [] arr = {1,4,7,9,4,3,2,6,7,9,10,15};
        System.out.println("Duplicate elements in given array: ");

        //Search for duplicate element
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                System.out.println(arr[j]);
            }
        }
    }  
}
