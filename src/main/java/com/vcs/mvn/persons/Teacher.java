package com.vcs.mvn.persons;

public class Teacher extends Person {

    private String specialization;


    public Teacher(int id, String name, String surname, int age, String specialization) {
        super(id, name, surname, age);
        this.specialization = specialization;
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
