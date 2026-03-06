class InsertionSort{
	public static void Insertion(int arr[]){
		int n=arr.length;
		
		for(int i=1;i<n;i++){//unsorted
			int temp=arr[i];
		    int j=i-1;
			while((j>=0)&& (arr[j]>temp))//sorted
			{
				arr[j+1] = arr[j];  
                j--; 
			}
			arr[j+1] = temp;
		}
    }	
	
	public static void main(String args[]){
		int arr[]={5,2,4,6,1,3};
		
		System.out.println("before the insertion sort");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		Insertion(arr);
		
		System.out.println("after the insertion sort");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
	    }
	}
}