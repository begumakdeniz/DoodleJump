import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Menu extends JFrame implements KeyListener{
	
	private final int D_W = 300;
	private final int D_H = 300;
	
	public Menu() {
		
		setTitle("Menu");
		setResizable(false);
		setSize(D_W, D_H);
		setLocationRelativeTo(null);
		addKeyListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g) {
		g.drawImage(Assets.background, 0, 0, this);
		
		g.setColor(Color.red);
		g.setFont(new Font("Arial", 1, 25));
		
		g.drawString("X - Play Again!", D_W/2-70, D_H/2 - 70);
		g.drawString("M - Mute!", D_W/2 - 70, D_H/2 - 10);
		g.drawString("U - Unmute!", D_W/2 - 70, D_H/2 + 50);
		g.drawString("E - Exit!", D_W/2 - 70, D_H/2 + 110);
	}
	
	public void open() {
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		   
		int keycode = e.getKeyCode(); 
	   	if (keycode == KeyEvent.VK_ESCAPE) {
	   		setVisible(false);
	   	}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
