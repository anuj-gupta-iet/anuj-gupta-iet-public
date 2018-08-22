package intermediate;


public class PrintKMissingElementsInArray {
	public static void main(String[] args) {
		int[] arr = {6,1,5};
		printMissing(arr, 5);
	}
	static void printMissing(int arr[], int n)
	{
	   for (int i = 0; i < n; ++i)
	   {
	      int k = i;

	      while(arr[k] != (k+1))
	      {
	         if( arr[k] < 1 || arr[k] > n || arr[k] == arr[arr[k] - 1] )
	         {
	            arr[k] = -1;
	            break;
	         }

	         swap(arr, k, arr[k] - 1);
	      }
	   }

	   for (int i = 0; i < n; ++i)
	   {
	      if(arr[i] < 0 ){
	    	  System.out.println(i+1);
	      }
	         //std::cout << i+1 << " is missing" << std::endl;
	   }
	}
	private static void swap(int[] arr, int k, int i) {
		int tmp = arr[k];
		arr[k]=arr[i];
		arr[i]=tmp;
	}
}
