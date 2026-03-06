import java.util.*;
public class Queue 
{

int maxSize,rear=-1,front=-1,queueArray[],nItem;

    
Queue(int size)
    {
     maxSize=size;
     queueArray =new int [maxSize] ;      
    }

public void enqueue(int x) 
{
    if (isFull()) 
	{
        System.out.println("The queue is full");
    } 
	else 
	{
        if (rear==-1 && front==-1) 
		{
            front = 0;
            rear = 0;
        } 
		else 
		{
            rear = (rear + 1);
        }
        queueArray[rear] = x;
        nItem++;
    }
}
public int dequeue() 
{
    int tmp = -1;  

    if (isEmpty()) 
	{
        System.out.println("The queue is empty");
    } 
	else 
	{
        tmp = queueArray[front];  
		
        if (rear==front) 
		{
            front = -1; 
            rear = -1;
        } 
		else 
		{
            front = (front + 1);
        }
        nItem--;  
	}
    return tmp;
}

 
 public boolean isFull()
    { 
	return rear==maxSize-1; 
	}
 
 public boolean isEmpty()
{ 
	if(front==-1 && rear==-1)
	{
		return true;
	}
	else
	{
		return false;
	}
}
 
 public void displayQ()
{ 
	for(int i=front;i<=rear;i++)
	{
        System.out.print(queueArray[i]+" ");
    }
}
 
 
 public static void main(String args[])
	{
		Queue q1=new Queue(5);
		
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		
		
		q1.dequeue();
		q1.dequeue();

		q1.displayQ();

 

	}
}