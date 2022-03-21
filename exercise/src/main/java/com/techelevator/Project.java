package com.techelevator;

import java.util.List;

public class Project {
    private String name;
    private String description;
    private String startDate;
    private String dueDate;
    private List<Employee> teamMembers;

    public Project(String name, String description, String startDate, String dueDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.dueDate = dueDate;
    }


}
