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

	// It will the MoodAnalyser deafult constructor
	public MoodAnalyser() {

	}

	// It is method if the condition is satisfy it will return "SAD" or it will
	// return null
	public String analyseMoodByConsructor() throws InvalidParameterException {
		if (mood == "I am in Sad Mood" || mood == "I am in Happy Mood") {
			return "Sad";
		}
		throw new InvalidParameterException("Mood is null");
	}

	/*
	 * This is used for the creating object and setting by analyseMood
	 */
	public String analyseMood(String mood) throws InvalidParameterException {
		if (mood == "I am in Sad Mood") {
			return "Sad";
		}else if(mood == null) {
			throw new InvalidParameterException("Youre Entered Null ");
		}else {
			return "Happy";
		}
	}

	/*
	 * If the analyseMood method cannot take any parameter it should be return the
	 * mood as "Happy"
	 */
	public String analyseMood() throws InvalidParameterException{
		throw new InvalidParameterException("Youre does not Entered Anything");
	}

}
