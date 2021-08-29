package pageobjects

import androidx.test.espresso.action.ViewActions.typeTextIntoFocusedView
import com.simplemobiletools.notes.pro.R
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
        Logs.info("Verifying the main text panel is displayed")
        verifyViewIsDisplayed(R.id.action_bar)
    }

    fun typeTextBody(text: String){
        Logs.info("Typing the text on the text panel")
        Logs.debug("Text: $text")
        typeTextIntoFocusedView(text)
    }

    fun openMenu(){
        Logs.info("Opening the menu")
        clickWithContentDescription(menu)
    }

    fun fillNewNoteForm(title: String){
        Logs.info("Typing the note title")
        Logs.debug("Text: $title")
        typeText(R.id.note_title, title)
        Logs.info("Verifying the text note type is selected")
        verifyIsChecked(R.id.type_text_note)
        Logs.info("Clicking on OK")
        clickWithId(android.R.id.button1)
    }

    fun clickOnNewNoteButton(){
        Logs.info("Clicking on new note")
        clickWithId(R.id.new_note)
    }

    fun verifyNoteTitleIsDisplayed(title: String){
        Logs.info("Verifying note body is displayed")
        verifyTextIsDisplayed(title)
    }

    fun deleteNote(){
        openMenu()
        Logs.info("Clicking on delete note")
        clickWithText(context.getString(R.string.delete_note))
        Logs.info("Verifying the delete note popup is displayed")
        verifyViewIsDisplayed(R.id.delete_note_holder)
        clickWithId(android.R.id.button1)
    }

    fun verifyEmptyBody() {
        Logs.info("Verifying empty body is displayed")
        verifyHintIsDisplayed(context.getString(R.string.insert_text_here))
    }

    fun goToAbout(){
        openMenu()
        Logs.info("Clicking on about")
        clickWithText(context.getString(R.string.about))
    }

    fun goToSettings(){
        openMenu()
        Logs.info("Clicking on settings")
        clickWithText(context.getString(R.string.settings))
    }

    fun verifyMenu(){
        verifyTextIsDisplayed(context.getString(R.string.share))
        verifyTextIsDisplayed(context.getString(R.string.lock_note))
        verifyTextIsDisplayed(context.getString(R.string.open_file))
        verifyTextIsDisplayed(context.getString(R.string.export_as_file))
        verifyTextIsDisplayed(context.getString(R.string.print))
        verifyTextIsDisplayed(context.getString(R.string.settings))
        verifyTextIsDisplayed(context.getString(R.string.about))
    }
}
