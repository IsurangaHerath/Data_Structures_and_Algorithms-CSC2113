import java.util.*;
class MergeSort
{
	void merge( int L[],int R[],int A[])
	{
		int nL= L.length;
		int nR=R.length;
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<nL && j<nR)
		{
			if(L[i] < R[j])
			{
				A[k]=L[i];
				i++;
			}
			else 
			{
				A[k]=R[j];
				j++;
			}
			k++;
		}
		while (j<nR)
		{
			A[k]=R[j];
			j++;
			k++;
		}
		while (i<nL)
		{
			A[k]=L[i];
			i++;
			k++;
		}	
	}
	void divide(int A[])
	{
		int n=A.length;
		if(n<2)
		{
			return ;
		}
		 int mid =n/2;
		 int L[] =new int[mid];
		 int R[] =new int[n-mid];
		 
		 for(int i=0;i<mid;i++)
		 {
			L[i]=A[i] ;
		 }
		 for(int i=mid;i<n;i++)
		 {
			 R[i-mid]=A[i];
		 }
		
		 divide(L);
		 divide(R);
		 merge(L,R,A);		 
	}
	void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String arg[])
	{
		int array[]={12,34,67,3,6,100,54,1};
		MergeSort m=new MergeSort();
		m.divide(array);
		m.print(array);
		
	}
}