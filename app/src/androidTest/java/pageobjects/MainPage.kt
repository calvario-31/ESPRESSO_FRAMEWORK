package pageobjects

import androidx.test.espresso.action.ViewActions.typeTextIntoFocusedView
import com.simplemobiletools.notes.pro.R
import io.qameta.allure.kotlin.Allure.step
import utilities.Logs
import utilities.Wrappers.clickWithContentDescription
import utilities.Wrappers.clickWithId
import utilities.Wrappers.clickWithText
import utilities.Wrappers.typeText
import utilities.Wrappers.verifyHintIsDisplayed
import utilities.Wrappers.verifyIsChecked
import utilities.Wrappers.verifyTextIsDisplayed
import utilities.Wrappers.verifyViewIsDisplayed

object MainPage: Page() {
    private var menu = "More options"

    fun verifyPage(){
        step("Verifying options page"){
            Logs.info("Verifying the main text panel is displayed")
            verifyViewIsDisplayed(R.id.action_bar)
        }

    }

    fun typeTextBody(text: String){
        step("Verifying text body"){
            Logs.info("Typing the text on the text panel")
            Logs.debug("Text: $text")
            typeTextIntoFocusedView(text)
        }
    }

    fun openMenu(){
        step("Opening the menu"){
            Logs.info("Opening the menu")
            clickWithContentDescription(menu)
        }
    }

    fun fillNewNoteForm(title: String){
        step("Filling new note form"){
            Logs.info("Typing the note title")
            Logs.debug("Text: $title")
            typeText(R.id.note_title, title)
            Logs.info("Verifying the text note type is selected")
            verifyIsChecked(R.id.type_text_note)
            Logs.info("Clicking on OK")
            clickWithId(android.R.id.button1)
        }
    }

    fun clickOnNewNoteButton(){
        step("Clicking on new note button"){
            Logs.info("Clicking on new note")
            clickWithId(R.id.new_note)
        }
    }

    fun verifyNoteTitleIsDisplayed(title: String){
        step("Verifying the note title is displayed: $title"){
            Logs.info("Verifying note body is displayed")
            verifyTextIsDisplayed(title)
        }
    }

    fun deleteNote(){
        step("Deleting the note"){
            openMenu()
            Logs.info("Clicking on delete note")
            clickWithText(context.getString(R.string.delete_note))
            Logs.info("Verifying the delete note popup is displayed")
            verifyViewIsDisplayed(R.id.delete_note_holder)
            clickWithId(android.R.id.button1)
        }
    }

    fun verifyEmptyBody() {
        step("Verifying empty body is displayed"){
            Logs.info("Verifying empty body is displayed")
            verifyHintIsDisplayed(context.getString(R.string.insert_text_here))
        }
    }

    fun goToAbout(){
        step("Going to about page"){
            openMenu()
            Logs.info("Clicking on about")
            clickWithText(context.getString(R.string.about))
        }
    }

    fun goToSettings(){
        step("Going to settings page"){
            openMenu()
            Logs.info("Clicking on settings")
            clickWithText(context.getString(R.string.settings))
        }
    }

    fun verifyMenu(){
        step("Verifying the menu options"){
            verifyTextIsDisplayed(context.getString(R.string.share))
            verifyTextIsDisplayed(context.getString(R.string.lock_note))
            verifyTextIsDisplayed(context.getString(R.string.open_file))
            verifyTextIsDisplayed(context.getString(R.string.export_as_file))
            verifyTextIsDisplayed(context.getString(R.string.print))
            verifyTextIsDisplayed(context.getString(R.string.settings))
            verifyTextIsDisplayed(context.getString(R.string.about))
        }
    }
}
