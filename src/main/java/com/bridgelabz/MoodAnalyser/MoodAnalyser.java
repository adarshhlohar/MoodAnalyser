package com.bridgelabz.MoodAnalyser;

public class MoodAnalyser {
	private String mood;

	  MoodAnalyser(String mood) {
		  this.mood = mood;
	}
	  
	  public String analyseMood() {
		  if(mood == "I am in Sad Mood") {
			  return "Sad";
		  }
		  return null;
	  }
}
