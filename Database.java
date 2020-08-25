public class Database{
	  Node head;
	  
	  //Contents of a Doubly Linked List Node
	  class Node { 
		  String FirstName; 
		  String LastName;
		  String PhoneNumber;
		  String Email;
		  String WorkSchool;
		  String data;
		  Node prev;
		  Node next;
	      //Constructor of a Doubly Linked List Node
	      
		  Node(String F, String L, String P, String E, String W){ 
			  this.FirstName=F; 
	          	this.LastName=L;
	          	this.PhoneNumber=P;
	          	this.Email=E;
	          	this.WorkSchool=W;
		} 
	}

	//Adds contact info to the database
	public void addContact(String F, String L, String P, String E, String W){
		Node newNode= new Node(F,L,P,E,W);
		newNode.next=head;
		head=newNode;
	}
	
	//Returns size of the linked list
	public int size(){
		Node current=head;
		int count=0;
		while(current!=null){
			count++;
			current=current.next;
		}
		return count;
	}

	//Returns the First Name of a database entry
	public String getFirstName(int index){
		Node current=head;
		int count=0;
		while(current!=null){
			if(count==index){
				return current.FirstName;
			}
			count++;
			current=current.next;
		}
		return "No Contacts";
	}

	//Returns the Last Name of a database entry
	public String getLastName(int index){
		Node current=head;
		int count=0;
		while(current!=null){
			if(count==index){
				return current.LastName;
			}
			count++;
			current=current.next;
		}
		return "                      ";
	}

	//Returns the Phone number of a database entry
	public String getPhoneNumber(int index){
		Node current=head;
		int count=0;
		while(current!=null){
			if(count==index){
				return current.PhoneNumber;
			}
			count++;
			current=current.next;
		}
		return "                      ";
	}

	//Returns the Email of a database entry
	public String getEmail(int index){
		Node current=head;
		int count=0;
		while(current!=null){
			if(count==index){
				return current.Email;
			}
			count++;
			current=current.next;
		}
		return "                      ";
	}

	//Returns the Work or School of a database entry
	public String getWorkSchool(int index){
		Node current=head;
		int count=0;
		while(current!=null){
			if(count==index){
				return current.WorkSchool;
			}
			count++;
			current=current.next;
		}
		return "                      ";
	}

	//Method that will sort the database based on the users choice
	public void sortDatabase(int Choice){
		switch(Choice){
			case 0:
				Node current=null;
				Node index=null;
				String temp=" ";
				if(head==null){
					return;
				}else{
					for(current=head; current.next!=null;current=current.next){
						for(index=current.next; index!=null; index=index.next){
							if(((current.FirstName).compareTo(index.FirstName))>0){
								temp=current.FirstName;
								current.FirstName=index.FirstName;
								index.FirstName=temp;
								
								temp=current.LastName;
								current.LastName=index.LastName;
								index.LastName=temp;

								temp=current.PhoneNumber;
								current.PhoneNumber=index.PhoneNumber;
								index.PhoneNumber=temp;
	
								temp=current.Email;
								current.Email=index.Email;
								index.Email=temp;

								temp=current.WorkSchool;
								current.WorkSchool=index.WorkSchool;
								index.WorkSchool=temp;
							}
						}
					}
				}	
				break;
			case 1:
				current=null;
				index=null;
				temp=" ";
				if(head==null){
					return;
				}else{
					for(current=head; current.next!=null;current=current.next){
						for(index=current.next; index!=null; index=index.next){
							if(((current.LastName).compareTo(index.LastName))>0){
								temp=current.FirstName;
								current.FirstName=index.FirstName;
								index.FirstName=temp;
								
								temp=current.LastName;
								current.LastName=index.LastName;
								index.LastName=temp;

								temp=current.PhoneNumber;
								current.PhoneNumber=index.PhoneNumber;
								index.PhoneNumber=temp;
	
								temp=current.Email;
								current.Email=index.Email;
								index.Email=temp;

								temp=current.WorkSchool;
								current.WorkSchool=index.WorkSchool;
								index.WorkSchool=temp;
							}
						}
					}
				}
				break;
			case 2:
				current=null;
				index=null;
				temp=" ";
				if(head==null){
					return;
				}else{
					for(current=head; current.next!=null;current=current.next){
						for(index=current.next; index!=null; index=index.next){
							if(((current.PhoneNumber).compareTo(index.PhoneNumber))>0){
								temp=current.FirstName;
								current.FirstName=index.FirstName;
								index.FirstName=temp;
								
								temp=current.LastName;
								current.LastName=index.LastName;
								index.LastName=temp;

								temp=current.PhoneNumber;
								current.PhoneNumber=index.PhoneNumber;
								index.PhoneNumber=temp;
	
								temp=current.Email;
								current.Email=index.Email;
								index.Email=temp;

								temp=current.WorkSchool;
								current.WorkSchool=index.WorkSchool;
								index.WorkSchool=temp;
							}
						}
					}
				}
				break;
			case 3:
				current=null;
				index=null;
				temp=" ";
				if(head==null){
					return;
				}else{
					for(current=head; current.next!=null;current=current.next){
						for(index=current.next; index!=null; index=index.next){
							if(((current.Email).compareTo(index.Email))>0){
								temp=current.FirstName;
								current.FirstName=index.FirstName;
								index.FirstName=temp;
								
								temp=current.LastName;
								current.LastName=index.LastName;
								index.LastName=temp;

								temp=current.PhoneNumber;
								current.PhoneNumber=index.PhoneNumber;
								index.PhoneNumber=temp;
	
								temp=current.Email;
								current.Email=index.Email;
								index.Email=temp;

								temp=current.WorkSchool;
								current.WorkSchool=index.WorkSchool;
								index.WorkSchool=temp;
							}
						}
					}
				}
				break;
			case 4:
				current=null;
				index=null;
				temp=" ";
				if(head==null){
					return;
				}else{
					for(current=head; current.next!=null;current=current.next){
						for(index=current.next; index!=null; index=index.next){
							if(((current.WorkSchool).compareTo(index.WorkSchool))>0){
								temp=current.FirstName;
								current.FirstName=index.FirstName;
								index.FirstName=temp;
								
								temp=current.LastName;
								current.LastName=index.LastName;
								index.LastName=temp;

								temp=current.PhoneNumber;
								current.PhoneNumber=index.PhoneNumber;
								index.PhoneNumber=temp;
	
								temp=current.Email;
								current.Email=index.Email;
								index.Email=temp;

								temp=current.WorkSchool;
								current.WorkSchool=index.WorkSchool;
								index.WorkSchool=temp;
							}
						}
					}
				}
				break;
		}
	}

	//Method that deletes a database
	public void deleteAll(){
			head=null;
	}

	//Method that will delete a certain entry of the database
	public void delete(String F, String L,String P){
		Node current=head;
		while(current!=null){
			if(F.equals(current.FirstName)&&L.equals(current.LastName)&&P.equals(current.PhoneNumber)){
				if(current==head){
					head=current.next;
				}
				if(current.next!=null){
					current.next.prev=current.prev;
				}
				if(current.prev!=null){
					current.prev.next=current.next;
				}
			return;
			}
			current=current.next;
		}
	}
}
