package net.bluemix.droneselfie;

import com.google.gson.Gson;

public class ImageTag {
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	private String url;
	private String age;
	private String gender;
	
	 @Override
	public String toString() {
		 return new Gson().toJson(this);
	}
	
}
