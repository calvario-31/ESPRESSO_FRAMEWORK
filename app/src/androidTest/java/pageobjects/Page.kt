package pageobjects

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import utilities.Wrappers.clickWithContentDescription

open class Page {
    var context: Context = ApplicationProvider.getApplicationContext()

    val backButton = "Navigate up"

    fun clickOnNavigateUp(){
        clickWithContentDescription(backButton)
    }
}
