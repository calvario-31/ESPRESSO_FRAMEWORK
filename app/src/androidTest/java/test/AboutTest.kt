package test

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import pageobjects.AboutPage
import pageobjects.MainPage
import utilities.Base

@RunWith(AndroidJUnit4::class)
class AboutTest: Base() {

    @Test
    fun aboutTest() {
        MainPage.verifyPage()
        MainPage.goToAbout()
        AboutPage.verifyPage()
        AboutPage.clickOnNavigateUp()
        MainPage.verifyPage()
    }
}
