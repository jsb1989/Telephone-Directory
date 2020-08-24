public class Database{
  Node head;
  //Contents of a Doubly Linked List Node
  class Node { 
    String FirstName; 
    String LastName;
    String PhoneNumber;
    String Email;
    String WorkSchool;
    Node prev;
    Node next;
        //Constructor of a Doubly Linked List Node
        Node(String F,String L,String P,String E,String W){ 
          this.FirstName=F; 
          this.LastName=L;
          this.PhoneNumber=P;
          this.Email=E;
          this.WorkSchool=W;
        } 
    } 
}
