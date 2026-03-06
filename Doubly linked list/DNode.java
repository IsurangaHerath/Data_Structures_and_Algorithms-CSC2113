class DNode
{
	Object data;
	DNode next;
	DNode prev;
	
	public DNode(Object data)
	{
		this.data=data;
	}
	
	public DNode(Object d,DNode p,DNode n){
		this.data=d;
		this.prev=p;
		this.next=n;
	}
}