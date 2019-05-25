package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class FirstPage extends JFrame{


	/**
	 * Create the application.
	 */
	public FirstPage() {
		getContentPane().setLayout(null);
		
		JButton PlayMode = new JButton("\uC5F0\uC8FC\uBAA8\uB4DC");
		
		PlayMode.setBounds(55, 256, 478, 64);
		getContentPane().add(PlayMode);
		
		JButton GameMode = new JButton("\uAC8C\uC784\uBAA8\uB4DC");
		GameMode.setBounds(55, 332, 478, 64);
		getContentPane().add(GameMode);
		
		JLabel Picture = new JLabel("\uADF8\uB9BC \uC9D1\uC5B4\uB123\uAE30");
		Picture.setBounds(55, 29, 815, 193);
		getContentPane().add(Picture);
		
		JButton MusicBook = new JButton("\uC545\uBCF4");
		MusicBook.setBounds(55, 406, 478, 64);
		getContentPane().add(MusicBook);


		PlayMode.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//회원가입창으로 이동
				// TODO Auto-generated method stub
				PianoMode f2= new PianoMode();
			}
		});
		GameMode.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//회원가입창으로 이동
				// TODO Auto-generated method stub
				GameMode f3= new GameMode();
			}
		});
		setSize(950, 632);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("6조의 신디사이저");
		setVisible(true);;
	}
}
