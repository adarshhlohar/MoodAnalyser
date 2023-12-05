package com.bridgelabz.MoodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {


	/*
	 * In this Repeat TC-1.1 We can setting the mood directly in by using the constructor 
	 * We can give input "I am in Sad Mood" to the MoodAnalyserConstructor it will set it.
	 * And in the analyseMoodByConsructor method we return the value if the "I am in Sad Mood"
	 * It will Return the Sad 
	 */
	@Test
	public void givenMoodInConstructorShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMoodByConsructor();
		assertEquals("Sad", mood);
	}
	
	/*
	 * In this Repeat TC-1.2 We can setting the mood directly in by using the constructor 
	 * We can give input "I am in Happy Mood" to the MoodAnalyserConstructor it will set it.
	 * And in the analyseMoodByConsructor method we return the value if the input is "I am in Happy Mood"
	 * It will Return the Sad 
	 */
	@Test
	public void givenMoodInConstructorHappyShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String mood = moodAnalyser.analyseMoodByConsructor();
		assertEquals("Sad", mood);
	}

	/*
	 * In this Repeat TC-1.2 We can setting the mood directly in by using the constructor 
	 * We can give input "I am in Happy Mood" to the MoodAnalyserConstructor it will set it.
	 * And in the analyseMoodByConsructor method we return the value if the input is "I am in Happy Mood"
	 * It will Return the Sad 
	 */
	@Test
	public void givenMoodAnalyseMoodMethodNotHaveParamsReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood();
		assertEquals("Happy", mood);
	}
	
	
	
	/*
	 * Test 1.1 In this test method we can give input to the analyseMood method as "I am In Sad Mood"
	 * Then if it will return the "Sad" This test Case Should pass Successefully
	 */
	@Test
	public void analyseMoodIfSadMoodReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Sad Mood");
		assertEquals("Sad", mood);
	}

	
	/*
	 * Test 1.2 In this test method we can give input to the analyseMood method as "I am in Any Mood" for any other than "I am In Sad Mood"
	 * Then if it will return the "Happy" This test Case Should pass Successefully
	 */
	@Test
	public void analyseMoodForAnyMoodReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Any Mood");
		assertEquals("Happy", mood);
	}
}
