package com.bridgelabz.MoodAnalyser;

/*
 * Description - In this Class We can created two constructor one is default and another one is parameterised it will for Tc-1.1 We can
 * 				set the value of constructor directly.
 * method - There is analyseMood function it cannot take any param it will check the mood the constructor will set this
 */
public class MoodAnalyser {
	private String mood;

	// It will the parameterised Constructor
	public MoodAnalyser(String mood) {
		this.mood = mood;
	}

	//It will the MoodAnalyser deafult constructor
	public MoodAnalyser() {
		
	}
	

	// It is method if the condition is satisfy it will return "SAD" or it will
	// return null
	public String analyseMoodByConsructor() {
		if (mood == "I am in Sad Mood") {
			return "Sad";
		}
		return null;

	}
	
	/*
	 * This is used for the creating object and setting by analyseMood
	 */
	public String analyseMood(String mood) {
		if (mood == "I am in Sad Mood") {
			return "Sad";
		} else {
			return "Happy";
		}
	}

}
