package org.stack.projetodeteste

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Projeto de Teste",
    ) {
        App()
    }
}