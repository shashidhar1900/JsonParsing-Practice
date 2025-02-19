package com.example;

// User.java
import java.util.List;


public class User {
    private int id;
    private String name;
    private String email;
    private Address address;
    private List<PhoneNumber> phoneNumbers;
    private List<String> skills;
    private List<Project> projects;
    private boolean isCertified;
    private double experienceYears;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public List<PhoneNumber> getPhoneNumbers() { return phoneNumbers; }
    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) { this.phoneNumbers = phoneNumbers; }

    public List<String> getSkills() { return skills; }
    public void setSkills(List<String> skills) { this.skills = skills; }

    public List<Project> getProjects() { return projects; }
    public void setProjects(List<Project> projects) { this.projects = projects; }

    public boolean getIsCertified() { return isCertified; }
    public void setIsCertified(boolean isCertified) { this.isCertified = isCertified; }

    public double getExperienceYears() { return experienceYears; }
    public void setExperienceYears(double experienceYears) { this.experienceYears = experienceYears; }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", phoneNumbers=" + phoneNumbers +
                ", skills=" + skills +
                ", projects=" + projects +
                ", isCertified=" + isCertified +
                ", experienceYears=" + experienceYears +
                '}';
    }

}


