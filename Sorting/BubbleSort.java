class BubbleSort{
	public static void Bubble(int arr[]){//without creating object use of static
		int n=arr.length;
		
		for(int i=0;i<n-1;i++){
			for(int j=1;j<n-i;j++){     
				if(arr[j-1]>arr[j]){   
					int  temp=arr[j];   
					arr[j]=arr[j-1];    
					arr[j-1]=temp;      
				}
			}
		}
	}
	public static void main(String args[]){
		
		
	    int arr[]={77,42,35,12,101,5};
		
		System.out.println("before the sorting");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		Bubble(arr);
		System.out.println("after the sorting");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}
}