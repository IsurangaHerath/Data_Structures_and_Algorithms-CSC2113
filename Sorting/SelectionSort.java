class SelectionSort{
	public static void Selection(int arr[]){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
            int minindex=i;			
			for(int j=i+1;j<n;j++){
				if(arr[minindex]>arr[j])
				    minindex=j;		
			}
			if(minindex!=i){
				swap(arr,i,minindex);
			}			
		}
	}
	public static void swap(int arr[],int a,int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	public static void main(String args[]){
		int arr[]={9,3,2,14,43,11,58,22};
		System.out.println("before the selection sort");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		Selection(arr);
		
		System.out.println("\nafter the selection sort");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}