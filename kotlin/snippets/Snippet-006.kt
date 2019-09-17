package fr.o80.kata

class Person(
        private var fullname: String,
        private var age: Int?,
        private var size: Int?
) {
    /**
     * Secondary constructor with firstname and lastname.
     */
    constructor(firstname: String, lastname: String) : this(firstname + " " + lastname, null, null)

    /**
     * Secondary constructor with firstname, lastname and age of the Person.
     */
    constructor(firstname: String, lastname: String, age: Int) : this(firstname + " " + lastname, age, null)

    /**
     * Secondary constructor to clone the Person.
     */
    constructor(origin: Person) : this(origin.fullname, origin.size)

    /**
     * Set the info of the Person.
     *
     * @param age The age of the Person
     * @param size The size of the person
     */
    fun setInfo(_age: Int, _size: Int) {
        age = _age
        size = _size
    }

    constructor(fullname: String, size: Int) : this(firstname + " " + lastname, null, size)
}

fun completeIdentity(person: Person, age: Int): Person {
    val theOther = Person(person)
    theOther.age = age
    return theOther
}
