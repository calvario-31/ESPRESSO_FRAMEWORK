package test

import io.qameta.allure.android.runners.AllureAndroidJUnit4
import io.qameta.allure.kotlin.Description
import io.qameta.allure.kotlin.Severity
import io.qameta.allure.kotlin.SeverityLevel
import org.junit.Test
import org.junit.runner.RunWith
import pageobjects.AboutPage
import pageobjects.MainPage
import utilities.Base

@RunWith(AllureAndroidJUnit4::class)
class AboutTest: Base() {

    @Test
    @Description("Test to verify the about page")
    @Severity(SeverityLevel.NORMAL)
    fun aboutTest() {
        MainPage.verifyPage()
        MainPage.goToAbout()
        AboutPage.verifyPage()
        AboutPage.clickOnNavigateUp()
        MainPage.verifyPage()
    }
}
