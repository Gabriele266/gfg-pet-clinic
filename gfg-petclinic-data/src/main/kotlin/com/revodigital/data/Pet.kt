package com.revodigital.data

import java.time.LocalDate

class Pet(
    firstName: String,
    lastName: String,
    var petType: PetType,
    var birthDate: LocalDate,
    var owner: Owner
) : Person(firstName, lastName)