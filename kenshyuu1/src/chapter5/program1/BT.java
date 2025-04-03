package chapter5.program1;

import java.util.ArrayList;
import java.util.List;

class BT {
    private List<Employee> employees = new ArrayList<>();
    private List<String> departments = List.of("人事", "営業", "エンジニア");

    public void createEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}
