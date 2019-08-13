import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		    
		    
	}
}
