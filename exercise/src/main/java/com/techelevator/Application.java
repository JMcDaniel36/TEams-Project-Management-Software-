package com.techelevator;

import java.util.List;


public class Application extends Employee {

    /**
     * The main entry point in the application
     * @param args
     */
    private List<Department> departments;
    private List<Employee> employees;

    public static void main(String[] args) {
        Application app = new Application();
        app.run();

    }

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        Department marketingDepartment = new Department(1, "Marketing");
        departments.add(marketingDepartment);
        Department salesDepartment = new Department(2, "Sales");
        departments.add(salesDepartment);
        Department engineeringDepartment = new Department(3, "Engineering");
        departments.add(engineeringDepartment);
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (Department i:departments) {
            System.out.print(departments);
        }

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        Employee employeeDean = new Employee();
        employeeDean.setEmployeeId(1);
        employeeDean.setFirstName("Dean");
        employeeDean.setLastName("Johnson");
        employeeDean.setEmail("djohnson@teams.com");
        employeeDean.setDepartment(departments.get(3));
        employeeDean.setHireDate("08/21/2020");

        employees.add(employeeDean);

        Department engineeringDepartment = null;
        Department marketingDepartment = null;
        for(Department department : departments){
            //[Department("Marketing"), Department("sales")]
            if(department.getName() == "Engineering"){
                engineeringDepartment = department;
            } else if (department.getName() == "Marketing") {
                marketingDepartment = department;
            }
        }
        Employee employeeAngie = new Employee(2, "Angie" ,"Smith", "asmith@teams.com", engineeringDepartment , "08/21/2020");
        employees.add(employeeAngie);

        Employee employeeMargaret = new Employee(3, "Margaret", "Thompson" , "mthmompson@teams.com", marketingDepartment, "08/21/2020");
        employees.add(employeeMargaret);

        employeeAngie.raiseSalary(10);

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for (Employee i: employees) {
            getFullName();
            getSalary();
            getDepartment();

        }
    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}
