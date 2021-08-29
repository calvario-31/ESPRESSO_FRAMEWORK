package pageobjects

import com.simplemobiletools.notes.pro.R
import utilities.Wrappers.scrollToView
import utilities.Wrappers.verifyViewIsDisplayed

object SettingsPage: Page() {
    fun verifyPage(){
        verifyViewIsDisplayed(R.id.settings_customize_colors_holder)
        verifyViewIsDisplayed(R.id.settings_show_word_count)
        verifyViewIsDisplayed(R.id.settings_clickable_links)
        verifyViewIsDisplayed(R.id.settings_monospaced_font_holder)
        verifyViewIsDisplayed(R.id.settings_use_incognito_mode)
        verifyViewIsDisplayed(R.id.settings_enable_line_wrap)
        verifyViewIsDisplayed(R.id.settings_font_size)
        verifyViewIsDisplayed(R.id.settings_font_size_label)

        scrollToView(R.id.settings_customize_widget_colors_label)
        verifyViewIsDisplayed(R.id.settings_cursor_placement)
        verifyViewIsDisplayed(R.id.settings_show_keyboard)
        verifyViewIsDisplayed(R.id.settings_move_undone_checklist_items)
        verifyViewIsDisplayed(R.id.settings_autosave_notes)
        verifyViewIsDisplayed(R.id.settings_display_success)
    }
}
