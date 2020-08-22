import javax.swing.JFrame;
import javax.swing.JButton;
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
				//The printf is just a place holder until the function to add has been created
				System.out.printf("Add\n");
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
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
	}  
}
