package com.myprofile;

public class BoopathiProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstant.FIRST_NAME+"Boopathi");
		System.out.println(ProfileConstant.LAST_NAME+"Raja");
		System.out.println(ProfileConstant.AGE+"20");
	}

	@Override
	public void myHobbies() {
		System.out.println("My hobbies is Playing Cricket");
	}
	
	

}
