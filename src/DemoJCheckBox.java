import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DemoJCheckBox extends JFrame implements ItemListener {
	private JTextField txtTest;
	private JCheckBox chkBold;
	private JCheckBox chkItalic;
	
	public DemoJCheckBox() {
		// TODO Auto-generated constructor stub
		setTitle("Demo JCheckBox");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		txtTest = new JTextField("day la phan demo");
		JPanel pnlSouth = new JPanel();
		chkBold = new JCheckBox("bold");
		chkItalic = new JCheckBox("italic");
		
		add(txtTest, BorderLayout.CENTER);
		add(pnlSouth, BorderLayout.SOUTH);
		pnlSouth.add(chkBold);
		pnlSouth.add(chkItalic);
		
		chkBold.addItemListener(this);
		chkItalic.addItemListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoJCheckBox().setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Font f = txtTest.getFont();
		
		if (chkBold.isSelected()) {
			txtTest.setFont(new Font(f.getName(), f.getStyle() ^ Font.BOLD, f.getSize()));
		}
		
		if (chkItalic.isSelected()) {
			txtTest.setFont(new Font(f.getName(), f.getStyle() ^ Font.ITALIC, f.getSize()));
		}
		
	}

}
