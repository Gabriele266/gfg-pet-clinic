package com.revodigital.web

import com.revodigital.data.Person
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component


@Component
class BootstrapTest : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("Start")

        val p = Person("Giovanna", "Paola")
        println(p)
    }
}