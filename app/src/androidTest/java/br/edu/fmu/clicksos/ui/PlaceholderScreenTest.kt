package br.edu.fmu.clicksos.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class PlaceholderScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun exibe_aviso_de_funcionalidade_futura() {
        composeTestRule.setContent {
            placeholderScreen(title = "Início", contentPadding = PaddingValues())
        }

        composeTestRule.onNodeWithText(PLACEHOLDER_MESSAGE).assertIsDisplayed()
    }
}
