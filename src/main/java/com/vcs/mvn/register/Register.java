package com.vcs.mvn.register;

import com.vcs.mvn.persons.Student;
import com.vcs.mvn.persons.Teacher;

public class Register {

    private int id;

    private int daysPerYear;

    private Student student;

    private Teacher teacher;

    private int mark;

    public Register() {
    }

    public Register(int daysPerYear) {
        this.daysPerYear = daysPerYear;
    }

    public Register(int daysPerYear, Student student) {
        this.daysPerYear = daysPerYear;
        this.student = student;
    }

    public Register(int daysPerYear, Student student, Teacher teacher) {
        this.daysPerYear = daysPerYear;
        this.student = student;
        this.teacher = teacher;
    }

    public Register(int daysPerYear, Student student, Teacher teacher, int mark) {
        this.daysPerYear = daysPerYear;
        this.student = student;
        this.teacher = teacher;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDaysPerYear() {
        return daysPerYear;
    }

    public void setDaysPerYear(int daysPerYear) {
        this.daysPerYear = daysPerYear;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
