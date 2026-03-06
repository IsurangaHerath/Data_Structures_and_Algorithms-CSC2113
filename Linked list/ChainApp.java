class ChainApp
{
	public static void main(String arg[])
	{
		Chain c=new Chain(); 
		c.insertfront(6);
		c.insertfront(7);
		c.insertfront(8);
		c.displayList();
		c.insertAtIndex(15,1);
		c.displayList();
		
	
	    c.deleteAtPosition(1);
		c.displayList();
		
		c.insertAfter(7,19);
		c.displayList();
		
		c.insertBefore(19,35);
		c.displayList();
		
		c.remove(6);
		c.displayList(); 

	}
}

