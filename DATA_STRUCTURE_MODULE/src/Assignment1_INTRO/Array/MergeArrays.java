package Assignment1_INTRO.Array;

public class MergeArrays {
	
	
    public static void mergeArray(int arr1[],int arr2[])
    {
    	int index=arr1.length+arr2.length;
		int result[]=new int[index];
		for(int i=0;i<arr1.length;i++)
		{
			 
				result[i]=arr1[i];
				result[i+4]=arr2[i];
			
		}
		for(int i=0;i<index;i++)
		{
			
			System.out.print("\t "+result [i]);
//			System.out.print();
		}
		}
    
    
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int arr2[]= {11,22,33,44}; 
		mergeArray(arr1,arr2);
		
		
	

	}

}
