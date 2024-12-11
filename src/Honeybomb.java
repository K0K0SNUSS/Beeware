


public class Honeybomb extends Tower{

	Honeybomb() {
		setL(Lvl.Honeypop);
		setLvl(getL());
		setBaseNextLvl(Lvl.Honeyburst);
		setRange(50);
		setPrice(getLvl().getPrice());
		setDamage(getLvl().getDam());
		setCooldown(getLvl().getCooldown());
		setTexture(Bilder.honeyBomb[0]);
		setExplosive(true);
		setExplRange(60);
		setPuddleSpawner(false);
		setTarget(Game.wAnt[0]);
	}
	
}
