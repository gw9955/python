package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing03 extends JFrame {

	private JPanel contentPane;
	private JTextField tf01;
	private JTextField tf02;
	private JTextField tf03;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing03 frame = new MySwing03();
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
	public MySwing03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		tf01 = new JTextField();
		tf01.setBounds(12, 44, 74, 21);
		contentPane.add(tf01);
		tf01.setColumns(10);

		tf02 = new JTextField();
		tf02.setColumns(10);
		tf02.setBounds(137, 44, 74, 21);
		contentPane.add(tf02);

		tf03 = new JTextField();
		tf03.setColumns(10);
		tf03.setBounds(278, 44, 74, 21);
		contentPane.add(tf03);

		JLabel lbl = new JLabel("+");
		lbl.setBounds(110, 47, 26, 15);
		contentPane.add(lbl);

		JButton btn = new JButton("=");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				String num1 = tf01.getText().toString();
//
//				String num2 = tf02.getText().toString();
//
//				Integer result = Integer.parseInt(num1) + Integer.parseInt(num2);
//
//				tf03.setText(result.toString());
				myclick();
			}
		});
		btn.setBounds(223, 44, 51, 21);
		contentPane.add(btn);
	}
	
	public void myclick() {
		String a = tf01.getText();
		String b = tf02.getText();
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		int sum = aa + bb;
		
		tf03.setText(sum+"");
		
	}
	
}
