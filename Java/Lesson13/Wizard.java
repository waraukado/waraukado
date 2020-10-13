public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		// h.hp = h.hp + recovPoint;
		// h.hp += recovPoint;
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Wand getWand() {
		return this.wand;
	}

	public void setWand(Wand wand) {
		this.wand = wand;
	}
}
