package br.edu.fmu.clicksos.app

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import br.edu.fmu.clicksos.navigation.ClickSosNavigation
import br.edu.fmu.clicksos.ui.theme.ClickSosTheme

@Composable
fun ClickSosApp() {
    val navController = rememberNavController()

    ClickSosTheme {
        MaterialTheme {
            ClickSosNavigation(navController = navController)
        }
    }
}
