import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;



public class HoneyPuddle {

	int x;
	int y;
	int width;
	int height;
	float slowDownPerc;
	boolean spawned;
	int timeAlive;
	boolean [] slowsDown;
	BufferedImage texture;
	
	void spawn(int x, int y, int width, int height, BufferedImage texture, int timeAliveTotal, float slowDownPerc) {
		this.texture = texture;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.slowDownPerc = slowDownPerc;
		spawned = true;
		this.timeAlive = timeAliveTotal;
		update();
	}
	
	void despawn() {
		spawned = false;
	}
	
	void update() {
		final Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if(isSpawned()) {
					for(int i = 0; i < 100; i++) {
						trySlowDown(Game.wAnt[i], i);
						trySlowDown(Game.mAnt[i], i);
						trySlowDown(Game.sAnt[i], i);
						trySlowDown(Game.drone[i], i);
						trySlowDown(Game.tank[i], i);
					}
					checkTimeLeftAlive();
				}
				else {
					timer.cancel();
				}
			}
			
		}, 0, 10);
	}
	
	boolean checkKollisions(Enemy e) {
		boolean isKolliding = false;
		if(e.getX() < getX() + getWidth() && e.getX() + e.getWidth() > getX()) {	
			if(e.getY() < getY() + getHeight() && e.getY() + e.getHeight() > getY()) {
				isKolliding = true;
			}
		}
		return isKolliding;
	}
	
	void checkTimeLeftAlive() {
		if(isSpawned()) {
			if(timeAlive > 0) {
				timeAlive = timeAlive - 1;
			}
			else {
				despawn();
			}
		}
	}
	
	void trySlowDown(Enemy e, int m) {
		
		if(checkKollisions(e) == false) {
			if(e.getSlowedDown() == this) {
				e.setSlowedDown(null);
				e.setMovDur(e.getL().speed);
				e.setSpeed(1);
				System.out.println("unslowed");
			}
		}
		else if(checkKollisions(e) == true) {
			if(e.getSlowedDown() == null) {
				e.setSlowedDown(this);
				float s = 0;
				s = e.getMovDur() * slowDownPerc;
				e.setMovDur((int)s);
				e.setSpeed(e.getSpeed() - 1);;
				System.out.println(slowDownPerc);
			}
		}
	}
	
	void draw(Graphics2D g) {
		if(isSpawned()) {
			g.drawImage(getTexture(), getX(), getY(), getWidth(), getHeight(), null);
		}
	}
	
	
	//Getter und Setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public BufferedImage getTexture() {
		return texture;
	}

	public void setTexture(BufferedImage texture) {
		this.texture = texture;
	}

	public float getSlowDownPerc() {
		return slowDownPerc;
	}

	public void setSlowDownPerc(float slowDownPerc) {
		this.slowDownPerc = slowDownPerc;
	}

	public boolean isSpawned() {
		return spawned;
	}

	public void setSpawned(boolean spawned) {
		this.spawned = spawned;
	}

	public int getTimeAlive() {
		return timeAlive;
	}

	public void setTimeAlive(int timeAlive) {
		this.timeAlive = timeAlive;
	}
	
}
