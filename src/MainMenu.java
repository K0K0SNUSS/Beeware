import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JButton;


public class MainMenu {

	JButton start = new JButton();
	public int gamemode;
	private BufferedImage backgroundTexture;
	
	MainMenu() {
		backgroundTexture = Bilder.icon;
		gamemode = 0;
		start.setBounds(300, 400, 300, 50);
	}
	
	void draw(Graphics2D g) {
		g.drawImage(backgroundTexture, 0, 0, 900, 922, null);
		buttonHandler.drawButtons(g);
	}

	//Getter und Setter
	public int getGamemode() {
		return gamemode;
	}

	public void setGamemode(int started) {
		this.gamemode = started;
	}

	public BufferedImage getBackgroundTexture() {
		return backgroundTexture;
	}

	public void setBackgroundTexture(BufferedImage backgroundTexture) {
		this.backgroundTexture = backgroundTexture;
	}
	
	
	
}
