import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartMenu extends JFrame implements KeyListener{
	
	private final int D_W = 500;
	private final int D_H = 645;
	private int x = 140;
	private int y = 325;
	
	private JPanel panel;
	private JButton b;
	
	public StartMenu(){
		
		panel = new JPanel();
		
		b = new JButton(new ImageIcon("images/play.png"));
		b.setBorder(null);
		b.setBackground(new Color(0x6BB94A));

		panel.add(b);
		panel.setBounds(x, y, 185, 75);
		
		add(panel);
		setTitle("Main Menu");
		setSize(D_W, D_H);
		setLayout(null);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		addKeyListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Calls the DoodleJump class when clicked to the button
		b.addActionListener((ActionEvent e) -> {
            new DoodleJump();
            setVisible(false);
        }); 
	}
	
	public void paint(Graphics g) {
		g.drawImage(Assets.background, 0, 0, this);
		g.drawImage(Assets.doodleForMenu, 120, 195, this);
	}
	
	public static void main(String[] args) {
		new StartMenu();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		// Calls the DoodleJump class when pressed to the space
		int keycode = e.getKeyCode(); 
	    if (keycode == KeyEvent.VK_SPACE)
	    {
		    new DoodleJump();
		    setVisible(false);
	    }
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
