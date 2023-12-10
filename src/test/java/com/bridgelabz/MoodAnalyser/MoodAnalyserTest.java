package com.bridgelabz.MoodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	
	/*
	 * Test 1.1 In this test method we can give input to the analyseMood method as
	 * "I am In Sad Mood" Then if it will return the "Sad" This test Case Should
	 * pass Successefully
	 */
	@Test
	public void analyseMoodIfSadMoodReturnSad() {
		try {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Sad Mood");
		assertEquals("Sad", mood);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * Test 1.2 In this test method we can give input to the analyseMood method as
	 * "I am in Any Mood" for any other than "I am In Sad Mood" Then if it will
	 * return the "Happy" This test Case Should pass Successefully
	 */
	@Test
	public void analyseMoodForAnyMoodReturnHappy() {
		try {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Any Mood");
		assertEquals("Happy", mood);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	/*
	 * In this Repeat TC-1.1 We can setting the mood directly in by using the
	 * constructor We can give input "I am in Sad Mood" to the
	 * MoodAnalyserConstructor it will set it. And in the analyseMoodByConsructor
	 * method we return the value if the "I am in Sad Mood" It will Return the Sad
	 */
	@Test
	public void givenMoodInConstructorShouldReturnSad() {
		try {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMoodByConsructor();
		assertEquals("Sad", mood);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * In this Repeat TC-1.2 We can setting the mood directly in by using the
	 * constructor We can give input "I am in Happy Mood" to the
	 * MoodAnalyserConstructor it will set it. And in the analyseMoodByConsructor
	 * method we return the value if the input is "I am in Happy Mood" It will
	 * Return the Sad
	 */
	@Test
	public void givenMoodInConstructorHappyShouldReturnSad() {
		try {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String mood = moodAnalyser.analyseMoodByConsructor();
		assertEquals("Sad", mood);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * In this Repeat TC-1.2 We can setting the mood directly in by using the
	 * constructor We can give input "I am in Happy Mood" to the
	 * MoodAnalyserConstructor it will set it. And in the analyseMoodByConsructor
	 * method we return the value if the input is "I am in Happy Mood" It will
	 * Return the Sad
	 */
	@Test
	public void givenMoodAnalyseMoodMethodNotHaveParamsReturnHappy() {
		try {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood(null);
		assertEquals("Happy", mood);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	/*
	 * In this UC-2.1 If user will enter null data we can handle the exception
	 * We can give return as "Happy" to the MoodAnalyser it will
	 * set it. And in the givenMoodAnalyseUserEneterNullReturnExceptionMessage in this test method we return the value if the
	 * input is null It will Return the "Happy"
	 */
	@Test
	public void givenMoodAnalyseUserEneterNullReturnExceptionMessage() {
		try {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood(null);
		assertEquals("Happy", mood);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	/*
	 * In this Repeat UC-3 If user will enetr null or empty data we can handle the except.
	 * Inform user if entered Invalid Mood- 
	 * In case of NULL or Empty Mood throwCustom Exception MoodAnalysisException
	 */
	@Test
	public void givenMoodAnalyseUserEneterNullReturnInformation() {
		try {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood(null);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	
}
