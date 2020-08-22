import javax.swing.JFrame;
import javax.swing.JButton;

public class Main {  
	public static void main(String[] args) {  
		JFrame menu=new JFrame("Phone Directory");
		
		   
		     
		JButton AddContact=new JButton("Add Contact");  
		AddContact.setBounds(10,60,200,30); 
		
		JButton DeleteContact=new JButton("Delete Contact");  
		DeleteContact.setBounds(215,60,200,30);
		
		JButton SearchContact=new JButton("Search Contact");  
		SearchContact.setBounds(10,95,200,30); 
		
		JButton PossibleContact=new JButton("Possible Contacts");  
		PossibleContact.setBounds(215,95,200,30);
		
		JButton DisplayContact=new JButton("Display all contacts sorted by");  
		DisplayContact.setBounds(55,130,300,30);
		
		menu.add(title);
		menu.add(AddContact);  
		menu.add(DeleteContact);
		menu.add(SearchContact);
		menu.add(PossibleContact);
		menu.add(DisplayContact);
		menu.setSize(450,600);  
		menu.setLayout(null);
		menu.setVisible(true); 
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
	}  
}
