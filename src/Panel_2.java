import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Panel_2 extends JPanel {

	Panel_2(){
	setBorder(new LineBorder(new Color(0, 0, 0)));
	setBounds(10, 122, 414, 100);
	setLayout(null);
	setVisible(true);
	
	JButton button_1 = new JButton("Button");
	button_1.setBounds(10, 11, 89, 23);
	this.add(button_1);

	
	JTextField textField_1 = new JTextField();
	textField_1.setBounds(10, 45, 86, 20);
	this.add(textField_1);
	textField_1.setColumns(10);
	
	JTextField textField_2 = new JTextField();
	textField_2.setBounds(10, 76, 86, 20);
	this.add(textField_2);
	textField_2.setColumns(10);
	
	button_1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			textField_1.setText("Button clicked");
			
		}
	});
	
	}
}
