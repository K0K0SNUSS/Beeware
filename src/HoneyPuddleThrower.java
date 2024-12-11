
public class HoneyPuddleThrower extends Tower{

	HoneyPuddleThrower() {
		setL(Lvl.Thrower);
		setBaseNextLvl(Lvl.Launcher);
		setLvl(getL());
		setRange(80);
		setPrice(getLvl().getPrice());
		setDamage(getLvl().getDam());
		setCooldown(getLvl().getCooldown());
		setTexture(Bilder.honeyPuddleThrower);
		setExplosive(false);
		setExplRange(0);
		setPuddleSpawner(true);
		setSlowPerc(getLvl().slowDownRate);
		setTarget(Game.wAnt[0]);
	}
	
}
