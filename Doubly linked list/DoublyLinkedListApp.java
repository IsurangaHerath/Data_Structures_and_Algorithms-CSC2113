class DoublyLinkedListApp
{
	public static void main(String ar[])
	{
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.insertAtBeginning(1);
		dll.insertAtBeginning(2);
		dll.insertAtBeginning(3);
		dll.printforward();
		System.out.println("size is: "+dll.size());
		dll.insertAtEnd(4);
		dll.insertAtEnd(5);
		dll.printforward();
		dll.insertBefore(1,67);
			dll.printforward();
			System.out.println("size is: "+dll.size());
			dll.deleteFirst();
			dll.printforward();
			System.out.println("size is: "+dll.size());
			dll.deleteLast();
			dll.printforward();
			System.out.println("size is: "+dll.size());
			dll.remove(0);
			dll.printforward();
			System.out.println("size is: "+dll.size());
			
			dll.remove(-1);
			dll.printforward();
			System.out.println("size is: "+dll.size());
			
			dll.remove(2);
			dll.printforward();
			System.out.println("size is: "+dll.size());
	dll.printbackward();
			

/* 		
		dll.insertAtPosition(0,7);
		dll.insertAtPosition(1,5);
		dll.insertAtPosition(2,6);
		dll.insertAtPosition(3,8);
				dll.printforward();
		dll.insertFirst(11);
				System.out.println("size is: "+dll.size());

		dll.printforward();
		//dll.printbackward();
		dll.deleteAtIndex(3);
				System.out.println("size is: "+dll.size());

		dll.printforward();
		dll.deleteLast();
				System.out.println("size is: "+dll.size());

		dll.printforward();
				dll.deleteFirst();
		dll.printforward();
		System.out.println("size is: "+dll.size());
		dll.insertAtPosition(1,4); */
		

	}
}

/* 		dll.deleteLast();
		dll.printbackward(); */