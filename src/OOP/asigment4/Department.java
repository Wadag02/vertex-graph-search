package OOP.asigment4;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Company company;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }

    public List<Employee> getEmployees() { return employees; }

    public int getNumberOfEmployees() { return employees.size(); }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        employee.setDepartment(this);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
        employee.setDepartment(null);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", company=" + (company != null ? company.getName() : "No company") +
                ", employees=" + employees.size() +
                '}';
    }
}

