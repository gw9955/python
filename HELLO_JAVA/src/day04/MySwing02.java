package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing02 extends JFrame {
	JLabel lbl;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing02 frame = new MySwing02();
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
	public MySwing02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("100");
		lbl.setBounds(63, 32, 18, 15);
		contentPane.add(lbl);

		JButton btn = new JButton("decrease");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				int count = Integer.parseInt(lbl.getText());
//				count -= 1;
//				lbl.setText(String.valueOf(count));
				myclick();
			}
		});
		btn.setBounds(142, 28, 85, 23);
		contentPane.add(btn);
		
	}
	
	public void myclick() {
		String a = lbl.getText();
		int aa = Integer.parseInt(a);
		aa--;
		lbl.setText(Integer.toString(aa));
	}

}
