package cbot;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import java.util.Random;

public class ChatBot extends JFrame {

	private JPanel contentPane;
	public JTextArea Chatarea=new JTextArea();
	public JTextField Chatbox=new JTextField();

	public ChatBot() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 75, 477, 313);
		contentPane.add(scrollPane);
		Chatarea.setFont(new Font("Courier New", Font.BOLD, 18));
		Chatarea.append("Hello user Shalvi Chougule! \nThis is your irequest assistant");
		
		
		scrollPane.setViewportView(Chatarea);
		
		JLabel lblNewLabel = new JLabel("Click to chat with iBot");
		lblNewLabel.setFont(new Font("Courier New", Font.BOLD, 20));
		lblNewLabel.setBounds(49, 448, 312, 14);
		contentPane.add(lblNewLabel);
		Chatbox.setFont(new Font("Courier New", Font.BOLD, 15));
		
		
		Chatbox.setBounds(49, 483, 477, 54);
		contentPane.add(Chatbox);
		Chatbox.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("iBot ");
		lblNewLabel_1.setFont(new Font("Courier New", Font.BOLD, 19));
		lblNewLabel_1.setBounds(218, 29, 90, 22);
		contentPane.add(lblNewLabel_1);
		
		Chatbox.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String gtext=Chatbox.getText().toLowerCase();
			Chatarea.append("YOU--->>" + gtext + "\n" );
			Chatbox.setText("");

			Random rand = new Random();
			 
		       // Generate random integers in range 0 to 999
		       int rand_int1 = rand.nextInt(1000);
		       //"Your request number is REQ"+rand_int1);

		if(gtext.contains("hi")){
		bot("Welcome! \nWhich service would you like to request for? \n1.Software Request \n2.IT Accessories \n3.Data Card");
		}



		else if(gtext.contains("software request")) {
		           bot("Which software would you like to install on your device? \n1. Amazon workspaces – 2.5.10 \n2. Chrome standalone setup 64\n3. Citrix Receiver – 3.2.0.1");
		           }
		else if (gtext.contains("amazon workspaces")) {
		bot("Enter the device number you want to install this software on:");
		}
		else if (gtext.contains("chrome standalone setup")) {
		   bot("Enter the device number you want to install this software on:");
		   }
		else if(gtext.contains("citrix receiver")){
		bot("Enter the device number you want to install this software on:");
		}
		else if(gtext.contains("inph004")){
		bot("Are you sure you need this? \n1.Yes \n2.No");
		}
		else if(gtext.contains("yes")){
		bot("Your request number is REQ"+rand_int1);
		}
		else if(gtext.contains("no"))
		{
		bot("Welcome! \\nWhich service would you like to request for? \\n1.Software Request \\n2.IT Accessories \\n3.Data Card");
		}
		else if(gtext.contains("it accessories")){
		bot("Which of the following accessories would you like to request for? \n1.Headphones \n2.Mouse \n3.Keyboard \n4.Power adapters");

		}
		else if(gtext.contains("headphones")){
		bot("Enter your seat location:");
		}
		else if(gtext.contains("mouse")){
		bot("Enter your seat location:");
		}
		else if(gtext.contains("keyboard")){
		bot("Enter your seat location:");
		}
		else if(gtext.contains("power adapters")){
		bot("Enter your seat location:");
		}
		else if(gtext.contains("hinj004")){

		bot("Are you sure you want to install this software on your machine? \n1.Yes \n2.No");
		}
		//bot("Your request has been submitted successfuly.\nOur IT agent will contact you shortly. \nYour request number is REQ"+rand_int1);
		else if(gtext.contains("data card")){
		bot("To request for data card please select the duration: \n1.Week \n2.Month \n3.Permanent");
		}
		else if(gtext.contains("week")){
		bot("Enter your location:");
		}
		else if(gtext.contains("month")){
		bot("Enter your location:");
		}
		else if(gtext.contains("permanent")){
		bot("Enter your location:");
		}




		 else {
		     bot("I do not understand you");
		       }
		}
		});
		}
			private void bot(String string){
			Chatarea.append("BOT--->>" +string+ "\n");


			}
	
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				ChatBot frame = new ChatBot();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
}