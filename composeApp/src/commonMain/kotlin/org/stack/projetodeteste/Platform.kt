package org.stack.projetodeteste

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform