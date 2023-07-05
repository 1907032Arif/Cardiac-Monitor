package com.example.cardiac_monitor;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.Espresso.onView;


import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * This class contains instrumented tests for the SplashActivity.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest


public class SplashAcitivityTest {

    /**
     * Test case to verify if the SplashActivity is displayed.
     * It launches the SplashActivity and checks if the splash screen is displayed.
     */
    @Test
    public void test_isActivityInView() {
        onView(withId(R.id.splash)).check(matches(isDisplayed()));
    }

    /**
     * Test case to verify if the necessary UI elements are displayed in the SplashActivity.
     * It launches the SplashActivity and checks if the logo image, developer text, progress bar, and app title are displayed.
     */
    @Test
    public void test_isText_Progress_inView() {
        //image ta display hoise kina
        onView(withId(R.id.GfG_full_logo)).check(matches(isDisplayed()));
        //developed by text ta display korlo kina
        onView(withId(R.id.editTextTextMultiLine)).check(matches(isDisplayed()));
        //progress bar ta display korlo kina
        onView(withId(R.id.pbProcessing)).check(matches(isDisplayed()));
        //app title ta display krlo kina
        onView(withId(R.id.textView)).check(matches((isDisplayed())));
    }

    /**
     * Test case to verify if the text of specific UI elements matches the expected text.
     * It launches the SplashActivity and checks if the text of the app title and developer text matches the expected values.
     */
    @Test
    public void test_textmatch()
    {
        onView(withId(R.id.textView)).check(matches(withText("Cardiac Recorder App")));
        onView(withId(R.id.editTextTextMultiLine)).check(matches(withText("Developed by                Borhan & Zobayer                CSE 2K19,KUET")));

    }

}
