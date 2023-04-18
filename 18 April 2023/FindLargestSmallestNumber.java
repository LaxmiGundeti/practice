//Write a program to create an arrray and then Find largest and smallest elements of an array.

public class FindLargestSmallestNumber
{
    public static void main(String[] args)
    {
	    int arr[] = {55,32,45,98,82,11,9,39,50};
		
		int small = arr[0];
		int large = arr[0];
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]>large)
			{
			    large=arr[i];
			}
			else if(arr[i]<small)
			{
			    small=arr[i];
			}
		}
		System.out.println("small number="+small);
		System.out.println("large number="+large);
	}
			
				 
			
		
		
}