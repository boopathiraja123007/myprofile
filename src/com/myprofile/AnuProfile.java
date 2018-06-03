package com.myprofile;

public class AnuProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println("Anu");
		System.out.println("LastName :King");
		System.out.println("nAge :20");
	}

	@Override
	public void myHobbies() {
		System.out.println("My hobby is sleeping");
	}

	
}
