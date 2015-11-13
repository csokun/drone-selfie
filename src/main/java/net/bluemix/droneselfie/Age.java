package net.bluemix.droneselfie;

public class Age {
	private String score;

	private String ageRange;

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}

	@Override
	public String toString() {
		return "ClassPojo [score = " + score + ", ageRange = " + ageRange + "]";
	}
}
