package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;

public class MySwing06 extends JFrame {

	private JPanel contentPane;
	private JTextField tfDan;
	JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing06 frame = new MySwing06();
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
	public MySwing06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbl = new JLabel("출력단수:");
		lbl.setBounds(24, 27, 57, 15);
		contentPane.add(lbl);

		tfDan = new JTextField();
		tfDan.setBounds(106, 24, 84, 21);
		contentPane.add(tfDan);
		tfDan.setColumns(10);

		JButton btn = new JButton("출력하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(24, 52, 166, 23);
		contentPane.add(btn);

		ta = new JTextArea();
		ta.setBounds(22, 92, 168, 148);
		contentPane.add(ta);
	}

	public void myclick() {
		String dan = tfDan.getText();
		int idan = Integer.parseInt(dan);
		String txt = "";
		txt += idan+"*"+1+"="+(idan*1)+"\n";
		txt += idan+"*"+2+"="+(idan*2)+"\n";
		txt += idan+"*"+3+"="+(idan*3)+"\n";
		txt += idan+"*"+4+"="+(idan*4)+"\n";
		txt += idan+"*"+5+"="+(idan*5)+"\n";
		txt += idan+"*"+6+"="+(idan*6)+"\n";
		txt += idan+"*"+7+"="+(idan*7)+"\n";
		txt += idan+"*"+8+"="+(idan*8)+"\n";
		txt += idan+"*"+9+"="+(idan*9)+"\n";
		ta.setText(txt);

	}
}
