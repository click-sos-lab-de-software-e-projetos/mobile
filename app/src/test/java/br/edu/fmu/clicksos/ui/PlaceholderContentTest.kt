package br.edu.fmu.clicksos.ui

import org.junit.Assert.assertEquals
import org.junit.Test

class PlaceholderContentTest {
    @Test
    fun `informa que a funcionalidade ainda nao esta disponivel`() {
        assertEquals(
            "Esta funcionalidade será implementada em um épico posterior.",
            PLACEHOLDER_MESSAGE
        )
    }
}
