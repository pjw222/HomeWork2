package homework.h230822;

public class Characters
{
	public String gender;
	public String kind;
	public String[][] voice;
	public String[] job;
	public String[] waepon;
	public String[] subWaepon;
	public String mainStatus;
	public String[] subStatus;
	public String[] jobList;
	public String[][] globalWriting;
	public double[] waeponRate;
	public int attackSpeed;
	public double workmanwhip;
	public String[] property;
	public double subAttack;
	public int defense;
	public double allTolerance;
	public int evasion;
	public int stance;
	public boolean isStance;
	public boolean isMagicGuard;
	public double damageReduction;
	public int damageAbsorption;
	public int damageRateReduction;
	public boolean isGuard;
	public int criticalRate;
	public int criticalDamage;
	public double movingSpeed;
	public double maxMovingSpeed;
	public double jumpingPower;
	
	public Characters
	(
			String gender,
			String kind,
			String[][] voice,
			String[] job,
			String[] waepon,
			String[] subWaepon,
			String mainStatus,
			String[] subStatus,
			String[] jobList,
			String[][] globalWriting,
			double[] waeponRate,
			int attackSpeed,
			double workmanwhip,
			String[] property,
			double subAttack,
			int defense,
			double allTolerance,
			int evasion,
			int stance,
			boolean isStance,
			boolean isMagicGuard,
			double damageReduction,
			int damageAbsorption,
			int damageRateReduction,
			boolean isGuard,
			int criticalRate,
			int criticalDamage,
			double movingSpeed,
			double maxMovingSpeed,
			double jumpingPower
	)
	{
		this.gender = gender;
		this.kind = kind;
		this.voice = voice;
		this.job = job;
		this.waepon = waepon;
		this.subWaepon = subWaepon;
		this.mainStatus = mainStatus;
		this.subStatus = subStatus;
		this.jobList = jobList;
		this.globalWriting = globalWriting;
		this.waeponRate = waeponRate;
		this.attackSpeed = attackSpeed;
		this.workmanwhip = workmanwhip;
		this.property = property;
		this.subAttack = subAttack;
		this.defense = defense;
		this.allTolerance = allTolerance;
		this.evasion = evasion;
		this.stance = stance;
		this.isStance = isStance;
		this.isMagicGuard = isMagicGuard;
		this.damageReduction = damageReduction;
		this.damageAbsorption = damageAbsorption;
		this.isGuard = isGuard;
		this.criticalRate = criticalRate;
		this.criticalDamage = criticalDamage;
		this.movingSpeed = movingSpeed;
		this.maxMovingSpeed = maxMovingSpeed;
		this.jumpingPower = jumpingPower;
	}

}

