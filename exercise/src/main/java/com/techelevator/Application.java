package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
        departments = new ArrayList<Department>();
        employees = new ArrayList<Employee>();

        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!
        giveAngieARaise();

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
        for (Department department : departments) {
            System.out.println(department.getName());
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
        for(Department department : departments) {
            if (department.getName() == "Engineering") {
                employeeDean.setDepartment(department);
            }
        }
        employeeDean.setHireDate("08/21/2020");

        employees.add(employeeDean);

        Department engineeringDepartment = null;
        Department marketingDepartment = null;
        for(Department department : departments){
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



    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for (Employee employee: employees) {
            System.out.println(employee.getFullName() + " (" + employee.getSalary() + ") " + employee.getDepartment().getName() + " ");
        }
    }

    private void giveAngieARaise(){
        for(Employee employee : employees) {
            if(employee.getFirstName() == "Angie"){
                employee.raiseSalary(10);
            }
        }
    }
    // Map<String, Integer> hm = new HashMap<String, Integer>();
    Map<String, Project> projects = new HashMap<String, Project>();

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {
        Project teams = new Project("TEams", "Project Management Software", "10/10/2020", "11/10/2020");

        List<Employee> engineeringEmployees = new ArrayList<Employee>();
        for (Employee employee : employees) {
            if (employee.getDepartment().getName() == "Engineering") {
                engineeringEmployees.add(employee);
            }
        }
        teams.setTeamMembers(engineeringEmployees);
        projects.put("Team: ", teams);
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project landingPage = new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing",
                "10/10/2020", "10/17/2020");
        List<Employee> landingPageEmployee = new ArrayList<Employee>();
        for (Employee employee : employees) {
            if (employee.getDepartment().getName() == "Marketing") {
                landingPageEmployee.add(employee);
            }
        }
        landingPage.setTeamMembers(landingPageEmployee);
        projects.put("Landing Page: ", landingPage);
    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {

        System.out.println("\n------------- PROJECTS ------------------------------");

        for (Map.Entry project : projects.entrySet()) {

            String key = (String)project.getKey();
            //TeamsProject
            Project value = (Project)project.getValue();

            System.out.println(project.getKey() + "" + value.getTeamMembers().size());
        }

    }

}
