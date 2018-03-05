package ui;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ParkClass  implements ActionListener  {

 public void actionPerformed(ActionEvent e) 
 {
		
	 JOptionPane.showMessageDialog((Component) e.getSource(), "Vehicle is parked now!");
			 
	
		 
	}

}
