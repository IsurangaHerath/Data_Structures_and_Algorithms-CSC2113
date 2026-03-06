import java.util.*;
class LinearSearch{
	public static int Search(int arr[],int target){
		for (int i=0;i<arr.length;i++){
			if(arr[i]==target)
				return i;
		}
 		return -1;	
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int arr[]={2,5,7,4,8,3};
		
		System.out.print("target: ");
		int target=sc.nextInt();

		System.out.println(target+" is at the index of "+Search(arr,target));
		
	}
} 