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
class SettingsTest: Base() {
    @Test
    @Description("Test to verify the settings page")
    @Severity(SeverityLevel.CRITICAL)
    fun verifySettingsTest(){
        MainPage.verifyPage()
        MainPage.goToSettings()
        SettingsPage.verifyPage()
    }
}
