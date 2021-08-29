package test

import io.qameta.allure.android.runners.AllureAndroidJUnit4
import io.qameta.allure.kotlin.Description
import io.qameta.allure.kotlin.Severity
import io.qameta.allure.kotlin.SeverityLevel
import models.NoteModel
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import pageobjects.MainPage
import utilities.Base

@RunWith(AllureAndroidJUnit4::class)
class NoteCrudTest: Base() {
    private lateinit var noteModel: NoteModel

    @Before
    @Description("Creating fake note data")
    fun setup(){
        noteModel = NoteModel()
    }

    @Test
    @Description("Test to verify the add note functionality")
    @Severity(SeverityLevel.CRITICAL)
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
