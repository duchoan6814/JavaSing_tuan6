import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class DemoJList extends JFrame {
	private JButton btnExit;
	private JButton btnToDenSoChan;
	private JButton btnToDenSoLe;
	private JButton btnToDenSoNguyenTo;
	private JButton btnBoToDen;
	private JButton btnXoaCacGiaTriToDen;
	private JButton btnTongGiaTriTrongList;
	private JButton btnNhapSoNguyen;
	private JTextField txtNhapSoNguyen;
	private JCheckBox chkChoPhepNhapSoNguyen;
	private JList lstListNumber;
	private JButton btnTaoSoNgauNhien;

	public DemoJList() {
		// TODO Auto-generated constructor stub
		setTitle("Demo JCheckBox");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// create panel top
		JPanel pnlTop = new JPanel();
		JLabel lblTitle = new JLabel("Thao tác trên JList - JCheckbox");
		pnlTop.add(lblTitle);
		
		// create panel bottom
		JPanel pnlBottom = new JPanel();
		btnExit = new JButton("Thoát chương trình");
		pnlBottom.add(btnExit);
		
		// create panel left
		JPanel pnlLeft = new JPanel();
		pnlLeft.setLayout(new BoxLayout(pnlLeft, BoxLayout.Y_AXIS));
		pnlLeft.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));
		btnToDenSoChan = new JButton("Tô đen số chẵn");
		btnToDenSoLe = new JButton("Tô đen số lẻ");
		btnToDenSoNguyenTo = new JButton("Tô đen số nguyên tố");
		btnBoToDen = new JButton("Bỏ tô đen");
		btnXoaCacGiaTriToDen = new JButton("Xóa các giá trị tô đen");
		btnTongGiaTriTrongList = new JButton("Tổng các giá trị trong list");
		
		btnToDenSoChan.setMaximumSize(btnTongGiaTriTrongList.getMaximumSize());
		btnToDenSoLe.setMaximumSize(btnTongGiaTriTrongList.getPreferredSize());
		btnToDenSoNguyenTo.setMaximumSize(btnTongGiaTriTrongList.getPreferredSize());
		btnXoaCacGiaTriToDen.setMaximumSize(btnTongGiaTriTrongList.getPreferredSize());
		btnBoToDen.setMaximumSize(btnTongGiaTriTrongList.getPreferredSize());
		pnlLeft.add(btnToDenSoChan);
		pnlLeft.add(btnToDenSoLe);
		pnlLeft.add(btnToDenSoNguyenTo);
		pnlLeft.add(btnBoToDen);
		pnlLeft.add(btnXoaCacGiaTriToDen);
		pnlLeft.add(btnTongGiaTriTrongList);
		
		// create panel right
		JPanel pnlRight = new JPanel();
		pnlRight.setLayout(new BorderLayout());
		pnlRight.setBorder(BorderFactory.createTitledBorder("Nhập thông tin"));
			// create panel top of right panel
		JPanel pnlRightTop = new JPanel();
		pnlRightTop.setLayout(new BoxLayout(pnlRightTop, BoxLayout.X_AXIS));
		btnNhapSoNguyen = new JButton("Nhập số nguyên");
		txtNhapSoNguyen = new JTextField(10);
		chkChoPhepNhapSoNguyen = new JCheckBox("Cho phép nhập số âm");
		pnlRightTop.add(btnNhapSoNguyen);
		pnlRightTop.add(txtNhapSoNguyen);
		pnlRightTop.add(chkChoPhepNhapSoNguyen);
		
			// create panel center of right panel
		JPanel pnlRightCenter = new JPanel();
		lstListNumber = new JList();
		lstListNumber.setVisibleRowCount(20);
		JScrollPane scrListNumber = new JScrollPane(lstListNumber);
		pnlRightCenter.add(scrListNumber);
		
			// create panel bottom of right panel
		JPanel pnlRightBottom = new JPanel();
		btnTaoSoNgauNhien = new JButton("Tạo số ngẫu nhiên");
		pnlRightBottom.add(btnTaoSoNgauNhien);
		
			// add panel into right panel
		pnlRight.add(pnlRightTop, BorderLayout.NORTH);
		pnlRight.add(pnlRightCenter, BorderLayout.CENTER);
		pnlRight.add(pnlRightBottom, BorderLayout.SOUTH);
		
		
		// add panels into jframe
		add(pnlTop, BorderLayout.NORTH);
		add(pnlBottom, BorderLayout.SOUTH);
		add(pnlLeft, BorderLayout.WEST);
		add(pnlRight, BorderLayout.CENTER);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoJList().setVisible(true);
	}

}
