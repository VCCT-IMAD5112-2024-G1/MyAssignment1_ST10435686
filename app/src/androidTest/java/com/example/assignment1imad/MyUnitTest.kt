package com.example.assignment1imad

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MyUnitTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testValidAge() {
        // Type a valid age into the EditText
        Espresso.onView(ViewMatchers.withId(R.id.edtAgeInput))
            .perform(ViewActions.replaceText("25"), ViewActions.closeSoftKeyboard())

        // Click on the Generate Button
        Espresso.onView(ViewMatchers.withId(R.id.btnGenerate))
            .perform(ViewActions.click())

        // Check if the correct historical figure is displayed
        Espresso.onView(ViewMatchers.withId(R.id.textOutput))
            .check(ViewAssertions.matches(ViewMatchers.withText("Tupac Shakur died at the age of 25. This is the same age which you are currently! They are a famous historical figure.")))
    }

    @Test
    fun testInvalidAge() {
        // Type an invalid age into the EditText
        Espresso.onView(ViewMatchers.withId(R.id.edtAgeInput))
            .perform(ViewActions.replaceText("10"), ViewActions.closeSoftKeyboard())

        // Click on the Generate Button
        Espresso.onView(ViewMatchers.withId(R.id.btnGenerate))
            .perform(ViewActions.click())

        // Check if the correct error message is displayed
        Espresso.onView(ViewMatchers.withId(R.id.textOutput))
            .check(ViewAssertions.matches(ViewMatchers.withText("Invalid age! Please use an age between 20 and 100!")))
    }

    @Test
    fun testClearButton() {
        // Type an age into the EditText
        Espresso.onView(ViewMatchers.withId(R.id.edtAgeInput))
            .perform(ViewActions.replaceText("35"), ViewActions.closeSoftKeyboard())

        // Click on the Generate Button
        Espresso.onView(ViewMatchers.withId(R.id.btnGenerate))
            .perform(ViewActions.click())

        // Click on the Clear Button
        Espresso.onView(ViewMatchers.withId(R.id.btnClear))
            .perform(ViewActions.click())

        // Check if the EditText and TextView are cleared
        Espresso.onView(ViewMatchers.withId(R.id.edtAgeInput))
            .check(ViewAssertions.matches(ViewMatchers.withText("")))
        Espresso.onView(ViewMatchers.withId(R.id.textOutput))
            .check(ViewAssertions.matches(ViewMatchers.withText("")))
    }
}
