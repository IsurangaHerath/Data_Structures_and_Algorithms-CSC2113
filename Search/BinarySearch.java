class BinarySearch{
	public  void Binary(int arr[],int searchElement){
		int lowerBound=0;
		int upperBound=arr.length-1;
		
		while(upperBound>=lowerBound){
			int mid=(lowerBound+upperBound)/2;
			if(arr[mid]==searchElement){
				System.out.println(mid);
				break;
			}
			else if(searchElement>arr[mid]){
				lowerBound=mid+1;
			}
			else{
				upperBound=mid-1;
			}
		}
	}
	public static void main(String args[]){
		int arr[]={2,3,9,11,14,22,43,58};
		BinarySearch b=new BinarySearch();
		
		b.Binary(arr,22);
		
		
	}
}