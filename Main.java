import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;  

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {  
	public static void main(String[] args) { 
		//Title of the menu window 
		JFrame menu=new JFrame("Phone Directory");
		menu.setVisible(true); 
		
		Database database=new Database();
		
		JLabel Title=new JLabel("PHONE DIRECTORY");
		Title.setBounds(130,10,350,30);
		Title.setFont(new Font("Serif", Font.ITALIC, 18));
		
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
				addcontactmenu.setLocationRelativeTo(null);
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
				
				//Label for the text field to enter the contacts email
				JLabel emailLabel=new JLabel("Email:");
				emailLabel.setBounds(10,165,200,30);
				JTextField emailText=new JTextField();
				emailText.setBounds(130,165,285,30);
				
				//Label for the text field to enter the contacts school or workplace
				JLabel workSchoolLabel=new JLabel("Work or School:");
				workSchoolLabel.setBounds(10,200,200,30);
				JTextField workSchoolText=new JTextField();
				workSchoolText.setBounds(130,200,285,30);
				
				// When user clicks submit all the information put in each text field 
				// will be saved to the data structure storing contact information
				JButton ACSubmit=new JButton("Submit");
				ACSubmit.setBounds(10,235,200,30);
				ACSubmit.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
					//Once the submit button is clicked it will save the info from each field to a string
						String First_Name=firstNameText.getText();
						String Last_Name=lastNameText.getText();
						String Phone_Num=phoneNumberText.getText();
						String Email=emailText.getText();
						String Work_School=workSchoolText.getText();
						database.addContact(First_Name,Last_Name,Phone_Num,Email,Work_School);
						addcontactmenu.dispose();
					}
				});
				
				//If user clicks the cancel button it will close this window and just show the main menu
				JButton ACCancel=new JButton("Cancel");
				ACCancel.setBounds(215,235,200,30);
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
				addcontactmenu.add(emailLabel);
				addcontactmenu.add(emailText);
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
				deletecontactmenu.setSize(450,300);  
				deletecontactmenu.setLayout(null);
				deletecontactmenu.setVisible(true);
				deletecontactmenu.setLocationRelativeTo(null);
				deletecontactmenu.setDefaultCloseOperation(deletecontactmenu.DISPOSE_ON_CLOSE);
				
				//Just shows the instruction at the top of the window
				JLabel ACMTitleLabel=new JLabel("<HTML>Input the First & Last Name and Phone Number<BR> for the contact that will be deleted<HTML>");
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
				
				//Submit button to process delete action
				JButton Submit=new JButton("Submit");
				Submit.setBounds(10,235,200,30);
				Submit.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						//Once the submit button is clicked it will save the info from each field to a string
						String First_Name=firstNameText.getText();
						String Last_Name=lastNameText.getText();
						String Phone_Num=phoneNumberText.getText();
						database.delete(First_Name,Last_Name,Phone_Num);
						menu.setVisible(true);
						deletecontactmenu.dispose();
					}
				});
				
				//Cancel just in case user changes mind
				JButton Cancel=new JButton("Cancel");
				Cancel.setBounds(215,235,200,30);
				Cancel.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						menu.setVisible(true);
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
				deletecontactmenu.add(Submit);
				deletecontactmenu.add(Cancel);
			}
		});
		
		//Search for a contact
		JButton SearchContact=new JButton("Search Contact");  
		SearchContact.setBounds(10,95,200,30); 
		SearchContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame chooseContact = new JFrame();
				chooseContact.setSize(300,325);
				chooseContact.setLayout(null);
				chooseContact.setVisible(true);
				chooseContact.setLocationRelativeTo(null);
				chooseContact.setDefaultCloseOperation(chooseContact.DISPOSE_ON_CLOSE);
				
				//Instructions for user
				JLabel TitleLabel=new JLabel("How would you like to search?");
				TitleLabel.setBounds(20,5,250,30); 
				
				//The following are radio buttons to choose how the search will be performed
				JRadioButton FirstName = new JRadioButton("First name");
				FirstName.setBounds(10,30,150,30);
				
				JRadioButton LastName = new JRadioButton("Last name");
				LastName.setBounds(10,60,150,30);
				
				JRadioButton PhoneNumber = new JRadioButton("Phone Number");
				PhoneNumber.setBounds(10,90,150,30);
				
				JRadioButton Email = new JRadioButton("Email");
				Email.setBounds(10,120,150,30);
				
				JRadioButton WorkSchool = new JRadioButton("Work or School");
				WorkSchool.setBounds(10,150,150,30);
				
				//Groups the buttons together
				ButtonGroup group = new ButtonGroup();
					group.add(FirstName);
					group.add(LastName);
					group.add(PhoneNumber);
					group.add(Email);
					group.add(WorkSchool);
					
				//Submit button to process search choice
				JButton Submit=new JButton("Submit");
				Submit.setBounds(10,190,200,30);
				Submit.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						int search=0;
						String toSearch= " ";
						//Temp database that saves the searched content
						Database searchDatabase = new Database();

						//Based on the users selection a message will pop up asking for the using to input what to search for
						if(FirstName.isSelected()){
							search=0;
							toSearch=JOptionPane.showInputDialog("What first name would you like to search?");
							for(int i=0; i<database.size(); i++){
								if((database.getFirstName(i)).equals(toSearch)){
									searchDatabase.addContact(database.getFirstName(i),database.getLastName(i),database.getPhoneNumber(i),database.getEmail(i),database.getWorkSchool(i));
								}
							}
							searchDatabase.sortDatabase(1);
						}
						if(LastName.isSelected()){
							search=1;
							toSearch=JOptionPane.showInputDialog("What last name would you like to search?");
							for(int i=0; i<database.size(); i++){
								if((database.getLastName(i)).equals(toSearch)){
									searchDatabase.addContact(database.getFirstName(i),database.getLastName(i),database.getPhoneNumber(i),database.getEmail(i),database.getWorkSchool(i));
								}
							}
							searchDatabase.sortDatabase(0);
						}
						if(PhoneNumber.isSelected()){
							search=2;
							toSearch=JOptionPane.showInputDialog("What phone number would you like to search?");
							for(int i=0; i<database.size(); i++){
								if((database.getPhoneNumber(i)).equals(toSearch)){
									searchDatabase.addContact(database.getFirstName(i),database.getLastName(i),database.getPhoneNumber(i),database.getEmail(i),database.getWorkSchool(i));
								}
							}
							searchDatabase.sortDatabase(1);
						}
						if(Email.isSelected()){
							search=3;
							toSearch=JOptionPane.showInputDialog("What email would you like to search?");
							for(int i=0; i<database.size(); i++){
								if((database.getEmail(i)).equals(toSearch)){
									searchDatabase.addContact(database.getFirstName(i),database.getLastName(i),database.getPhoneNumber(i),database.getEmail(i),database.getWorkSchool(i));
								}
							}
							searchDatabase.sortDatabase(1);
						}
						if(WorkSchool.isSelected()){
							search=4;
							toSearch=JOptionPane.showInputDialog("What school or workplace would you like to search?");
							for(int i=0; i<database.size(); i++){
								if((database.getWorkSchool(i)).equals(toSearch)){
									searchDatabase.addContact(database.getFirstName(i),database.getLastName(i),database.getPhoneNumber(i),database.getEmail(i),database.getWorkSchool(i));
								}
							}
							searchDatabase.sortDatabase(1);
						}
						
						JFrame displaySorted = new JFrame("Matching Contacts");
						displaySorted.setSize(600,425);
						displaySorted.setLayout(null);
						displaySorted.setVisible(true);
						displaySorted.setLocationRelativeTo(null);
						displaySorted.setDefaultCloseOperation(chooseContact.DISPOSE_ON_CLOSE);

						JLabel TitleDisplay=new JLabel("Matching Contacts");
						TitleDisplay.setBounds(100,2,250,30);
						displaySorted.getContentPane().setLayout(new FlowLayout());    
        					JTextArea textArea = new JTextArea(20, 50);  
        					textArea.setEditable(false);
        					JScrollPane scrollableTextArea = new JScrollPane(textArea);  
        					scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        					scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

  						//This will add all of the database to the textArea to display it to the user
						for(int i=0; i<searchDatabase.size(); i++){  
        						textArea.append(searchDatabase.getFirstName(i)+" "+searchDatabase.getLastName(i)+"      "+searchDatabase.getPhoneNumber(i)+"        "+searchDatabase.getEmail(i)+"         "+searchDatabase.getWorkSchool(i)+"\n");
						}

						//Button for user to press when they are finished looking at the contacts
        					JButton Finish=new JButton("FINISHED");
						Finish.setBounds(100,380,200,30);
						Finish.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								searchDatabase.deleteAll();
								displaySorted.dispose();
								chooseContact.dispose();
							}
						});  
						displaySorted.add(TitleDisplay);
						displaySorted.getContentPane().add(scrollableTextArea);
						displaySorted.add(Finish);
					}
				});
				
				//Cancel just in case user changes mind
				JButton Cancel=new JButton("Cancel");
				Cancel.setBounds(10,240,200,30);
				Cancel.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						chooseContact.dispose();
					}
				});	
				//Add all features to the window(Jframe)
				chooseContact.add(FirstName);	
				chooseContact.add(LastName);
				chooseContact.add(PhoneNumber);
				chooseContact.add(Email);
				chooseContact.add(WorkSchool);
				chooseContact.add(TitleLabel);
				chooseContact.add(Submit);
				chooseContact.add(Cancel);
			}
		});
		
		//Shows possible contacts
		JButton PossibleContact=new JButton("Possible Contacts");  
		PossibleContact.setBounds(215,95,200,30);
		PossibleContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(menu,"FUNCTION NOT YET AVAILABLE");
			}
		});
		
		//Displays all contacts which will be sorted and displayed as requested by user
		JButton DisplayContact=new JButton("Display all contacts sorted by");  
		DisplayContact.setBounds(55,130,300,30);
		DisplayContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame displayChoice = new JFrame("Display");
				displayChoice.setSize(300,325);
				displayChoice.setLayout(null);
				displayChoice.setVisible(true);
				displayChoice.setLocationRelativeTo(null);
				displayChoice.setDefaultCloseOperation(displayChoice.DISPOSE_ON_CLOSE);
				
				//Instructions for user
				JLabel TitleLabel=new JLabel("How would you like to display by");
				TitleLabel.setBounds(20,5,250,30); 
				
				//The following are radio buttons to choose how the sorting will be performed
				JRadioButton FirstName = new JRadioButton("First name");
				FirstName.setBounds(10,30,150,30);
				
				JRadioButton LastName = new JRadioButton("Last name");
				LastName.setBounds(10,60,150,30);
				
				JRadioButton PhoneNumber = new JRadioButton("Phone Number");
				PhoneNumber.setBounds(10,90,150,30);
				
				JRadioButton Email = new JRadioButton("Email");
				Email.setBounds(10,120,150,30);
				
				JRadioButton WorkSchool = new JRadioButton("Work or School");
				WorkSchool.setBounds(10,150,150,30);
				
				//Groups the buttons together
				ButtonGroup group = new ButtonGroup();
					group.add(FirstName);
					group.add(LastName);
					group.add(PhoneNumber);
					group.add(Email);
					group.add(WorkSchool);
					
				//Submit button to process sorting choice
				JButton Submit=new JButton("Submit");
				Submit.setBounds(10,190,200,30);
				Submit.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						int sort=0;
						if(FirstName.isSelected()){
							sort=0;
						}
						if(LastName.isSelected()){
							sort=1;
						}
						if(PhoneNumber.isSelected()){
							sort=2;
						}
						if(Email.isSelected()){
							sort=3;
						}
						if(WorkSchool.isSelected()){
							sort=4;
						}
						database.sortDatabase(sort);

						JFrame displaySorted = new JFrame("Sorted Display");
						displaySorted.setSize(600,425);
						displaySorted.setLayout(null);
						displaySorted.setVisible(true);
						displaySorted.setLocationRelativeTo(null);
						displaySorted.setDefaultCloseOperation(displayChoice.DISPOSE_ON_CLOSE);
						JLabel TitleDisplay=new JLabel("Sorted Contacts");
						TitleDisplay.setBounds(100,2,250,30);
						displaySorted.getContentPane().setLayout(new FlowLayout());    
        					JTextArea textArea = new JTextArea(20, 50);  
        					textArea.setEditable(false);

						//This will add all of the database to the textArea to display it to the user
        					for(int i=0; i<database.size(); i++){  
        						textArea.append(database.getFirstName(i)+" "+database.getLastName(i)+"      "+database.getPhoneNumber(i)+"        "+database.getEmail(i)+"         "+database.getWorkSchool(i)+"\n");
						}

        					JScrollPane scrollableTextArea = new JScrollPane(textArea);  
        					scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        					scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  

						//Button for user to press when they are finished looking at the contacts
        					JButton Finish=new JButton("FINISHED");
						Finish.setBounds(100,380,200,30);
						Finish.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								displayChoice.dispose();
								displaySorted.dispose();
							}
						});  
						displaySorted.add(TitleDisplay);
						displaySorted.getContentPane().add(scrollableTextArea);
						displaySorted.add(Finish);
					}
				});
				
				//Cancel just in case user changes mind
				JButton Cancel=new JButton("Cancel");
				Cancel.setBounds(10,240,200,30);
				Cancel.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						displayChoice.dispose();
					}
				});
					
				//Add all features to the window(Jframe)
				displayChoice.add(FirstName);	
				displayChoice.add(LastName);
				displayChoice.add(PhoneNumber);
				displayChoice.add(Email);
				displayChoice.add(WorkSchool);
				displayChoice.add(TitleLabel);
				displayChoice.add(Submit);
				displayChoice.add(Cancel);
			}
		});
		
		menu.add(Title);
		menu.add(AddContact);  
		menu.add(DeleteContact);
		menu.add(SearchContact);
		menu.add(PossibleContact);
		menu.add(DisplayContact);
		menu.setSize(425,215);
		menu.setLayout(null);
		menu.setVisible(true); 
		menu.setLocationRelativeTo(null); 
		menu.setDefaultCloseOperation(menu.EXIT_ON_CLOSE);     
	}  
}
