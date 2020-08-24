class Node {
	
	Node next;		// pointer to the next node
	Object data;	// value of the data
	
	/**
	 * Check data and next.
	 * 
	 * @param data
	 */
	
	public Node(Object data) {
		
		this.data = data;
		this.next = null;
		
	}
	
}

public class Deletion {

	Node head;		// head of the list - first element
	
	public Deletion(){
		//empty
		
	}
	
	public Deletion(Object firstName, Object lastName, Object phoneNumber, Object place, Object email) {
		deleteFirstName(firstName);
		deleteLastName(lastName, position(firstName)); // delete last name base on the position of first name
		deletePhoneNumber(phoneNumber);
		deleteWorkSchool(place);
		deleteEmail(email);
		
	}
	
	// Delete first name within the linked list
	public void deleteFirstName(Object firstName) {
		int count = 1; 		
		Node previous = head;	// temporary node to point head
		
		if(head == null) { 		// check to see if it's an empty list
			return;
			
		}
		
		if(countProduct() == 1 && head == firstName) {// check to see if there's only one element in the list	

			head = null;
			return;
			
		}
		
		if(position(firstName) == 1) {		// condition when user wants to delete the first element in the list
			
			head = previous.next;
			return;
			
		}
		
		while(count < position(firstName)-1) {// delete element at the given position
			
			previous = previous.next;
			count++;
			
		}
		
		Node current = previous.next;
		previous.next = current.next;
		current.next = null;
		
	}
	
	// Delete last name within the linked list
	public void deleteLastName(Object lastName, int position) {
		int count = 1; 	
		Node previous = head;	// temporary node to point head
		
		if(head == null) { 		// check to see if it's an empty list
			return;
			
		}
		
		if(countProduct() == 1 && head == lastName) {// check to see if there's only one element in the list	

			head = null;
			return;
			
		}
		
		if(position == 1) {		// condition when user wants to delete the first element in the list
			
			head = previous.next;
			return;
			
		}
		
		while(count < position -1) {// delete element at the given position
			
			previous = previous.next;
			count++;
			
		}
		
		Node current = previous.next;
		previous.next = current.next;
		current.next = null;
		
	}
	
	// Delete phone number within the linked list
	public void deletePhoneNumber(Object phoneNumber) {
		int count = 1; 	
		Node previous = head;	// temporary node to point head
		
		if(head == null) { 		// check to see if it's an empty list
			return;
			
		}
		
		if(countProduct() == 1 && head == phoneNumber) {// check to see if there's only one element in the list	

			head = null;
			return;
			
		}
		
		if(position(phoneNumber) == 1) {		// condition when user wants to delete the first element in the list
			
			head = previous.next;
			return;
			
		}
		
		while(count < position(phoneNumber)-1) {// delete element at the given position
			
			previous = previous.next;
			count++;
			
		}
		
		Node current = previous.next;
		previous.next = current.next;
		current.next = null;
		
	}
	
	// Delete work place or school within the linked list
	public void deleteWorkSchool(Object place) {
		int count = 1; 	
		Node previous = head;	// temporary node to point head
		
		if(head == null) { 		// check to see if it's an empty list
			return;
			
		}
		
		if(countProduct() == 1 && head == place) {// check to see if there's only one element in the list	

			head = null;
			return;
			
		}
		
		if(position(place) == 1) {		// condition when user wants to delete the first element in the list
			
			head = previous.next;
			return;
			
		}	
		
		while(count < position(place)-1) {// delete element at the given position
			
			previous = previous.next;
			count++;
			
		}
		
		Node current = previous.next;
		previous.next = current.next;
		current.next = null;
		
	}
	
	// Delete email within the linked list
	public void deleteEmail(Object email) {
		int count = 1; 	
		Node previous = head;	// temporary node to point head
		
		if(head == null) { 		// check to see if it's an empty list
			return;
			
		}
		
		if(countProduct() == 1 && head == email) {// check to see if there's only one element in the list	

			head = null;
			return;
			
		}
		
		if(position(email) == 1) {		// condition when user wants to delete the first element in the list
			
			head = previous.next;
			return;
			
		}
		
		while(count < position(email)-1) {// delete element at the given position
			
			previous = previous.next;
			count++;
			
		}
		
		Node current = previous.next;
		previous.next = current.next;
		current.next = null;
		
	}
	
	/**
	 * Delete node at a given position.
	 * 
	 * Check if it's an empty linked list.
	 * Check if there's only one element within the linked list.
	 * If so then just delete the whole linked list.
	 * 
	 * Special condition when user wants to delete the first element of the linked list.
	 * Set the first element as the second element within the linked list.
	 * Automatically delete set the first element to null.
	 * 
	 * Normal case count to the position then delete the element at the position.
	 * 
	 * @param position
	 */
	
	public void deleteAt(int position) {		
		int count = 1; 			
		Node previous = head;	// temporary node to point head
		
		if(head == null) { 		// check to see if it's an empty list
			
			return;
			
		}
		
		if(countProduct() == 1) {// check to see if there's only one element in the list	

			head = null;
			return;
			
		}
		
		if(position == 1) {		// condition when user wants to delete the first element in the list
			
			head = previous.next;
			return;
			
		}
		

		while(count < position-1) {// delete element at the given position
			
			previous = previous.next;
			count++;
			
		}
		
		Node current = previous.next;
		previous.next = current.next;
		current.next = null;
		
	}
	
	/**
	 * Count the total of element within the linked list.
	 * 
	 * When linked list is not empty, run the linked list.
	 * Then start counting the element.
	 * 
	 * @return count
	 */
	
	public int countProduct() {
		
		int count = 0;
		Node current = head;	// temporary node to point head
		
		while(current != null) {// while not an empty list
			
			count++;
			current = current.next; // count the element
			
		}
		
		return count;
		
	}
	
	public int position(Object element) {
		
		int position = 0;
		Node current = head;	// temporary node to point head
		
		while(current != element) {// while not an empty list
			
			position++;
			current = current.next; // count the element
			
		}
		position++;
		
		return position;
		
	}
	
}
