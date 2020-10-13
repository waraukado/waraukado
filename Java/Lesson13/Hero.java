public class Hero {
	private String name;
	private int hp;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException
			("名前がnullですよ");
		}
		this.name = name;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}
