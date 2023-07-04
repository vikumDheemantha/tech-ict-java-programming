import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ButtonClickListener implements ActionListener{
    private JLabel statusLabel;

    public ButtonClickListener(JLabel statusLabel) {
        this.statusLabel = statusLabel;
    }
    public void actionPerformed(ActionEvent e) {
       String command = e.getActionCommand();  
       
       if( command.equals( "OK" ))  {
          statusLabel.setText("Ok Button clicked.");
       } else if( command.equals( "Submit" ) )  {
          statusLabel.setText("Submit Button clicked."); 
       } else {
          statusLabel.setText("Cancel Button clicked.");
       }  	
    }		
 }