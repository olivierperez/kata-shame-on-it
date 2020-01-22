class Person {

    private String fullname;
    private Integer age;
    private Integer size;

    public Person(String fullname, Integer age, Integer size) {
        this.fullname = fullname;
        this.age = age;
        this.size = size;
    }

    /**
     * Secondary constructor with firstname and lastname.
     */
    public Person(String firstname, String lastname) {
        this(firstname + " " + lastname, (Integer) null, null);
    }

    /**
     * Secondary constructor with firstname, lastname and age of the Person.
     */

    public Person(String firstname, String lastname, Integer age) {
        this(firstname + " " + lastname, age, null);
    }

    /**
     * Secondary constructor to clone the Person.
     */
    public Person(Person origin) {
        this(origin.fullname, origin.size);
    }

    /**
     * Set the info of the Person.
     *
     * @param age  The age of the Person
     * @param size The size of the person
     */
    public void setInfo(Integer age, Integer size) {
        this.age = age;
        this.size = size;
    }

    public Person(String fullname, Integer size) {
        this(fullname, (Integer) null, size);
    }

    public Person completeIdentity(Person person, Integer age) {
        Person theOther = new Person(person);
        theOther.age = age;
        return theOther;
    }

}


