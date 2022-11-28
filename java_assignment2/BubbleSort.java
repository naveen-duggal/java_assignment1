class BubbleSortExample
{
    void bubbleSort(int[] arr)
    {
        int n = arr.length;
        int temp = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<(n-i);j++)
            {
                if(arr[j-1]>arr[j])
                {
                    //swap element
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
public class BubbleSort 
{
    public static void main(String[] args)
    {
        int arr[] = {3,60,35,2,54,421,7};

        System.out.println("Array Before Bubble Sort");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        BubbleSortExample sc = new BubbleSortExample();
        sc.bubbleSort(arr);

        System.out.println("Array After Bubble sort");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
}
