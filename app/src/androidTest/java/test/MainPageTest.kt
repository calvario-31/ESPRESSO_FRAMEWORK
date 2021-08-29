package test

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import pageobjects.MainPage
import utilities.Base

@RunWith(AndroidJUnit4::class)
class MainPageTest: Base() {
    @Test
    fun verifyMenuContent(){
        MainPage.openMenu()
        MainPage.verifyMenu()
    }
}
