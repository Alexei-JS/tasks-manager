package com.drivingSchool.model;

/**
 * Курсант автошколы. Сущность предметной области.
 * Создаётся при заполнении анкеты через команду /enroll.
 */
public class Student {

    private String fullName;         // ФИО одной строкой
    private int age;                 // полных лет
    private String category;         // категория: A, B, C, BC и т.п.
    private boolean hasMedicalCert;  // получена ли справка от медкомиссии

    public Student(String fullName, int age, String category, boolean hasMedicalCert) {
        this.fullName = fullName;
        this.age = age;
        this.category = category;
        this.hasMedicalCert = hasMedicalCert;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasMedicalCert() {
        return hasMedicalCert;
    }

    @Override
    public String toString() {
        return String.format("%s, %d лет, категория %s, справка: %s",
                fullName, age, category, hasMedicalCert ? "есть" : "нет");
    }
}