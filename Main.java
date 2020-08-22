import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {  
	public static void main(String[] args) { 
		//Title of the menu window 
		JFrame menu=new JFrame("Phone Directory");
		   
		//Adds contact to directory   
		JButton AddContact=new JButton("Add Contact");  
		AddContact.setBounds(10,60,200,30); 
		AddContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//Creates new window which will have fields to add information for new contact
				JFrame addcontactmenu=new JFrame("Add Contact");
				addcontactmenu.setSize(450,600);  
				addcontactmenu.setLayout(null);
				addcontactmenu.setVisible(true); 
				addcontactmenu.setDefaultCloseOperation(addcontactmenu.EXIT_ON_CLOSE); 
				JTextField firstNameText,lastNameText,phoneNumberText;
				JLabel firstNameLabel,lastNameLabel,phoneNumberLabel;
				firstNameLabel=new Jlabel("First Name:");
				
				lastNameLabel=new Jlabel("Last Name:");
				
				phoneNumberLabel=new Jlabel("Phone Number:");
				
				JButton ACSubmit=new JButton("Submit");
				
				JButton ACCancel=new JButton("Cancel");
			}
		});
		
		//Deletes a choosen contact
		JButton DeleteContact=new JButton("Delete Contact");  
		DeleteContact.setBounds(215,60,200,30);
		DeleteContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//The printf is just a place holder until the function to delete has been created
				System.out.printf("Delete\n");
			}
		});
		
		//Search for a contact
		JButton SearchContact=new JButton("Search Contact");  
		SearchContact.setBounds(10,95,200,30); 
		SearchContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//The printf is just a place holder until the function to search has been created
				System.out.printf("Search\n");
			}
		});
		
		//Shows possible contacts
		JButton PossibleContact=new JButton("Possible Contacts");  
		PossibleContact.setBounds(215,95,200,30);
		PossibleContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//The printf is just a place holder until the function to show possible contacts has been created
				System.out.printf("Poss\n");
			}
		});
		
		//Displays all contacts which will be sorted and displayed as requested by user
		JButton DisplayContact=new JButton("Display all contacts sorted by");  
		DisplayContact.setBounds(55,130,300,30);
		DisplayContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//The printf is just a place holder until the function to display and sort has been created
				System.out.printf("Dis\n");
			}
		});
		
		menu.add(AddContact);  
		menu.add(DeleteContact);
		menu.add(SearchContact);
		menu.add(PossibleContact);
		menu.add(DisplayContact);
		menu.setSize(450,600);  
		menu.setLayout(null);
		menu.setVisible(true); 
		menu.setDefaultCloseOperation(menu.EXIT_ON_CLOSE);     
	}  
}
