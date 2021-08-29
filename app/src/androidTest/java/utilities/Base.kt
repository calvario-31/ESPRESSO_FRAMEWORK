package utilities

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.simplemobiletools.notes.pro.activities.MainActivity
import io.qameta.allure.android.rules.LogcatRule
import io.qameta.allure.android.rules.ScreenshotRule
import org.junit.Rule


open class Base {
    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @get:Rule
    var listeners: Listeners = Listeners()

    @get:Rule
    val screenshotRule = ScreenshotRule(mode = ScreenshotRule.Mode.FAILURE, screenshotName = "screenshot failure")

    @get:Rule
    val logcatRule = LogcatRule()
}
