package ru.gb.lesson5;

public class Employee {
    String name;
    String profession;
    String email;
    String phone;
    double sallary;
    int age;

    public Employee(String name, String profession, String email, String phone, int sallary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.sallary = sallary;
        this.age = age;
    }

    public String toString() {
        return " \n" + "Name - " + name + ", \n" + "Profession - " + profession + ",\n" + "Email - " + email + ",\n" + "Phone - " + phone + ",\n" + "Sallary - " + sallary + ",\n" + "Age - " + age;
    }
}

