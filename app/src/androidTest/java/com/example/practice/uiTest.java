package com.example.practice;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class uiTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testShapeInsert() {
        // Enter shape
        Espresso.onView(ViewMatchers.withId(R.id.shape))
                .perform(ViewActions.typeText("circle"));

        // Enter color
        Espresso.onView(ViewMatchers.withId(R.id.color))
                .perform(ViewActions.typeText("red"));

        // Click submit button
        Espresso.onView(ViewMatchers.withId(R.id.submit))
                .perform(ViewActions.click());



        // Enter radius
        Espresso.onView(ViewMatchers.withId(R.id.radius))
                .perform(ViewActions.typeText("10"));
        // Delay to allow animations to complete
        try {
            Thread.sleep(50000); // Adjust the delay time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click area button
        Espresso.onView(ViewMatchers.withId(R.id.area))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.display))
                .check(ViewAssertions.matches(ViewMatchers.withText("314.0")));
    }


}
