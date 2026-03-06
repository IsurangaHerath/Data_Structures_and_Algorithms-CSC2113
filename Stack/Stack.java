public class Stack{
int top,maxsize,arr[],temp;

	Stack(int size)
	{
		top=-1;
		maxsize=size;
		arr=new int[maxsize];
	}

	public boolean isFull()
	{
		return top==maxsize-1;
	}


	void push(int e)
	{
		if(isFull())
		{
		System.out.println("Stack is Full");
		}
		else
		{
		//top=top+1;  //1
		//arr[top]=e;
		arr[++top]=e;
		}
	}

	public boolean isEmpty()
	{
		return top==-1;
	}
	
	int pop()
	{   int temp=0;
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
				//temp=arr[top];
				//top--;
				temp=arr[top--];
		}
		return temp;
	}
	public int peek()
	{
	return arr[top];
	}

	public void displayarr()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]);
		}
	}
	


public static void main(String[] args)
{
	Stack s=new Stack(5);
	s.push(4);
	s.push(2);
	s.push(8);
	s.push(7);
	s.push(2);
	s.displayarr();
	s.push(9);
	System.out.println("--------------");
	s.pop();
	s.pop();
	s.pop();
	s.pop();
	s.displayarr();
	System.out.println("The top most element is::"+s.peek());
	System.out.println("--------------");
	s.pop();
	s.pop();
	s.displayarr();
	
}
}