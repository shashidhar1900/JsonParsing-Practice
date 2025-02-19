package com.example;

import java.util.List;

public class Project {
    private String title;
    private String role;
    private List<String> technologies;

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public List<String> getTechnologies() { return technologies; }
    public void setTechnologies(List<String> technologies) { this.technologies = technologies; }

    @Override
    public String toString() {
        return "Project{" +
                "title='" + title + '\'' +
                ", role='" + role + '\'' +
                ", technologies=" + technologies +
                '}';
    }
}

