
public class QuickSort
{
    
    public void sort(int a[],int start,int end)
    {
    	if((end-start)>0)
    	{
    		int pivot=a[end];
    		int temp[]=new int[a.length];
    		copy(a,temp);
    		int left=start;
    		int right=end;
    		for(int i=start;i<=end;i++)
    		{
    			if(a[i]>pivot)
    			{
    				temp[right--]=a[i];
    			}
    			if(a[i]<pivot)
    			{
    				temp[left++]=a[i];
    			}
    		}
    		
    		for(int j=left;j<=right;j++)
    		{
    			temp[j]=pivot;
    		}
    		copy(temp,a);
    		sort(a,start,left-1);
    		sort(a,right+1,end);
    		
    	}
    }
    
    public void copy(int a[],int b[])
    {
    	for(int i=0;i<a.length;i++)
    	{
    		b[i]=a[i];
    	}
    }
    
    void print(int a[])
    {
    	for(int i=0;i<a.length;i++)
    	{
    		System.out.print(a[i]+" ");
    	}
    }
    
    public static void main(String args[])
    {
    	QuickSort ob=new QuickSort();
    	int a[]={1,5,6,3,2,4,8,7};
    	ob.sort(a,0,a.length-1);
    	ob.print(a);
    }
    
}