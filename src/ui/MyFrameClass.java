package ui;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MyFrameClass extends JFrame

{ String regNumber;
			
	 MyFrameClass(){
		 
			JPanel panel1= new JPanel();
			JPanel panel3= new JPanel();
			
			JPanel panel2= new JPanel();
		
			JPanel panel4= new JPanel();
					
			setVisible(true);
			setSize(700, 350);
			setResizable(false);
			setTitle("GarageApplication");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int width=screenSize.width;
			int height=screenSize.height;
			setLocation(width/4,height/4 );
			
			getContentPane().setBackground(Color.getHSBColor(122, 168, 166));
			getRootPane().setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, Color.ORANGE));
			
			add(panel1);
			panel1.setBounds(20, 30, 640, 70);
			panel1.setBackground(Color.orange);
			panel1.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		
			Label label1= new Label("Garage Application");
			label1.setFont(new Font("Serif", Font.PLAIN, 34));	
			panel1.add(label1);
			
			
			
			
			add(panel2);
			panel2.setBounds(20, 110, 640, 70);
			panel2.setBackground(Color.orange);
			panel2.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
			
			Label label2= new Label("Enter Vehicle Reg:Number");
			label2.setFont(new Font("Serif", Font.PLAIN, 18));	
			panel2.add(label2);
			
			TextField text2=new TextField("                  ");
			panel2.add(text2);
			
			regNumber =text2.getText().trim();
			
								

			add(panel3);
			panel3.setBounds(20, 190, 640, 70);
			panel3.setBackground(Color.orange);
			panel3.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		
			add(panel4);
			panel4.setBounds(360, 250, 70, 150);
			panel4.setBackground(Color.gray);
			
			
			
			
			JButton park= new JButton("Park Vehicle");
			ParkClass pc= new ParkClass();
			park.addActionListener(pc);
			


	       
			
			JButton unPark= new JButton("Unpark Vehicle");
			UnParkClass unpark=new UnParkClass();
			unPark.addActionListener(unpark);
			
			
			JButton allParkedVehicle= new JButton("List Parked Vehicle");
			JButton find= new JButton("Find Vehicle");
			
			JButton exit= new JButton("Exit");
			ExitClass ec= new ExitClass();
			exit.addActionListener(ec);
			
			
			
			
			
			panel3.add(park);
			panel3.add(unPark);
			panel3.add(allParkedVehicle);
			panel3.add(find);
			panel3.add(exit);
			
			
			
			
			

		}






		

	}

		
		





