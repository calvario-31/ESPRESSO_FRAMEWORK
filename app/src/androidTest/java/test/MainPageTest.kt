package test

import io.qameta.allure.android.runners.AllureAndroidJUnit4
import io.qameta.allure.kotlin.Description
import io.qameta.allure.kotlin.Severity
import io.qameta.allure.kotlin.SeverityLevel
import org.junit.Test
import org.junit.runner.RunWith
import pageobjects.MainPage
import pageobjects.SettingsPage
import utilities.Base

@RunWith(AllureAndroidJUnit4::class)
class MainPageTest: Base() {
    @Test
    @Description("Test to verify the menu content page")
    @Severity(SeverityLevel.CRITICAL)
    fun verifyMenuContent(){
        MainPage.openMenu()
        MainPage.verifyMenu()
    }

    @Test
    @Description("Test that always fails")
    @Severity(SeverityLevel.TRIVIAL)
    fun dummyFailTest(){
        MainPage.openMenu()
        SettingsPage.verifyPage()
    }
}
