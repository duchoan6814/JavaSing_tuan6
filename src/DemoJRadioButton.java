import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class DemoJRadioButton extends JFrame implements ActionListener, ItemListener {

	private JCheckBox chkItalic;
	private JRadioButton radLeft;
	private JRadioButton radRight;
	private JLabel lblSouth;

	public DemoJRadioButton() {
		// TODO Auto-generated constructor stub
		setTitle("Demo JCheckBox");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pnlCenter = new JPanel();
		chkItalic = new JCheckBox("Italic");
		radLeft = new JRadioButton("Left");
		radRight = new JRadioButton("Right");

		lblSouth = new JLabel("hello world!");

		pnlCenter.add(chkItalic);
		pnlCenter.add(radLeft);
		pnlCenter.add(radRight);

		add(pnlCenter, BorderLayout.CENTER);
		add(lblSouth, BorderLayout.SOUTH);

		ButtonGroup group = new ButtonGroup();
		group.add(radLeft);
		group.add(radRight);

		chkItalic.addItemListener(this);
		radLeft.addActionListener(this);
		radRight.addActionListener(this);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoJRadioButton().setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Font f = lblSouth.getFont();
		
		if(e.getStateChange() == ItemEvent.SELECTED) {
			lblSouth.setFont(new Font(f.getName(), Font.ITALIC, f.getSize()));
		}else {
			lblSouth.setFont(new Font(f.getName(), Font.PLAIN, f.getSize()));
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();

		if (obj == radLeft) {
			lblSouth.setHorizontalAlignment(SwingConstants.LEFT);
		} else {
			lblSouth.setHorizontalAlignment(SwingConstants.RIGHT);
		}
	}

}
