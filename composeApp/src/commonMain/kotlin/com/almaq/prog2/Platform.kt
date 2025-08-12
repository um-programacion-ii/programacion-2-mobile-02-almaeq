package com.almaq.prog2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform