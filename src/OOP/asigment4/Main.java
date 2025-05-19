package OOP.asigment4;

public class Main {
    public static void main(String[] args) {
        Company myCompany = new Company("TechCorp");

        Department itDept = new Department("IT Department");
        Department hrDept = new Department("HR Department");

        myCompany.addDepartment(itDept);
        myCompany.addDepartment(hrDept);

        Employee emp1 = new Employee("Alice Johnson", "Software Engineer", 70000);
        Employee emp2 = new Employee("Bob Smith", "System Administrator", 60000);
        Employee emp3 = new Employee("Charlie Brown", "HR Manager", 50000);

        itDept.addEmployee(emp1);
        itDept.addEmployee(emp2);
        hrDept.addEmployee(emp3);

        System.out.println(myCompany);

        for (Department dept : myCompany.getDepartments()) {
            System.out.println(dept);
            for (Employee emp : dept.getEmployees()) {
                System.out.println(" - " + emp);
            }
        }

        String searchName = "Alice Johnson";
        Employee foundEmployee = myCompany.findEmployeeByName(searchName);
        if (foundEmployee != null) {
            System.out.println("\nFound employee: " + foundEmployee);
            System.out.println("Works in department: " + foundEmployee.getDepartment().getName());
        } else {
            System.out.println("Employee not found!");
        }
    }
}
