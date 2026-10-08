package br.edu.fmu.clicksos.app

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import br.edu.fmu.clicksos.navigation.clickSosNavigation
import br.edu.fmu.clicksos.ui.theme.clickSosTheme

@Composable
fun clickSosApp() {
    val navController = rememberNavController()

    clickSosTheme {
        MaterialTheme {
            clickSosNavigation(navController = navController)
        }
    }
}
