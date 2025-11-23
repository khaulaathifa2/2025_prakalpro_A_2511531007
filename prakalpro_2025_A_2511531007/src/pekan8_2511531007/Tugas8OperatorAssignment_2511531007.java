package pekan8_2511531007;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tugas8OperatorAssignment_2511531007 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAngka1;
	private JTextField txtAngka2;
	private JTextField txtHasil;
	
	 private void pesanPeringatan(String pesan) {
	        JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	    }

	    private void pesanError(String pesan) {
	        JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	    }
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tugas8OperatorAssignment_2511531007 frame = new Tugas8OperatorAssignment_2511531007();
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
	public Tugas8OperatorAssignment_2511531007() {
		setResizable(false);
		setTitle("OPERATOR ASSIGNMENT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ASSIGNMENT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Perpetua", Font.BOLD, 18));
		lblNewLabel.setBounds(44, 11, 206, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Angka 1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Perpetua", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 61, 58, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Angka 2");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Perpetua", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 100, 58, 18);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Hasil");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Perpetua", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 180, 58, 18);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Operator");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Perpetua", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(10, 140, 58, 18);
		contentPane.add(lblNewLabel_1_3);
		
		txtAngka1 = new JTextField();
		txtAngka1.setBounds(78, 60, 70, 20);
		contentPane.add(txtAngka1);
		txtAngka1.setColumns(10);
		
		txtAngka2 = new JTextField();
		txtAngka2.setColumns(10);
		txtAngka2.setBounds(78, 99, 70, 20);
		contentPane.add(txtAngka2);
		
		txtHasil = new JTextField();
		txtHasil.setColumns(10);
		txtHasil.setBounds(78, 179, 70, 20);
		contentPane.add(txtHasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+=", "-=", "*=", "/=", "%="}));
		cbOperator.setBounds(78, 138, 70, 22);
		contentPane.add(cbOperator);
		
		JButton btnProses = new JButton("Proses");
		btnProses.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 	String angka1 = txtAngka1.getText().trim();
	                String angka2 = txtAngka2.getText().trim();

	                if (angka1.isEmpty()) {
	                    pesanPeringatan("Silahkan input Bilangan 1");
	                    return;
	                }
	                if (angka2.isEmpty()) {
	                    pesanPeringatan("Silahkan input Bilangan 2");
	                    return;
	                }
	                try {
	                    int a = Integer.parseInt(angka1);
	                    int b = Integer.parseInt(angka2);
	                    String op = (String) cbOperator.getSelectedItem();
	                    int hasil = a; 
	                    
	                    switch (op) {
                        case "+=" -> hasil += b;
                        case "-=" -> hasil -= b;
                        case "*=" -> hasil *= b;
                        case "/=" -> {
                            if (b == 0) {
                                pesanError("Angka 2 tidak boleh 0");
                                return;
                            }
                            hasil /= b;
                        }
                        case "%=" -> {
                            if (b == 0) {
                                pesanError("Angka 2 tidak boleh 0");
                                return;
                            }
                            hasil %= b;
                        }
                    }
	                    txtAngka1.setText(String.valueOf(hasil));
	                    txtHasil.setText(String.valueOf(hasil));
	                    
	                } catch (NumberFormatException ex) {
	                    pesanError("Angka 1 dan Angka 2 harus angka");
	                }
	            }
	        });
		btnProses.setBounds(180, 138, 88, 22);
		contentPane.add(btnProses);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(180, 178, 88, 22);
		contentPane.add(btnReset);

		 btnReset.addActionListener(e -> {
	            txtAngka1.setText("");
	            txtAngka2.setText("");
	            txtHasil.setText("");
	            cbOperator.setSelectedIndex(0);
	        });
		 
	    }

	}

