package OOP.asigment4;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Department> getDepartments() { return departments; }

    public void addDepartment(Department department) {
        departments.add(department);
        department.setCompany(this);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
        department.setCompany(null);
    }

    public Employee findEmployeeByName(String fullName) {
        for (Department dept : departments) {
            for (Employee emp : dept.getEmployees()) {
                if (emp.getFullName().equalsIgnoreCase(fullName)) {
                    return emp;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", departments=" + departments.size() +
                '}';
    }
}
