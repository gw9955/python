package day04;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MySwing09 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing09 frame = new MySwing09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MySwing09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 339, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		tf = new JTextField();
		tf.setHorizontalAlignment(SwingConstants.RIGHT);
		tf.setBounds(76, 28, 171, 21);
		contentPane.add(tf);
		tf.setColumns(10);

		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(1);
			}
		});
		btn1.setBounds(76, 59, 49, 36);
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(2);
			}
		});
		btn2.setBounds(137, 59, 49, 36);
		contentPane.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(3);
			}
		});
		btn3.setBounds(198, 59, 49, 36);
		contentPane.add(btn3);

		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(4);
			}
		});
		btn4.setBounds(76, 105, 49, 34);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(5);
			}
		});
		btn5.setBounds(137, 105, 49, 34);
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(6);
			}
		});
		btn6.setBounds(198, 105, 49, 34);
		contentPane.add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(7);
			}
		});
		btn7.setBounds(76, 149, 49, 34);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(8);
			}
		});
		btn8.setBounds(137, 149, 49, 34);
		contentPane.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(9);
			}
		});
		btn9.setBounds(198, 149, 49, 34);
		contentPane.add(btn9);

		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(0);
			}
		});
		btn0.setBounds(76, 193, 49, 34);
		contentPane.add(btn0);

		JButton btnCall = new JButton("CALL");
		btnCall.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, tf.getText() + "로 전화중입니다.");
			}
		});
		btnCall.setBounds(136, 193, 111, 34);
		contentPane.add(btnCall);
	}

	String str = "";

	public void myclick(int num) {
		str += String.valueOf(num);
		tf.setText(str);
	}

}
