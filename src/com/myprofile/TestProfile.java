package com.myprofile;

public class TestProfile {
	
public static void printProfile(IProfile profile)	{
	
	profile.myBasicInfo();
	profile.myHobbies();
	
}
public static void main(String[] args) {
	IProfile myProfile=new BoopathiProfile();
	printProfile(myProfile);
	IProfile anuProfile=new AnuProfile();
	printProfile(anuProfile);
	
}
}


