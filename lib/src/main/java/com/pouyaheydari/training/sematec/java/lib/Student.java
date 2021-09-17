package com.pouyaheydari.training.sematec.java.lib;

public class Student {

    public Student(String name, String family, String fatherName, String nationalID, int age, int id, int passedCourses, int totalCourses) {
        this.name = name;
        this.family = family;
        this.fatherName = fatherName;
        this.nationalID = nationalID;
        this.age = age;
        this.id = id;
        this.passedCourses = passedCourses;
        this.totalCourses = totalCourses;
    }

    private String name;
    private String family;
    private String fatherName;
    private String nationalID;
    private int age;
    private int id;
    private int passedCourses;
    private int totalCourses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFatherName() {
        return "Mr. " + fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 1000) {
            this.id = id;
        }
    }

    public int getPassedCourses() {
        return passedCourses;
    }

    public void setPassedCourses(int passedCourses) {
        this.passedCourses = passedCourses;
    }

    public int getTotalCourses() {
        return totalCourses;
    }

    public void setTotalCourses(int totalCourses) {
        this.totalCourses = totalCourses;
    }
}
