package kumpirpckg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;

public class maiinframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int toplam=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					maiinframe frame = new maiinframe();
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
	public maiinframe() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\merts\\Downloads\\kisspng-baked-potato-fast-food-vegetarian-cuisine-mr-kump-mexican-food-5ade9eea3d7b03.4996900515245391142518.jpg"));
		setTitle("Baked Patato Menu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 977, 647);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Efsane Kumpir !");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 28));
		lblNewLabel.setBounds(39, 0, 447, 122);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Baked Patato (50 TL)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(49, 112, 198, 55);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox cbolive = new JCheckBox("Olive (10 TL)");
		cbolive.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbolive.setBackground(SystemColor.info);
		cbolive.setBounds(59, 173, 117, 21);
		contentPane.add(cbolive);
		
		JCheckBox cbcorn = new JCheckBox("Corn (5 TL)");
		cbcorn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbcorn.setBackground(SystemColor.info);
		cbcorn.setBounds(59, 216, 117, 21);
		contentPane.add(cbcorn);
		
		JCheckBox cbsausage = new JCheckBox("Sausage (15 TL)");
		cbsausage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbsausage.setBackground(SystemColor.info);
		cbsausage.setBounds(59, 255, 131, 21);
		contentPane.add(cbsausage);
		
		JCheckBox cbkisir = new JCheckBox("Kisir (10 TL)");
		cbkisir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbkisir.setBackground(SystemColor.info);
		cbkisir.setBounds(59, 331, 107, 21);
		contentPane.add(cbkisir);
		
		JCheckBox chckbxNewCheckBox_1_1_3 = new JCheckBox("Ketchup");
		chckbxNewCheckBox_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_1_1_3.setBackground(SystemColor.info);
		chckbxNewCheckBox_1_1_3.setBounds(59, 367, 93, 21);
		contentPane.add(chckbxNewCheckBox_1_1_3);
		
		JCheckBox chckbxNewCheckBox_1_1_3_1 = new JCheckBox("Mayonnaise");
		chckbxNewCheckBox_1_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_1_1_3_1.setBackground(SystemColor.info);
		chckbxNewCheckBox_1_1_3_1.setBounds(59, 403, 107, 21);
		contentPane.add(chckbxNewCheckBox_1_1_3_1);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(SystemColor.info);
		contentPane_1.setBounds(0, 0, 963, 610);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome to Efsane Kumpir !");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD, 28));
		lblNewLabel_2.setBackground(Color.RED);
		lblNewLabel_2.setBounds(39, 0, 447, 122);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Baked Patato (50 TL)");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(49, 112, 198, 55);
		contentPane_1.add(lblNewLabel_1_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Olive");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_2.setBackground(SystemColor.info);
		chckbxNewCheckBox_2.setBounds(59, 173, 93, 21);
		contentPane_1.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("Corn");
		chckbxNewCheckBox_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_1_2.setBackground(SystemColor.info);
		chckbxNewCheckBox_1_2.setBounds(59, 216, 93, 21);
		contentPane_1.add(chckbxNewCheckBox_1_2);
		
		JCheckBox chckbxNewCheckBox_1_1_4 = new JCheckBox("Sausage");
		chckbxNewCheckBox_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_1_1_4.setBackground(SystemColor.info);
		chckbxNewCheckBox_1_1_4.setBounds(59, 255, 93, 21);
		contentPane_1.add(chckbxNewCheckBox_1_1_4);
		
		JCheckBox cboliversalad = new JCheckBox("Olivier salad (10 TL)");
		cboliversalad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboliversalad.setBackground(SystemColor.info);
		cboliversalad.setBounds(59, 295, 172, 21);
		contentPane_1.add(cboliversalad);
		
		JCheckBox chckbxNewCheckBox_1_1_2_1 = new JCheckBox("Kisir");
		chckbxNewCheckBox_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_1_1_2_1.setBackground(SystemColor.info);
		chckbxNewCheckBox_1_1_2_1.setBounds(59, 331, 107, 21);
		contentPane_1.add(chckbxNewCheckBox_1_1_2_1);
		
		JCheckBox chckbxNewCheckBox_1_1_3_2 = new JCheckBox("Ketchup");
		chckbxNewCheckBox_1_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_1_1_3_2.setBackground(SystemColor.info);
		chckbxNewCheckBox_1_1_3_2.setBounds(59, 367, 93, 21);
		contentPane_1.add(chckbxNewCheckBox_1_1_3_2);
		
		JCheckBox chckbxNewCheckBox_1_1_3_1_1 = new JCheckBox("Mayonnaise");
		chckbxNewCheckBox_1_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_1_1_3_1_1.setBackground(SystemColor.info);
		chckbxNewCheckBox_1_1_3_1_1.setBounds(59, 403, 107, 21);
		contentPane_1.add(chckbxNewCheckBox_1_1_3_1_1);
		
		JComboBox comboBoxcorn = new JComboBox();
		comboBoxcorn.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		comboBoxcorn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxcorn.setBounds(237, 216, 50, 21);
		contentPane_1.add(comboBoxcorn);
		
		JComboBox comboBoxsausage = new JComboBox();
		comboBoxsausage.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		comboBoxsausage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxsausage.setBounds(237, 255, 50, 21);
		contentPane_1.add(comboBoxsausage);
		
		JComboBox comboBoxoliversalad = new JComboBox();
		comboBoxoliversalad.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		comboBoxoliversalad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxoliversalad.setBounds(237, 294, 50, 23);
		contentPane_1.add(comboBoxoliversalad);
		
		JComboBox comboBoxkisir = new JComboBox();
		comboBoxkisir.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		comboBoxkisir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxkisir.setBounds(237, 331, 50, 21);
		contentPane_1.add(comboBoxkisir);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("Olivier salad (10 TL)");
		chckbxNewCheckBox_1_1_1.setBounds(56, 295, 155, 21);
		contentPane_1.add(chckbxNewCheckBox_1_1_1);
		chckbxNewCheckBox_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_1_1_1.setBackground(SystemColor.info);
		
		JComboBox comboBoxolive = new JComboBox();
		comboBoxolive.setEditable(true);
		comboBoxolive.setBounds(237, 173, 50, 21);
		contentPane_1.add(comboBoxolive);
		comboBoxolive.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxolive.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		
	
	
		JLabel lblNewLabel_3 = new JLabel("Total Bill:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(50, 517, 116, 34);
		contentPane_1.add(lblNewLabel_3);
		
		JLabel labelToplam = new JLabel("0");
		labelToplam.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelToplam.setBounds(145, 528, 29, 13);
		contentPane_1.add(labelToplam);
		
		JLabel lblNewLabel_4_1 = new JLabel("TL");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(173, 528, 45, 13);
		contentPane_1.add(lblNewLabel_4_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\merts\\Downloads\\kumpir-1-595x396.jpg"));
		btnNewButton.setBounds(419, 112, 471, 367);
		contentPane_1.add(btnNewButton);
		
		JButton Total_bill_counter = new JButton("Bill");
		Total_bill_counter.setFont(new Font("Tahoma", Font.BOLD, 14));
		Total_bill_counter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toplam=50;
				if(cbolive.isSelected()) {
					toplam = toplam + Integer.parseInt(comboBoxolive.getSelectedItem().toString())*10;
					
				}
				if(cbcorn.isSelected()) {
					toplam = toplam + Integer.parseInt(comboBoxolive.getSelectedItem().toString())*5;
					
				}
				if(cbsausage.isSelected()) {
					toplam = toplam + Integer.parseInt(comboBoxolive.getSelectedItem().toString())*15;
					
				}
				if(cboliversalad.isSelected()) {
					toplam = toplam + Integer.parseInt(comboBoxolive.getSelectedItem().toString())*10;
					
				}
				if(cbkisir.isSelected()) {
					toplam = toplam + Integer.parseInt(comboBoxolive.getSelectedItem().toString())*10;
					
				}
				labelToplam.setText(Integer.toString(toplam));
			}
		});
		Total_bill_counter.setBounds(59, 450, 232, 42);
		contentPane_1.add(Total_bill_counter);
		
	}
}
