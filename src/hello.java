import java.util.ArrayList;

class Employee {
    private String fullName;
    private String position;
    private double salary;
    private Department department;

    public Employee(String fullName, String position, double salary) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void printInfo() {
        System.out.println("Employee: " + fullName + ", Position: " + position + ", Salary: " + salary +
                ", Department: " + (department != null ? department.getName() : "No department"));
    }
}

class Department {
    private String name;
    private Company company;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        employee.setDepartment(this);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
        employee.setDepartment(null);
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void printEmployees() {
        System.out.println("Employees in department " + name + ":");
        for (Employee e : employees) {
            e.printInfo();
        }
        System.out.println("Total employees: " + getNumberOfEmployees());
    }
}

class Company {
    private String name;
    private ArrayList<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
        department.setCompany(this);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
        department.setCompany(null);
    }

    public Employee findEmployeeByFullName(String fullName) {
        for (Department dept : departments) {
            for (Employee emp : dept.getEmployees()) {
                if (emp.getFullName().equalsIgnoreCase(fullName)) {
                    return emp;
                }
            }
        }
        return null;
    }
}

public class hello {
    public static void main(String[] args) {
        // Создание компании
        Company company = new Company("TechCorp");

        // Создание департаментов
        Department itDept = new Department("IT");
        Department hrDept = new Department("HR");

        // Добавление департаментов в компанию
        company.addDepartment(itDept);
        company.addDepartment(hrDept);

        // Создание сотрудников
        Employee emp1 = new Employee("Alice Johnson", "Software Engineer", 70000);
        Employee emp2 = new Employee("Bob Smith", "System Administrator", 65000);
        Employee emp3 = new Employee("Charlie Brown", "HR Manager", 60000);

        // Добавление сотрудников в департаменты
        itDept.addEmployee(emp1);
        itDept.addEmployee(emp2);
        hrDept.addEmployee(emp3);

        // Вывод информации о сотрудниках департамента IT
        itDept.printEmployees();

        // Поиск сотрудника по ФИО
        String searchName = "Bob Smith";
        Employee foundEmployee = company.findEmployeeByFullName(searchName);
        if (foundEmployee != null) {
            System.out.println("\nFound Employee:");
            foundEmployee.printInfo();
        } else {
            System.out.println("\nEmployee " + searchName + " not found.");
        }
    }
}
