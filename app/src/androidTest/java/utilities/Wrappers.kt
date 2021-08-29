package utilities

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

object Wrappers {
    fun clickWithId(id: Int){
        onView(withId(id)).check(matches(isDisplayed())).perform(click())
    }

    fun clickWithContentDescription(value: String){
        onView(withContentDescription(value)).check(matches(isDisplayed())).perform(click())
    }

    fun clickWithText(text: String){
        onView(withText(text)).check(matches(isDisplayed())).perform(click())
    }

    fun typeText(id: Int, text: String){
        onView(withId(id)).check(matches(isDisplayed())).perform(typeText(text))
    }

    fun scrollToView(id: Int){
        onView(withId(id)).perform(scrollTo()).check(matches(isDisplayed()))
    }

    fun verifyViewIsDisplayed(id: Int){
        onView(withId(id)).check(matches(isDisplayed()))
    }

    fun verifyTextIsDisplayed(text: String){
        onView(withText(text)).check(matches(isDisplayed()))
    }

    fun verifyHintIsDisplayed(text: String){
        onView(withHint(text)).check(matches(isDisplayed()))
    }

    fun verifyIsChecked(id: Int){
        onView(withId(id)).check(matches(isChecked()))
    }
}
