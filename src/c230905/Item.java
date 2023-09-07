package c230905;

class Item {
	private	String name;
	private boolean equipped;
	
	private int defense;
	private int attack;
	
	public Item(String name, int defense, int attack)
	{
		this.name = name;
		this.equipped=false;
		this.defense = defense;
		this.attack=attack;
	}
	public String getName() {
		return name;
	}
	public boolean isEquipped() {
		return equipped;
	}
	public void equip() {
		equipped=true;
		System.out.println(name+"을(를) 장착함");
	}
	public void unequip() {
		equipped=false;
		System.out.println(name+"을(를) 탈착함");
	}
	public int getDefense() {
		return defense;
	}
	public int getAttack() {
		return attack;
	}
	
	
	
	
}
