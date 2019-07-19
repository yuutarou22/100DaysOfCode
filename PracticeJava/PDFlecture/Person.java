class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void printMessage(Person person) {
        System.out.println("こんにちは" + person.getName() + "さん");
    }

    public boolean isSameAge(Person person) {
        return this.age == person.getAge();
    }

    boolean isAdult(Person person) {
        return person.getAge() > 20;
    }

    Person getYoungestPerson(Person[] persons) {
        Person youngestP = persons[0];
        for (Person p : persons) {
            if (youngestP.getAge() >= p.getAge()) {
                youngestP = p;
            };
        }
        return youngestP;
    }
}