package com.bridgelabz.MoodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {


	MoodAnalyser moodAnalyser;

	@Before
	public void setUp() {
		moodAnalyser = new MoodAnalyser();
	}

	@Test
	public void givenMoodInConstructorShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("Sad", mood);
	}

	@Test
	public void analyseMoodIfSadMoodReturnSad() {
		String mood = moodAnalyser.analyseMood("I am in Sad Mood");
		assertEquals("Sad", mood);
	}

	@Test
	public void analyseMoodForAnyMoodReturnHappy() {
		String mood = moodAnalyser.analyseMood("I am in Any Mood");
		assertEquals("Happy", mood);
	}
}
