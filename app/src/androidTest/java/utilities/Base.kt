package utilities

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.GrantPermissionRule
import com.simplemobiletools.notes.pro.activities.MainActivity
import org.junit.Rule
import org.junit.runner.RunWith


open class Base {
    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @get:Rule
    var listeners: Listeners = Listeners()
}
