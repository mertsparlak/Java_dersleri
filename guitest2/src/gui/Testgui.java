package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Testgui {

	public static void main(String[] args) {
	
	JFrame jf=new JFrame();
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setSize(700,700);
	jf.setVisible(true);
	
	JButton jb=new JButton();
	jb.setBounds(80,80,100,100); // ilk ikisi x ve y eksenine uzaklığı son 2 si eni ve boyu
	jf.getContentPane().setLayout(null); // layout sınırlayıcı gibi yani frame büyüttükçe butonumuz sabit kalıcak
	jf.getContentPane().add(jb);
	
	JLabel jl=new JLabel();
	jl.setText("---");
	jl.setBounds(200,80,100,50);
	jf.getContentPane().add(jl);
	
	jb.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			jl.setText("Merhaba Swing");
			
		}
	});
	
	
	}

}
