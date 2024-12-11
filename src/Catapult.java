


public class Catapult extends Tower{

	Catapult() {
		setL(Lvl.Combsling);
		setLvl(getL());
		setBaseNextLvl(Lvl.Crosscomb);
		setRange(70);
		setPrice(getLvl().getPrice());
		setDamage(getLvl().getDam());
		setCooldown(getLvl().getCooldown());
		setTexture(Bilder.combslingStill);
		setExplosive(false);
		setPuddleSpawner(false);
		setTarget(Game.wAnt[0]);
	}
	
	
}
