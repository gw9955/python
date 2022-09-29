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

public class MySwing08 extends JFrame {
	JTextArea ta;
	private JPanel contentPane;
	private JTextField tfFirst;
	private JTextField tfLast;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing08 frame = new MySwing08();
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
	public MySwing08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 241, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFirst = new JLabel("첫별수:");
		lblFirst.setBounds(25, 28, 57, 15);
		contentPane.add(lblFirst);

		JLabel lblLast = new JLabel("끝별수:");
		lblLast.setBounds(25, 53, 57, 15);
		contentPane.add(lblLast);

		tfFirst = new JTextField();
		tfFirst.setBounds(116, 25, 40, 21);
		contentPane.add(tfFirst);
		tfFirst.setColumns(10);

		tfLast = new JTextField();
		tfLast.setColumns(10);
		tfLast.setBounds(116, 50, 40, 21);
		contentPane.add(tfLast);

		JButton btn = new JButton("별출력하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(25, 78, 131, 23);
		contentPane.add(btn);

		ta = new JTextArea();
		ta.setBounds(25, 115, 131, 122);
		contentPane.add(ta);
	}

	public String drawStar(int cnt) {
		String ret = "";
		for (int i = 0; i < cnt; i++) {
			ret += "*";
		}

		ret += "\n";

		return ret;
	}

	public void myclick() {
		String a = tfFirst.getText();
		String b = tfLast.getText();
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);

		String txt = "";
		for (int i = aa; i <= bb; i++) {
			txt += drawStar(i);

		}

//		txt += drawStar(1);
//		txt += drawStar(2);
		ta.setText(txt);

//		String first = tfFirst.getText();
//		int ifirst = Integer.parseInt(first);
//		String last = tfLast.getText();
//		int ilast = Integer.parseInt(last);
//
//		for (int i = ifirst; i <= ilast; i++) {
//			for (int j = 1; j <= i; j++) {
//				ta.append("*");
//			}
//			ta.append("\n");
//		}

	}

}
