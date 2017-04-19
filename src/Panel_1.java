import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Panel_1 extends JPanel{

	Panel_1(){
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBounds(10, 11, 414, 100);
		setLayout(null);
		setVisible(true);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(20, 22, 384, 21);
		add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Open");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Copy");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Close");
		mnNewMenu.add(mntmNewMenuItem);
	}
	
}
