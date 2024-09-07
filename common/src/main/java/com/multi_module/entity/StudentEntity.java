package com.multi_module.entity;

public class StudentEntity {

    private String name;
    private Integer rollNumber;
    private Integer marks;

    public StudentEntity(String name, Integer rollNumber, Integer marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public StudentEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", marks=" + marks +
                '}';
    }
}
