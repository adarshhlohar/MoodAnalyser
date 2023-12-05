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
	public String analyseMood(String mood) {
		if (mood == "I am in Sad Mood") {
			return "Sad";
		} else {
			return "Happy";
		}
	}

}
