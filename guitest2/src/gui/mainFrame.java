package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JSlider;
import java.awt.Label;

public class mainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame frame = new mainFrame();
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
	public mainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("-");
		lblNewLabel.setBounds(182, 82, 96, 29);
		contentPane.add(lblNewLabel);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(comboBox.getSelectedItem().toString());
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Toyota", "Mercedes"}));
		comboBox.setBounds(23, 86, 116, 21);
		contentPane.add(comboBox);
		
		
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String model=textField.getText();
				comboBox.addItem(model);
			}
		});
		btnNewButton.setBounds(36, 46, 85, 21);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(182, 47, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JList list = new JList();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(list.getSelectedValue());
			}
		});
		list.setBounds(333, 59, 78, 121);
		contentPane.add(list);
		
		JButton btnNewButton_1 = new JButton("Listeyi doldur");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> dlm = new DefaultListModel<String>();
				dlm.addElement("Mert");
				dlm.addElement("Sena");
				dlm.addElement("İrem");
				list.setModel(dlm);
				
			}
		});
		btnNewButton_1.setBounds(310, 28, 116, 21);
		contentPane.add(btnNewButton_1);
		
		JTextArea txtrAsgasgasgasgasgasgasgagasgasgasgas = new JTextArea();
		txtrAsgasgasgasgasgasgasgagasgasgasgas.setLineWrap(true);
		txtrAsgasgasgasgasgasgasgagasgasgasgas.setBounds(23, 143, 116, 121);
		contentPane.add(txtrAsgasgasgasgasgasgasgagasgasgasgas);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(165, 109, 158, 143);
		contentPane.add(scrollPane);
		
		JEditorPane editorPane = new JEditorPane();
		scrollPane.setViewportView(editorPane);
		
		JSlider slider = new JSlider();
		slider.setMinorTickSpacing(1);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setBounds(347, 204, 240, 47);
		contentPane.add(slider);
		
		JLabel imageLabel = new JLabel("Java");
		imageLabel.setBounds(23, 289, 264, 208);
		contentPane.add(imageLabel);
		ImageIcon imageIcon=new ImageIcon("C:\\Users\\merts\\Downloads\\java.png");
		imageLabel.setIcon(imageIcon);

		
	}
}
