package br.edu.fmu.clicksos.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun clickSosTheme(content: @Composable () -> Unit) {
    MaterialTheme(content = content)
}
