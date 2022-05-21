package ru.gb.lesson5;

public class lesson5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Aleksei", "QA", "qa@pismo.com", "0(000)000-00-00", 100000, 22);
        employees[1] = new Employee("Aleksandr", "Dev", "dev@pismo.com", "0(000)000-00-01", 200000, 50);
        employees[2] = new Employee("Vladimir", "Engineer", "engineer@pismo.com", "0(000)000-00-02", 150000, 30);
        employees[3] = new Employee("Oleg", "HR", "hr@pismo.com", "0(000)000-00-03", 80000, 41);
        employees[4] = new Employee("Pavel", "Admin", "admin@pismo.com", "0(000)000-00-04", 130000, 29);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                System.out.println(employees[i]);
            }
        }
    }
}

