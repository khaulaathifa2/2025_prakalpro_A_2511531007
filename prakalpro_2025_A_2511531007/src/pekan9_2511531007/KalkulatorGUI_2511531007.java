package pekan9_2511531007;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class KalkulatorGUI_2511531007 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOutput;
	
	double first;
	double second;
	double result;
	String operator;
	String hasil;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkulatorGUI_2511531007 frame = new KalkulatorGUI_2511531007();
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
	public KalkulatorGUI_2511531007() {
		setTitle("Kalkulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtOutput = new JTextField();
		txtOutput.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtOutput.setHorizontalAlignment(SwingConstants.LEFT);
		txtOutput.setBounds(10, 11, 286, 66);
		contentPane.add(txtOutput);
		txtOutput.setColumns(10);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(txtOutput.getText().length()>0)
				{ 
					StringBuilder str = new StringBuilder(txtOutput.getText());
					str.deleteCharAt(txtOutput.getText().length()-1);
					backSpace = str.toString();
					txtOutput.setText(backSpace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackSpace.setBounds(10, 83, 65, 50);
		contentPane.add(btnBackSpace);
		
		JButton btnHapus = new JButton("C");
		btnHapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText(null);
			}
		});
		btnHapus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnHapus.setBounds(85, 83, 65, 50);
		contentPane.add(btnHapus);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String angka = txtOutput.getText()+ btn00.getText();
				txtOutput.setText(angka);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(160, 83, 65, 50);
		contentPane.add(btn00);
		
		JButton btnTambah_2511531007 = new JButton("+");
		btnTambah_2511531007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtOutput.getText());
				txtOutput.setText("");
				operator = "+";
			}
		});
		btnTambah_2511531007.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTambah_2511531007.setBounds(231, 83, 65, 50);
		contentPane.add(btnTambah_2511531007);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String angka = txtOutput.getText()+ btn7.getText();
				txtOutput.setText(angka);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 144, 65, 50);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String angka = txtOutput.getText()+ btn4.getText();
				txtOutput.setText(angka);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 205, 65, 50);
		contentPane.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String angka = txtOutput.getText()+ btn1.getText();
				txtOutput.setText(angka);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 266, 65, 50);
		contentPane.add(btn1);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String angka = txtOutput.getText()+ btn8.getText();
				txtOutput.setText(angka);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(85, 144, 65, 50);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String angka = txtOutput.getText()+ btn9.getText();
				txtOutput.setText(angka);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(160, 144, 65, 50);
		contentPane.add(btn9);
		
		JButton btnKurang_2511531007 = new JButton("-");
		btnKurang_2511531007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtOutput.getText());
				txtOutput.setText("");
				operator = "-";
			}
		});
		btnKurang_2511531007.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnKurang_2511531007.setBounds(231, 144, 65, 50);
		contentPane.add(btnKurang_2511531007);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String angka = txtOutput.getText()+ btn5.getText();
				txtOutput.setText(angka);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(85, 205, 65, 50);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String angka = txtOutput.getText()+ btn6.getText();
				txtOutput.setText(angka);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(160, 205, 65, 50);
		contentPane.add(btn6);
		
		JButton btnKali_2511531007 = new JButton("*");
		btnKali_2511531007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtOutput.getText());
				txtOutput.setText("");
				operator = "*";
			}
		});
		btnKali_2511531007.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnKali_2511531007.setBounds(231, 205, 65, 50);
		contentPane.add(btnKali_2511531007);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String angka = txtOutput.getText()+ btn2.getText();
				txtOutput.setText(angka);
			}
		});
		btn2.setBounds(85, 266, 65, 50);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String angka = txtOutput.getText()+ btn3.getText();
				txtOutput.setText(angka);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(160, 266, 65, 50);
		contentPane.add(btn3);
		
		JButton btnBagi_2511531007 = new JButton("/");
		btnBagi_2511531007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtOutput.getText());
				txtOutput.setText("");
				operator = "/";
			}
		});
		btnBagi_2511531007.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBagi_2511531007.setBounds(231, 266, 65, 50);
		contentPane.add(btnBagi_2511531007);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String angka = txtOutput.getText()+ btn0.getText();
				txtOutput.setText(angka);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 327, 65, 50);
		contentPane.add(btn0);
		
		JButton btnKoma = new JButton(".");
		btnKoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String angka = txtOutput.getText()+ btnKoma.getText();
				txtOutput.setText(angka);
			}
		});
		btnKoma.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnKoma.setBounds(85, 327, 65, 50);
		contentPane.add(btnKoma);
		
		JButton btnSamaDengan = new JButton("=");
		btnSamaDengan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hasil;
				second = Double.parseDouble(txtOutput.getText());
				if(operator ==  "+")
				{
					result = first + second;
					hasil =String.format("%.2f", result);
					txtOutput.setText(hasil);
				}
				else if(operator ==  "-")
				{
					result = first - second;
					hasil =String.format("%.2f", result);
					txtOutput.setText(hasil);
				}
				else if(operator ==  "*")
				{
					result = first * second;
					hasil =String.format("%.2f", result);
					txtOutput.setText(hasil);
				}
				else if(operator ==  "/")
				{
					result = first / second;
					hasil =String.format("%.2f", result);
					txtOutput.setText(hasil);
				}
				if(operator ==  "%")
				{
					result = first % second;
					hasil =String.format("%.2f", result);
					txtOutput.setText(hasil);
				}		
			}
		});
		btnSamaDengan.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSamaDengan.setBounds(160, 327, 65, 50);
		contentPane.add(btnSamaDengan);
		
		JButton btnPersen_2511531007 = new JButton("%");
		btnPersen_2511531007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtOutput.getText());
				txtOutput.setText("");
				operator = "%";
			}
		});
		btnPersen_2511531007.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPersen_2511531007.setBounds(231, 327, 65, 50);
		contentPane.add(btnPersen_2511531007);

	}
}
