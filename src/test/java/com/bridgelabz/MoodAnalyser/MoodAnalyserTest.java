package com.bridgelabz.MoodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {
	
	@Test
	public void givenMoodInConstructorShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("Sad", mood);
	}
	
	@Test
	public void analyseMoodIfSadMoodReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood();
		assertEquals("Sad", mood);
	}
}
