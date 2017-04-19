import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MainFrame extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	public MainFrame() {
		initializeComponets();
	}
	
	public void initializeComponets(){
		
		getContentPane().setLayout(null);
		Panel_1 panel_1=new Panel_1();
		getContentPane().add(panel_1);
			
		Panel_2 panel_2 = new Panel_2();
		getContentPane().add(panel_2);
		
	}
	
	
	public static void main(String[] args) {
		MainFrame frame=new MainFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(500, 500);
	}
}
