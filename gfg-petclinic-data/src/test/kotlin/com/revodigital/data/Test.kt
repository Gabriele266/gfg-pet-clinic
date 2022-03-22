package com.revodigital.data

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [Owner::class])
class Test {
    @Test
    fun contextLoads() {
        val person = Person(firstName = "PT", lastName = "PR")
    }
}