package ui;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class UnParkClass implements ActionListener {

	

		 public void actionPerformed(ActionEvent e) 
		 {
				
			 JOptionPane.showMessageDialog((Component) e.getSource(), "Vehicle is unparked now!");
					 
			
				 
			}

		}

