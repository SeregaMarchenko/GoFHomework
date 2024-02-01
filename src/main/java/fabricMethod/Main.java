package main.java.fabricMethod;

import main.java.fabricMethod.departments.DayDepartment;
import main.java.fabricMethod.departments.Department;
import main.java.fabricMethod.departments.NightDepartment;

public class Main {
    public static void main(String[] args) {
        Department department = new NightDepartment();
        department.info();
    }
}
