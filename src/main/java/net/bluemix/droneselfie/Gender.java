package net.bluemix.droneselfie;

public class Gender {
	private String score;

	private String gender;

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "ClassPojo [score = " + score + ", gender = " + gender + "]";
	}
}