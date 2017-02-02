
public enum LunaFish {

	jaffa("cookie with orange", 5.0),
	medenoSrce("heart-shaped cookie", 4.9),
	munchMellow("delicous cooke", 4.6),
	euroBlock("block of white and black chocolate", 4.5),
	najlepseZelje("one of the most tastefull chocolate", 4.8),
	strauss("Family pack ice-cream",4.3);

	private final String desc;
	private final double grade;

	private LunaFish(String desc, double grade) {

		this.desc = desc;
		this.grade = grade;
	}

	public String getDesc() {
		return desc;
	}

	public double getGrade() {
		return grade;
	}
	
}
