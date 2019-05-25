package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameMode extends JFrame {
	public GameMode() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAC8C\uC784");
		lblNewLabel.setBounds(30, 24, 205, 73);
		getContentPane().add(lblNewLabel);
		
		JButton btnDispose = new JButton("\uB2EB\uAE30");
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				}
			});
		btnDispose.setBounds(138, 163, 200, 50);
		getContentPane().add(btnDispose);
		
		setSize(865, 604);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);//프레임 스크린 중앙
		setResizable(false);//프레임 스크린 크기 변경 불가능
		setTitle("민수짱");
		setVisible(true);
		
	}

}
