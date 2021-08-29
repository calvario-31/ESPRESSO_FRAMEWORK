package test

import androidx.test.ext.junit.runners.AndroidJUnit4
import models.NoteModel
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import pageobjects.MainPage
import utilities.Base

@RunWith(AndroidJUnit4::class)
class NoteCrudTest: Base() {
    private lateinit var noteModel: NoteModel

    @Before
    fun setup(){
        noteModel = NoteModel()
    }

    @Test
    fun addNoteTest() {
        MainPage.verifyPage()
        MainPage.clickOnNewNoteButton()
        MainPage.fillNewNoteForm(noteModel.title)
        MainPage.verifyNoteTitleIsDisplayed(noteModel.title)
        MainPage.typeTextBody(noteModel.body)
        MainPage.deleteNote()
        MainPage.verifyEmptyBody()
    }
}
