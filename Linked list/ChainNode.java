class ChainNode
{
	Object data;      //store any data within the node
	ChainNode next;   //holds a reference to the next node
	
	ChainNode()    //This constructor initializes the node without any data or next node reference,leaving data and next as null.
	{
		
	}
	
	ChainNode(Object data)
	{
		this.data=data;
	}
	
	ChainNode(Object data,ChainNode next)
	{
		this.data=data;
		this.next=next;
	}
}