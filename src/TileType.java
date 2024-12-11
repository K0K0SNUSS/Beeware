import java.awt.image.BufferedImage;


public enum TileType {

	Grass(Bilder.grass, true), Dirt(Bilder.path, false), Tower(Bilder.grass, false), Trap(Bilder.path,false);
	
	BufferedImage textureName;
	boolean buildable;
	
	TileType(BufferedImage textureName, boolean buildable) {
		this.buildable = buildable;
		this.textureName = textureName;
	}
	
}
