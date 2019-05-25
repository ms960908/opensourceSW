package test;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class PianoMode extends JFrame implements KeyListener {

    
	public PianoMode() {
		
		getContentPane().setLayout(null);
		
		JButton C_s = new JButton("W");
		C_s.setBackground(SystemColor.desktop);
		C_s.setForeground(SystemColor.window);
		C_s.setBounds(65, 155, 75, 119);
		getContentPane().add(C_s);
		
		JButton btnP = new JButton("P");
		btnP.setForeground(Color.WHITE);
		btnP.setBackground(Color.BLACK);
		btnP.setBounds(704, 155, 75, 119);
		getContentPane().add(btnP);
		
		JButton btnO = new JButton("O");
		btnO.setForeground(Color.WHITE);
		btnO.setBackground(Color.BLACK);
		btnO.setBounds(628, 155, 75, 119);
		getContentPane().add(btnO);

		JButton G_s = new JButton("Y");
		G_s.setForeground(Color.WHITE);
		G_s.setBackground(Color.BLACK);
		G_s.setBounds(383, 155, 75, 119);
		getContentPane().add(G_s);
		
		JButton btnI_1 = new JButton("U");
		btnI_1.setForeground(Color.WHITE);
		btnI_1.setBackground(Color.BLACK);
		btnI_1.setBounds(459, 155, 75, 119);
		getContentPane().add(btnI_1);
		
		JButton D_s = new JButton("E");
		D_s.setForeground(SystemColor.window);
		D_s.setBackground(Color.BLACK);
		D_s.setBounds(144, 155, 75, 119);
		getContentPane().add(D_s);
		
		JButton F_s = new JButton("T");
		F_s.setForeground(Color.WHITE);
		F_s.setBackground(Color.BLACK);
		F_s.setBounds(306, 155, 75, 119);
		getContentPane().add(F_s);
		
	
		JButton C = new JButton("A");
		C.setBackground(SystemColor.window);
		C.setBounds(20, 271, 83, 159);
		getContentPane().add(C);
		
		JButton D = new JButton("S");
		D.setBackground(SystemColor.window);
		D.setBounds(100, 271, 83, 159);
		getContentPane().add(D);

		JButton E = new JButton("D");
		E.setBackground(SystemColor.window);
		E.setBounds(180, 271, 83, 159);
		getContentPane().add(E);
		
		JButton F = new JButton("F");	
		F.setBackground(SystemColor.window);
		F.setBounds(260, 271, 83, 159);
		getContentPane().add(F);
		
		JButton G = new JButton("G");	
		G.setBackground(SystemColor.window);
		G.setBounds(340, 271, 83, 159);
		getContentPane().add(G);
	
		
		JButton A = new JButton("H");
		A.setBackground(SystemColor.window);
		A.setBounds(420, 271, 83, 159);
		getContentPane().add(A);
		
		
		JButton B = new JButton("J");
		B.setBackground(SystemColor.window);
		B.setBounds(500, 271, 83, 159);
		getContentPane().add(B);
		
		JButton Cc = new JButton("K");
		Cc.setBackground(Color.WHITE);
		Cc.setBounds(580, 271, 83, 159);
		getContentPane().add(Cc);
		
		JButton Dd = new JButton("L");
		Dd.setBackground(Color.WHITE);
		Dd.setBounds(660, 271, 83, 159);
		getContentPane().add(Dd);
		
		JButton Ee = new JButton(";");
		Ee.setBackground(Color.WHITE);
		Ee.setBounds(740, 271, 83, 159);
		getContentPane().add(Ee);
		
		JButton Music = new JButton("æ«∫∏");
		Music.setBounds(20, 469, 257, 89);
		getContentPane().add(Music);
		
		JButton piano = new JButton("««æ∆≥Î");
		piano.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'a') {
					C.setBackground(Color.red);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\Music_Note\\Music_Note\\C.wav"));
						Clip clip = AudioSystem.getClip();
	
						clip.open(audioInputStream);
						
						clip.start();
						
						
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 's') {
					C.setBackground(Color.white);
					D.setBackground(Color.red);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\Music_Note\\Music_Note\\D.wav"));
						Clip clip = AudioSystem.getClip();
						clip.close();
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'd') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.red);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\Music_Note\\Music_Note\\E.wav"));
						Clip clip = AudioSystem.getClip();
						
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'f') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.red);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\Music_Note\\Music_Note\\F.wav"));
						Clip clip = AudioSystem.getClip();
				
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'g') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.red);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\Music_Note\\Music_Note\\G.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'h') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.red);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\Music_Note\\Music_Note\\A.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'j') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.red);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\Music_Note\\Music_Note\\B.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			
				else if(e.getKeyChar() == 'k') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.red);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\Music_Note\\Music_Note\\C1.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'l') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.red);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\Music_Note\\Music_Note\\D1.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == ';') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.red);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\Music_Note\\Music_Note\\E1.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == '"') {
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\Music_Note\\Music_Note\\F1.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				
				else if(e.getKeyChar() == 'w') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.green);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\Music_Note\\Music_Note\\C_s.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				
				else if(e.getKeyChar() == 'e') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.green);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.black);
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\Music_Note\\Music_Note\\D_s.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				
				else if(e.getKeyChar() == 't') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.green);
					G_s.setBackground(Color.black);
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\Music_Note\\Music_Note\\F_s.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
				else if(e.getKeyChar() == 'y') {
					C.setBackground(Color.white);
					D.setBackground(Color.white);
					E.setBackground(Color.white);
					F.setBackground(Color.white);
					G.setBackground(Color.white);
					A.setBackground(Color.white);
					B.setBackground(Color.white);
					Cc.setBackground(Color.white);
					Dd.setBackground(Color.white);
					Ee.setBackground(Color.white);
					C_s.setBackground(Color.black);
					D_s.setBackground(Color.black);
					F_s.setBackground(Color.black);
					G_s.setBackground(Color.green);
					try {
						AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("C:\\Users\\96090\\eclipse-workspace\\TestProject\\Music_Note\\Music_Note\\G_s.wav"));
						Clip clip = AudioSystem.getClip();
			
						clip.open(audioInputStream);
						clip.start();
					}
					catch(Exception ex) {
						
					}
					
				}
			}
		});
		piano.setBounds(515, 25, 97, 70);
		getContentPane().add(piano);
		
		JButton guitar = new JButton("±‚≈∏");
		guitar.setBounds(624, 25, 97, 70);
		getContentPane().add(guitar);
		
		JButton drum = new JButton("µÂ∑≥");
		drum.setBounds(736, 25, 97, 70);
		getContentPane().add(drum);
		
		JButton SAVE = new JButton("≥Ï¿Ω");
		SAVE.setBounds(726, 469, 97, 89);
		getContentPane().add(SAVE);
		
		JLabel lblNewLabel = new JLabel("±◊∏≤");
		lblNewLabel.setBounds(20, 25, 429, 89);
		getContentPane().add(lblNewLabel);
		
	
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("5ø¡≈∏∫Í");
		comboBox.addItem("4ø¡≈∏∫Í");
		comboBox.addItem("3ø¡≈∏∫Í");
		getContentPane().add(comboBox);
		comboBox.setBounds(329, 469, 129, 82);
		getContentPane().add(comboBox);
		
		JButton btnDispose = new JButton("¥›±‚");
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				}
			});
		btnDispose.setBounds(523, 488, 100, 50);
		getContentPane().add(btnDispose);

		
		
		setSize(865, 604);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);//«¡∑π¿” Ω∫≈©∏∞ ¡ﬂæ”
		setResizable(false);//«¡∑π¿” Ω∫≈©∏∞ ≈©±‚ ∫Ø∞Ê ∫“∞°¥…
		setTitle("πŒºˆ¬Ø");
		setVisible(true);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	    
}
