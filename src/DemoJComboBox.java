import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DemoJComboBox extends JFrame implements ActionListener {
	
	private JLabel lblCenter;
	private JComboBox cboNorth;

	public DemoJComboBox() {
		// TODO Auto-generated constructor stub
		setTitle("Demo JCheckBox");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lblCenter = new JLabel("Day la doan text dung de test!");
		lblCenter.setFont(new Font("Serif", Font.PLAIN, 12));
		
		String f[] = {"Serif", "SansSerif", "Monospaced"};
		cboNorth = new JComboBox<>(f);
		
		add(lblCenter, BorderLayout.CENTER);
		add(cboNorth, BorderLayout.NORTH);
		
		cboNorth.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoJComboBox().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String fontName = (String)cboNorth.getSelectedItem();
		
		lblCenter.setFont(new Font(fontName, lblCenter.getFont().getStyle(), lblCenter.getFont().getSize()));
	}

}
