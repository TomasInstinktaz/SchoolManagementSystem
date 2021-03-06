package com.vcs.mvn.persons;

public abstract class Person {

    private int id;

    private String name;

    private String surname;

    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(int id, String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return (name.toLowerCase() + surname.toLowerCase()).hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (obj instanceof Person) {
            Person obj1 = (Person) obj;
            return obj1.name.equalsIgnoreCase(name) && obj1.surname.equalsIgnoreCase(surname);
        }

        return false;
    }
}
