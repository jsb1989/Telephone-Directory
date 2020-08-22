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
		
		/*
			Creation of Data structure to store contacts goes here
		*/
		
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
				//When the window is closed it will just close this window not the main one
				addcontactmenu.setDefaultCloseOperation(addcontactmenu.DISPOSE_ON_CLOSE);
				
				//Just shows the instruction at the top of the window
				JLabel ACMTitleLabel=new JLabel("Please add information for new contact");
				ACMTitleLabel.setBounds(90,10,350,30); 
				
				//Label for the text field to enter the contacts first name
				JLabel firstNameLabel=new JLabel("First Name:");
				firstNameLabel.setBounds(10,60,200,30);
				JTextField firstNameText=new JTextField();
				firstNameText.setBounds(115,60,300,30);
				
				//Label for the text field to enter the contacts last name
				JLabel lastNameLabel=new JLabel("Last Name:");
				lastNameLabel.setBounds(10,95,200,30);
				JTextField lastNameText=new JTextField();
				lastNameText.setBounds(115,95,300,30);
				
				//Label for the text field to enter the contacts phone number
				JLabel phoneNumberLabel=new JLabel("Phone Number:");
				phoneNumberLabel.setBounds(10,130,200,30);
				JTextField phoneNumberText=new JTextField();
				phoneNumberText.setBounds(125,130,290,30);
				
				//Label for the text field to enter the contacts school or workplace
				JLabel workSchoolLabel=new JLabel("Work or School:");
				workSchoolLabel.setBounds(10,165,200,30);
				JTextField workSchoolText=new JTextField();
				workSchoolText.setBounds(130,165,285,30);
				
				// When user clicks submit all the information put in each text field 
				// will be saved to the data structure storing contact information
				JButton ACSubmit=new JButton("Submit");
				ACSubmit.setBounds(10,200,200,30);
				ACSubmit.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
					
						/*
							Add Contact Function goes here
							This will take the string from each text field and pass it into the function
							which will add the information to the data structure
						*/
						
						addcontactmenu.dispose();
					}
				});
				
				//If user clicks the cancel button it will close this window and just show the main menu
				JButton ACCancel=new JButton("Cancel");
				ACCancel.setBounds(215,200,200,30);
				ACCancel.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						addcontactmenu.dispose();
					}
				});
				
				addcontactmenu.add(ACMTitleLabel);
				addcontactmenu.add(firstNameLabel);
				addcontactmenu.add(firstNameText);
				addcontactmenu.add(lastNameLabel);
				addcontactmenu.add(lastNameText);
				addcontactmenu.add(phoneNumberLabel);
				addcontactmenu.add(phoneNumberText);
				addcontactmenu.add(workSchoolLabel);
				addcontactmenu.add(workSchoolText);
				addcontactmenu.add(ACSubmit);
				addcontactmenu.add(ACCancel);
			}
		});
		
		//Deletes a choosen contact
		JButton DeleteContact=new JButton("Delete Contact");  
		DeleteContact.setBounds(215,60,200,30);
		DeleteContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame deletecontactmenu=new JFrame("Delete Contact");
				deletecontactmenu.setSize(450,600);  
				deletecontactmenu.setLayout(null);
				deletecontactmenu.setVisible(true);
				deletecontactmenu.setDefaultCloseOperation(deletecontactmenu.DISPOSE_ON_CLOSE);
				
				//Just shows the instruction at the top of the window
				JLabel ACMTitleLabel=new JLabel("Input information for the contact that will be deleted");
				ACMTitleLabel.setBounds(20,10,400,30); 
				
				//Label for the text field to enter the contacts first name
				JLabel firstNameLabel=new JLabel("First Name:");
				firstNameLabel.setBounds(10,60,200,30);
				JTextField firstNameText=new JTextField();
				firstNameText.setBounds(115,60,300,30);
				
				//Label for the text field to enter the contacts last name
				JLabel lastNameLabel=new JLabel("Last Name:");
				lastNameLabel.setBounds(10,95,200,30);
				JTextField lastNameText=new JTextField();
				lastNameText.setBounds(115,95,300,30);
				
				//Label for the text field to enter the contacts phone number
				JLabel phoneNumberLabel=new JLabel("Phone Number:");
				phoneNumberLabel.setBounds(10,130,200,30);
				JTextField phoneNumberText=new JTextField();
				phoneNumberText.setBounds(125,130,290,30);
				
				//Label for the text field to enter the contacts school or workplace
				JLabel workSchoolLabel=new JLabel("Work or School:");
				workSchoolLabel.setBounds(10,165,200,30);
				JTextField workSchoolText=new JTextField();
				workSchoolText.setBounds(130,165,285,30);
				//Submit button to process delete action
				JButton Submit=new JButton("Submit");
				Submit.setBounds(10,200,200,30);
				Submit.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
					
						/*
							Depending on the selected information it will delete the
							corresponding contact by passing the information to
							the delete function
						*/
						
						deletecontactmenu.dispose();
					}
				});
				
				//Cancel just in case user changes mind
				JButton Cancel=new JButton("Cancel");
				Cancel.setBounds(215,200,200,30);
				Cancel.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						deletecontactmenu.dispose();
					}
				});
				
				//Adding the buttons and fields to the Frame(window)
				deletecontactmenu.add(ACMTitleLabel);
				deletecontactmenu.add(firstNameLabel);
				deletecontactmenu.add(firstNameText);
				deletecontactmenu.add(lastNameLabel);
				deletecontactmenu.add(lastNameText);
				deletecontactmenu.add(phoneNumberLabel);
				deletecontactmenu.add(phoneNumberText);
				deletecontactmenu.add(workSchoolLabel);
				deletecontactmenu.add(workSchoolText);
				deletecontactmenu.add(Submit);
				deletecontactmenu.add(Cancel);
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
