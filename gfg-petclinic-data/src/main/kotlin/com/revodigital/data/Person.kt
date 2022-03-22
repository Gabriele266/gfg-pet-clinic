package com.revodigital.data

open class Person(
    var firstName: String,
    var lastName: String
) {
    override fun toString(): String =
        "Person $firstName $lastName"
}