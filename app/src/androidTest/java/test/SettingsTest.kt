package test

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import pageobjects.MainPage
import pageobjects.SettingsPage
import utilities.Base

@RunWith(AndroidJUnit4::class)
class SettingsTest: Base() {
    @Test
    fun verifySettingsTest(){
        MainPage.verifyPage()
        MainPage.goToSettings()
        SettingsPage.verifyPage()
    }
}
