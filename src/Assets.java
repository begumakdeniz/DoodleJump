

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Assets {
	
	public static BufferedImage doodleForMenu = loadImage("images/doodleForMenu.png");
	public static BufferedImage background = loadImage("images/background.png");
	public static BufferedImage playerLeft = loadImage("images/doodleLeft.png");
	public static BufferedImage playerRight = loadImage("images/doodleRight.png");
	
	public static BufferedImage loadImage(String path) {
		try {
			return ImageIO.read(new File(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}
	
}