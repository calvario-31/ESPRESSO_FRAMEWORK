package pageobjects

import com.simplemobiletools.notes.pro.R
import io.qameta.allure.kotlin.Allure.step
import utilities.Wrappers.verifyTextIsDisplayed
import utilities.Wrappers.verifyViewIsDisplayed

object AboutPage: Page(){

    fun verifyPage(){
        step("Verifying about page"){
            verifyTextIsDisplayed(context.getString(R.string.about))
            verifyViewIsDisplayed(R.id.about_email)
            verifyViewIsDisplayed(R.id.about_faq)
            verifyViewIsDisplayed(R.id.about_faq_label)
            verifyViewIsDisplayed(R.id.about_more_apps)
            verifyViewIsDisplayed(R.id.about_invite)
            verifyViewIsDisplayed(R.id.about_license)
            verifyViewIsDisplayed(R.id.about_follow_us)
            verifyViewIsDisplayed(R.id.about_facebook)
            verifyViewIsDisplayed(R.id.about_reddit)
            verifyViewIsDisplayed(R.id.about_copyright)
        }
    }
}
