import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class main {
	JPanel JP;
	JFrame JF;
	JButton OTB;
	JButton BTO;
	String holder="";
	public static void main(String[] args) {
		main main = new main();
		main.JP = new JPanel();
		main.JF = new JFrame();
		main.OTB = new JButton("Ook to BF");
		main.BTO = new JButton("BF to Ook");
		
		main.JF.add(main.JP);
		main.JF.setVisible(true);
		main.JP.add(main.OTB);
		main.JP.add(main.BTO);

		main.JF.pack();
		main.BTO.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			 main.bfto();
			  }
			});
		
		main.OTB.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			 main.ooktb();
			  }
			});
	}
	public void ooktb(){
		 JFileChooser chooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		         "bf", "txt");
		    chooser.setFileFilter(filter);
		    int returnVal = chooser.showOpenDialog(null);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		            chooser.getSelectedFile().getName());
		    }
		    
		    
	}
	public void bfto(){
		 JFileChooser chooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		         "bf", "txt");
		    chooser.setFileFilter(filter);
		    int returnVal = chooser.showOpenDialog(null);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		            chooser.getSelectedFile().getName());
		    }
		    
	          FileReader fr = null;
			try {
				fr = new FileReader(chooser.getSelectedFile());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    
	          int i;    
	          try {
				while((i=fr.read())!=-1) {
					
				if((char)i=='.'||(char)i=='!'||(char)i=='?') {
					//System.out.print((char)i);
					holder+=(char)i;
				}else {
					//    System.err.print((char)i);
				}
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				}
			} catch (IOException e) {
				e.printStackTrace();
			}    
	          try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
	          for (int j = 0; j < holder.length(); j+=2) {
				System.out.println(holder.substring(j, j+2));
			}
	}
}
