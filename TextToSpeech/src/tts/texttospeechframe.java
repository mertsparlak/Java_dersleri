package tts;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.io.*;
import com.sun.speech.freetts.*;
import javax.swing.DropMode;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class texttospeechframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtWelcomeToMert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					texttospeechframe frame = new texttospeechframe();
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
	public texttospeechframe() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\merts\\Downloads\\4303407-200.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1002, 624);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrNowIAm = new JTextArea();
		txtrNowIAm.setForeground(SystemColor.desktop);
		txtrNowIAm.setBackground(new Color(234, 234, 234));
		txtrNowIAm.setRows(1);
		txtrNowIAm.setFont(new Font("Georgia", Font.PLAIN, 16));
		txtrNowIAm.setWrapStyleWord(true);
		txtrNowIAm.setBounds(64, 111, 618, 421);
		contentPane.add(txtrNowIAm);
		
		JButton btnNewButton = new JButton("Speech to text");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// instruct freetts to use com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory class instead of AlanVoiceDirectory
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
				VoiceManager voiceManager=VoiceManager.getInstance();
				voice=voiceManager.getVoice("kevin16");
				voice.allocate();
				try {
					voice.speak(txtrNowIAm.getText());
				} catch (Exception e2) {
					System.out.println("Exception: "+e2.toString());
				}
				
			}
		});
		btnNewButton.setBounds(720, 393, 198, 67);
		contentPane.add(btnNewButton);
		
		txtWelcomeToMert = new JTextField();
		txtWelcomeToMert.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtWelcomeToMert.setText("Welcome to Mert Parlak's Text To Speech Converter");
		txtWelcomeToMert.setBackground(SystemColor.activeCaption);
		txtWelcomeToMert.setBounds(64, 27, 575, 74);
		contentPane.add(txtWelcomeToMert);
		txtWelcomeToMert.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\merts\\Downloads\\1425924-200.png"));
		lblNewLabel.setBounds(734, 109, 210, 252);
		contentPane.add(lblNewLabel);
	}
}
