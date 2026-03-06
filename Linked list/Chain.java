class Chain
{
	private ChainNode head;
	private int size;
	
	public Chain()
	{
		head=null;
		size=0;
	}
	
	public boolean isEmpty()
	{
		return (head==null);
	}
	
	public int size()
	{
		return size;
	}
	
public void insertfront(Object data)
{
	ChainNode new_node=new ChainNode(data);
	
	if(isEmpty())
	{
		head=new_node;
		head.next=null;
		size++;
	}
	else
	{
		new_node.next=head;
		head=new_node;
		size++;
	}
}

public void insertlast(Object data)
{
	ChainNode new_node=new ChainNode(data);
	
	if(isEmpty())
	{
		head=new_node;
		head.next=null;
		size++;
	}
	else
	{
		ChainNode current_node=head;
		while(current_node.next != null)
		{
			current_node=current_node.next;
		}
		current_node.next=new_node;
		new_node.next=null;
		size++;
	}
}

public void insertAtIndex(Object data, int index) 
{
    ChainNode new_node = new ChainNode(data);
	
	if(index<0 || index>size-1)
	{
		System.out.println("Invalid index");
	}
	else if(index==0)
	{
		insertfront(data);
    }
	else
	{
    ChainNode current_node = head;
    for(int i=0; i< index-1; i++) 
	{
        current_node = current_node.next;
    }
    new_node.next = current_node.next;
    current_node.next = new_node;
	size++;
	}
}

public Object removefront()
{
	Object temp=null;
	
	if(isEmpty())
	{
		System.out.print("Nothing to remove");
	}
	else
	{
		temp=head.data;
		head=head.next;
		size--;
	}
	return temp;
}

public Object removeLast() 
{
    Object temp = null;
	
    if (isEmpty()) 
	{
        System.out.println("Nothing to remove");
    }
    else if (head.next == null) 
	{
        temp = head.data;
        head = null; 
		size--;
    }
    else 
	{
        ChainNode current_node = head;

        while (current_node.next.next != null) 
		{
            current_node = current_node.next;
        }
        temp = current_node.next.data;
        current_node.next = null;
		size--;
    }
    return temp;
}
public Object deleteAtPosition(int index) 
{
	Object deletedData=null;
   
    if (index >size-1 || index < 0) 
	{
        System.out.println("Invalid index");
    }

    else if (index == 0) 
	{
		removefront();
    }
	else
	{
    ChainNode currNode = head;

	for(int i=0; i<index-1; i++)
	{           
        currNode = currNode.next;     
    }

    deletedData = currNode.next.data;
    currNode.next=currNode.next.next; 
    System.out.println("Element at index " + index + " deleted.");
	size--;
	}
	return deletedData;
}

public int getindex(Object data)
{
	ChainNode current_node=head;
	int index=0;
	
	while(current_node.next!=null && current_node.data!=data)
	{
		current_node=current_node.next;
		index=index+1;
	}
	if(current_node.data==data)
	{
		return index;
	}
	else
	{
		return -1;
	}
}

public Object getdata(int index)
{
	if(index<0 && index>=size)
	{
		System.out.println("Error in Index");
		return null;
	}
	else
	{	
		ChainNode current_node=head;
		
		for(int i=0; i<index; i++)
		{
			current_node=current_node.next;
		}
		return current_node.data;
	}
}

public void insertAfter(Object key, Object toInsert) 
{
    ChainNode current_node = head;
 
    while (current_node != null && !current_node.data.equals(key)) 
	{
        current_node = current_node.next;
    }
    if (current_node != null) 
	{
        ChainNode new_node = new ChainNode(toInsert);
        new_node.next = current_node.next;
        current_node.next = new_node;
        size++;
    } 
	else 
	{
        System.out.println("Key not found in the list.");
    }
}

public void insertBefore(Object key, Object toInsert) 
{

    if (head == null) 
	{
        System.out.println("The list is empty.");
        return;
    }
    
    if (head.data.equals(key)) 
	{
        insertfront(toInsert); 
        return;
    }
    ChainNode prev_node = null;
    ChainNode current_node = head;
    
    while (current_node != null && !current_node.data.equals(key)) 
	{
        prev_node = current_node;
        current_node = current_node.next;
    }
    
    if (current_node != null) 
	{
        ChainNode new_node = new ChainNode(toInsert);
        new_node.next = current_node;
        prev_node.next = new_node;
        size++;
    } 
	else 
	{
        System.out.println("Key not found in the list.");
    }
}

public void remove(Object key) 
{
    
    if (head == null) 
	{
        throw new RuntimeException("Cannot delete from an empty list.");
    }
   
    if (head.data.equals(key)) 
	{
        head = head.next;
        size--;
        return;
    }
  
    ChainNode current_node = head;
    ChainNode prev_node = null;
    
    while (current_node != null && !current_node.data.equals(key)) 
	{
        prev_node = current_node;
        current_node = current_node.next;
    }
    
    if (current_node == null) 
	{
        throw new RuntimeException("Key not found. Cannot delete.");
    }
   
    prev_node.next = current_node.next;
    size--;
}

	public void displayList() 
	{
		System.out.print("List (first-->last): ");
		ChainNode current_node = head;
			while (current_node != null) 
			{
				System.out.print(current_node.data + " ");
				current_node = current_node.next;
			}
    System.out.print("\n"); 
	}

}
