class DoublyLinkedList
{
	DNode head;	
	DNode tail;
	int size;
	
	public DoublyLinkedList()
	{
		head=null;
		tail=null;
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
	
	


public void insertAtEnd(Object value) 
{
        DNode newNode = new DNode(value);
        
        if (head == null) 
		{
            head = newNode;
            tail = newNode; 
        } 
		else 
		{
            tail.next = newNode; 
            newNode.prev = tail;  
            tail = newNode;  
		}            
        size++; 
}
public void insertAtBeginning(Object value) 
{
        DNode newNode = new DNode(value);
       
        if (head == null) 
		{
            head = newNode;
            tail = newNode;
			head.next=null;
        } 
		else 
		{
            
            newNode.next = head; 
            head.prev = newNode; 
            head = newNode;     
        }
        size++; 
}
public void insertAfterNode(Object key, Object newValue) 
{
    DNode newNode = new DNode(newValue);

    if (isEmpty()) 
	{
        head = newNode;
        tail = newNode;
        return;
    }
    DNode currentNode1 = head;
    DNode currentNode2;

    while (currentNode1 != null) 
	{
        if (currentNode1.data.equals(key)) 
		{
            currentNode2 = currentNode1.next; 

            if (currentNode2 != null) 
			{
                currentNode2.prev = newNode; 
            } 
			else 
			{
                tail = newNode; 
            }
            newNode.prev = currentNode1; 
            newNode.next = currentNode2; 
            currentNode1.next = newNode; 
            
            size++; 
            System.out.println("Inserted " + newValue + " after " + key);
            return;
        }
 
        currentNode1 = currentNode1.next;
    }
    System.out.println("Given node " + key + " is not found in the list! Insertion not possible!");
}

public void insertAtIndex(Object newValue, int index) 
{
        DNode newNode = new DNode(newValue);

        if (index < 0 || index > size) 
		{
            System.out.println("Invalid index: " + index);
            return;
        }
        if (isEmpty()) 
		{
            head = newNode;
            tail = newNode;
        } 
		else if (index == 0) 
		{
            newNode.next = head; 
            head.prev = newNode; 
            head = newNode; 
        } 
		else if (index == size) 
		{
            tail.next = newNode; 
            newNode.prev = tail; 
            tail = newNode; 
        } 
		else 
		{
            DNode currentNode = head;
            for (int i = 0; i < index; i++) 
			{
                currentNode = currentNode.next; 
            }

            
            newNode.next = currentNode; 
            currentNode.prev.next = newNode; 
			newNode.prev = currentNode.prev; 
            currentNode.prev = newNode; 
        }

        // Increment the size of the list
        size++;
        System.out.println("Inserted " + newValue + " at index " + index);
}


public void insertBefore(Object key, Object newValue) 
{
    DNode newNode = new DNode(newValue);

    if (isEmpty()) 
	{
        System.out.println("\nLinked List is empty. " + newValue + " was not created.");
        return;
    }

    DNode currentNode = tail; 

    while (currentNode != null) 
	{
        if (currentNode.data.equals(key)) 
		{
            if (currentNode.prev == null) 
			{
                newNode.next = currentNode; 
                currentNode.prev = newNode; 
                head = newNode; 
            } 
			else 
			{
                newNode.prev = currentNode.prev; 
                newNode.next = currentNode; 
                currentNode.prev.next = newNode; 
                currentNode.prev = newNode; 
            }

            size++; 
            System.out.println("\nElement " + key + " was found. " + newValue + " was created.");
            return;
        }

        currentNode = currentNode.prev; 
    }

    System.out.println("\nElement " + key + " is not in the list. " + newValue + " was not created.");
    return; 
}


public Object deleteFirst() 
{
    if (isEmpty()) 
	{
        System.out.println("The list is empty");
        return null;
    }

    Object temp = head.data; 
	
    if (head.next == null) 
	{ 
        head = null; 
        tail = null; 
    } 
	else 
	{
        head = head.next; 
        head.prev = null; 
    }

    size--; 
    return temp; 
}

public Object deleteLast() 
{
    if (isEmpty()) 
	{
        System.out.println("The list is empty");
        return null; 
    }

    Object temp = tail.data; 

    if (head.next == null) 
	{ 
        head = null; 
        tail = null; 
    } 
	else 
	{
        tail = tail.prev; 
        tail.next = null; 
    }

    size--; 
    return temp; 
}

public Object remove(int i) 
{
    if (i < 0 || i >= size) 
	{ 
        System.out.println("Index " + i + " is out of bounds.");
        return null; 
    }

    Object retElt; 

    if (i == 0) 
	{
        retElt = head.data; 
        if (head == tail) 
		{ 
            head = null; 
            tail = null; 
        } 
		else 
		{
            head = head.next; 
            head.prev = null;
        }
    } 
	else 
	{
        DNode p = head; 
        for (int j = 0; j < i - 1; j++) 
		{
            p = p.next; 
        }
        retElt = p.next.data; 

        if (p.next == tail) 
		{ 
            tail = p; 
            tail.next = null; 
        } 
		else 
		{
            p.next = p.next.next; 
            p.next.prev = p; 
        }
    }

    size--; 
    return retElt; 
}

public Object getObject(int i) 
{
    if (i < 0 || i >= size) 
	{ 
        System.out.println(i + "th index is not found");
        return null; 
    }

    Object retElt; 

    if (i == 0) 
	{
        retElt = head.data; 
    } 
	else 
	{
        DNode p = head; 
        for (int j = 0; j < i; j++) 
		{
            p = p.next; 
        }
        retElt = p.data; 
    }

    return retElt; 
}

public int search(Object e) 
{
    int index = 0; 
    DNode p = head;

    while (p != null) 
	{ 
        if (p.data.equals(e)) 
		{ 
            return index; 
        }
        p = p.next; 
        index++; 
    }
    return -1; 
}

	
	public void printforward()
	{
		DNode currentnode=head;
		while(currentnode!=null)
		{
			System.out.print(currentnode.data+" ");
			currentnode=currentnode.next;
		}
		System.out.println();
	}
	
	public void printbackward()
	{
		DNode currentnode=tail;
		while(currentnode!=null)
		{
			System.out.print(currentnode.data+" ");
			currentnode=currentnode.prev;
		}
		System.out.println();
	}
}