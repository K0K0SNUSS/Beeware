import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class Bilder {

	static BufferedImage path, grass, menuSmall, menuBig, beehive, honeyExpl, combslingStill, honeyBombStill, comb, spike, towerBase, honeyPuddle, icon;
	static BufferedImage tree, startSelected, start, backToMainMenu, backToMainMenuSelected, Towers, TowersSelected, startWave, startWaveSelected, honeyPuddleThrower;
	static BufferedImage spikesButton, spikesButtonSelected, combslingButton, combslingButtonSelected, honeybombButton, honeybombButtonSelected, honeyThrowerButton, honeyThrowerButtonSelected;
	static BufferedImage anthill, gameOver, gameOver1, upgradeButton, upgradeButtonSelected, sellButton, sellButtonSelected;
	static BufferedImage[] workerAnt = new BufferedImage[3];
	static BufferedImage[] workerAntR = new BufferedImage[3];
	static BufferedImage[] workerAntRR = new BufferedImage[3];
	static BufferedImage[] majorAnt = new BufferedImage[3];
	static BufferedImage[] majorAntR = new BufferedImage[3];
	static BufferedImage[] majorAntRR = new BufferedImage[3];
	static BufferedImage[] soliderAnt = new BufferedImage[3];
	static BufferedImage[] soliderAntR = new BufferedImage[3];
	static BufferedImage[] soliderAntRR = new BufferedImage[3];
	static BufferedImage[] drone = new BufferedImage[3];
	static BufferedImage[] droneR = new BufferedImage[3];
	static BufferedImage[] droneRR = new BufferedImage[3];
	static BufferedImage[] stickTank = new BufferedImage[1];
	static BufferedImage[] stickTankR = new BufferedImage[1];
	static BufferedImage[] stickTankRR = new BufferedImage[1];
	static BufferedImage[] honeyBomb = new BufferedImage[7];
	static BufferedImage[] bee = new BufferedImage[3];
	static BufferedImage[] combsling = new BufferedImage[8];
	
	private static Graphics2D g2d;
	
	Bilder() {
		try {
			for(int i = 0; i <= 2; i++) {
				workerAnt[i] = ImageIO.read(new File("rsc/WorkerAnt " + i + ".png"));
				workerAntR[i] = ImageIO.read(new File("rsc/WorkerAntR " + i + ".png"));
				workerAntRR[i] = ImageIO.read(new File("rsc/WorkerAntRR " + i + ".png"));
			}
			for(int i = 0; i <= 2; i++) {
				majorAnt[i] = ImageIO.read(new File("rsc/MajorAnt " + i + ".png"));
				majorAntR[i] = ImageIO.read(new File("rsc/MajorAntR " + i + ".png"));
				majorAntRR[i] = ImageIO.read(new File("rsc/MajorAntRR " + i + ".png"));
			}
			for(int i = 0; i <= 2; i++) {
				soliderAnt[i] = ImageIO.read(new File("rsc/SoliderAnt " + i + ".png"));
				soliderAntR[i] = ImageIO.read(new File("rsc/SoliderAntR " + i + ".png"));
				soliderAntRR[i] = ImageIO.read(new File("rsc/SoliderAntRR " + i + ".png"));
			}
			for(int i = 0; i <= 2; i++) {
				drone[i] = ImageIO.read(new File("rsc/Drone " + i + ".png"));
				droneR[i] = ImageIO.read(new File("rsc/DroneR " + i + ".png"));
				droneRR[i] = ImageIO.read(new File("rsc/DroneRR " + i + ".png"));
			}
			for(int i = 0; i <= 0; i++) {
				stickTank[i] = ImageIO.read(new File("rsc/StickTank " + i + ".png"));
				stickTankR[i] = ImageIO.read(new File("rsc/StickTankR " + i + ".png"));
				stickTankRR[i] = ImageIO.read(new File("rsc/StickTankRR " + i + ".png"));
			}
			for(int i = 0; i <= 2; i++) {
				bee[i] = ImageIO.read(new File("rsc/Bee " + i + ".png"));
			}
			for(int i = 0; i <= 3; i++) {
				combsling[i] = ImageIO.read(new File("rsc/Combsling " + i + ".png"));
			}
			for(int i = 4; i <= 7; i++) {
				combsling[i] = ImageIO.read(new File("rsc/Combsling " + (7 - i) + ".png"));
			}
			for(int i = 0; i <= 3; i++) {
				honeyBomb[i] = ImageIO.read(new File("rsc/HoneyBombThrower " + i + ".png"));
			}
			for(int i = 3; i <= 6; i++) {
				honeyBomb[i] = ImageIO.read(new File("rsc/HoneyBombThrower " + (6 - i) + ".png"));
			}
			grass = ImageIO.read(new File("rsc/Grass.png"));
			path = ImageIO.read(new File("rsc/Path.png"));
			menuSmall = ImageIO.read(new File("rsc/MenuSmall.png"));
			beehive = ImageIO.read(new File("rsc/Beehive.png"));
			menuBig = ImageIO.read(new File("rsc/MenuBig.png"));
			honeyExpl = ImageIO.read(new File("rsc/HoneyExpl.png"));
			combslingStill = ImageIO.read(new File("rsc/Combsling 14.png"));
			comb = ImageIO.read(new File("rsc/comb.png"));
			spike = ImageIO.read(new File("rsc/Spikes.png"));
			honeyBombStill = ImageIO.read(new File("rsc/Honeybomb 0 : 10.png"));
			towerBase = ImageIO.read(new File("rsc/TowerBase.png"));
			honeyPuddle = ImageIO.read(new File("rsc/HoneyPuddle.png"));
			icon = ImageIO.read(new File("rsc/Beeware Icon.png"));
			tree = ImageIO.read(new File("rsc/Tree.png"));
			start = ImageIO.read(new File("rsc/Start.png"));
			startSelected = ImageIO.read(new File("rsc/StartSelected.png"));
			TowersSelected = ImageIO.read(new File("rsc/TowersSelected.png"));
			Towers = ImageIO.read(new File("rsc/Towers.png"));
			backToMainMenuSelected = ImageIO.read(new File("rsc/BackToMainMenuSelected.png"));
			backToMainMenu = ImageIO.read(new File("rsc/BackToMainMenu.png"));
			startWaveSelected = ImageIO.read(new File("rsc/startWaveSelected.png"));
			startWave = ImageIO.read(new File("rsc/startWave.png"));
			honeyPuddleThrower = ImageIO.read(new File("rsc/HoneyPuddleThrower.png"));
			spikesButton = ImageIO.read(new File("rsc/SpikesButton.png"));
			spikesButtonSelected = ImageIO.read(new File("rsc/SpikesButtonSelected.png"));
			combslingButtonSelected = ImageIO.read(new File("rsc/CombslingButtonSelected.png"));
			combslingButton = ImageIO.read(new File("rsc/CombslingButton.png"));
			honeybombButton = ImageIO.read(new File("rsc/HoneybombButton.png"));
			honeybombButtonSelected = ImageIO.read(new File("rsc/HoneybombButtonSelected.png"));
			honeyThrowerButton = ImageIO.read(new File("rsc/HoneyThrowerButton.png"));
			honeyThrowerButtonSelected = ImageIO.read(new File("rsc/HoneyThrowerButtonSelected.png"));
			anthill = ImageIO.read(new File("rsc/Anthill.png"));
			gameOver = ImageIO.read(new File("rsc/GameOver.png"));
			gameOver1 = ImageIO.read(new File("rsc/GameOver1.png"));
			upgradeButton = ImageIO.read(new File("rsc/upgradeButton.png"));
			upgradeButtonSelected = ImageIO.read(new File("rsc/upgradeButtonSelected.png"));
			sellButtonSelected = ImageIO.read(new File("rsc/sellButtonSelected.png"));
			sellButton = ImageIO.read(new File("rsc/sellButton.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden");
		}
	}
	
	static void rotate(BufferedImage i, double rot, Graphics2D g, int x, int y) {
		ImageIcon icon = new ImageIcon(i);
		BufferedImage blankCanvas = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
		g2d = g;
		g2d.rotate(Math.toRadians(rot), x + (icon.getIconWidth()/ 2), y + (icon.getIconHeight()/ 2));
		g2d.drawImage(i, x, y, icon.getIconWidth(), icon.getIconHeight(), null);
		g2d.rotate(Math.toRadians(-rot), x + (icon.getIconWidth()/ 2), y + (icon.getIconHeight()/ 2));
		i = blankCanvas;
	}
	
}
