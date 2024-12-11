import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;


@SuppressWarnings("serial")
public class Label extends JLabel {
	
	protected void paintComponent(Graphics g1) {	
		Graphics2D g = (Graphics2D) g1;
		super.paintComponent(g);

		
	switch(Game.mainMenu.gamemode) {
	
//In-Game
	case 1: 
		//Generelles
				buttonHandler.drawButtons(g);
		
		//Map
		Game.grid.draw(g);
		for(int i = 0; i < Game.obsticles.length; i++) {
			if(Game.obsticles[i].isSpawned())
				Game.obsticles[i].draw(g);
			}
		
		//Honigpf�tze
		for(int i = 0; i < Game.thrower.length; i++) {
			Game.puddle[i].draw(g);
		}
		//gegner
				for(int i = 0; i < 100; i++) {
					Game.tank[i].draw(g);	
				}	
				for(int i = 0; i < 100; i++) {
					Game.wAnt[i].draw(g);
				}
				for(int i = 0; i < 100; i++) {
					Game.mAnt[i].draw(g);
				}
				for(int i = 0; i < 100; i++) {
					Game.sAnt[i].draw(g);
				}
				for(int i = 0; i < 100; i++) {
					Game.drone[i].draw(g);
				}
					

		//Anderes	
		Game.player.draw(g);
		
		//T�rme
		for(int i = 0; i < Game.thrower.length; i++) {
			Game.thrower[i].draw(g);
		}
		for(int i = 0; i < Game.catapult.length; i++) {
			Game.catapult[i].draw(g);
		}
		for(int i = 0; i < Game.expl.length; i++) {
			Game.expl[i].draw(g);
		}
		for(int i = 0; i < Game.bomb.length; i++) {
			Game.bomb[i].draw(g);
		}
		for(int i = 0; i < Game.bomb.length; i++) {
			Game.spike[i].draw(g);
		}
		for(int i = 0; i < Game.projectiles.length; i++) {
			Game.projectiles[i].draw(g);
		}
		
		
		//Bees
		for(int i = 0; i < Game.player.getHP(); i++) {
			Game.bee[i].draw(g);
		}
		
		//stats
		Game.player.drawStats(g);
		
		//Buttons
		if(Game.player.isMenu()) {
			g.drawImage(Bilder.menuBig, 780, 20, 110, 500, null);
		}
		
		//Menu der t�rme
		//Generelles
		buttonHandler.drawButtons(g);
				for(int i = 0; i < Game.thrower.length; i++) {
					if(Game.thrower[i].isChosen())
					Game.thrower[i].drawMenu(g);
				}
				for(int i = 0; i < Game.catapult.length; i++) {
					if(Game.catapult[i].isChosen())
						Game.catapult[i].drawMenu(g);
				}
				for(int i = 0; i < Game.bomb.length; i++) {
					if(Game.bomb[i].isChosen())
						Game.bomb[i].drawMenu(g);
				}
				for(int i = 0; i < Game.bomb.length; i++) {
					if(Game.spike[i].isChosen())
						Game.spike[i].drawMenu(g);;
				}
		
		break;
//Hauptmen�
	case 0:
			Game.mainMenu.draw(g);
			//Generelles
			buttonHandler.drawButtons(g);
		break;
	
//Game Over
	case 2:
			g.setColor(new Color(30, 30, 30, 255));
			g.fillRect(0, 0, 922, 922);
			g.drawImage(Bilder.gameOver, 0, 0, 900, 922, null);
			g.setColor(Color.black);
			g.setFont(new Font("Noteworthy",Font.BOLD, 100));
			g.drawString("Game Over", 210, 390);
			//Generelles
			buttonHandler.drawButtons(g);
		break;
	}
	
	repaint();		
	}
}
