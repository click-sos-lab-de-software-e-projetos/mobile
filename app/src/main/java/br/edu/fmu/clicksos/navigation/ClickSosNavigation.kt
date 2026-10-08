package br.edu.fmu.clicksos.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import br.edu.fmu.clicksos.ui.PlaceholderScreen

private enum class Destination(val route: String, val label: String) {
    Home("inicio", "Início"),
    Map("mapa", "Mapa"),
    Contacts("contatos", "Contatos"),
    Profile("perfil", "Perfil"),
    About("sobre", "Sobre"),
}

@Composable
fun ClickSosNavigation(navController: NavHostController = rememberNavController()) {
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                Destination.entries.forEach { destination ->
                    NavigationBarItem(
                        selected = currentRoute == destination.route,
                        onClick = {
                            navController.navigate(destination.route) {
                                launchSingleTop = true
                            }
                        },
                        icon = {},
                        label = { Text(destination.label) },
                    )
                }
            }
        },
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Destination.Home.route,
            modifier = Modifier.fillMaxSize(),
        ) {
            Destination.entries.forEach { destination ->
                composable(destination.route) {
                    PlaceholderScreen(title = destination.label, contentPadding = paddingValues)
                }
            }
        }
    }
}
