package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    @NotNull(message = "Employer is required.")
    private Employer employer;

    private String skills;

    public Job() {
    }

    public Job(Employer anEmployer, String someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Employer getEmployer() {
        return employer;
    }

    public String getSkills() {
        return skills;
    }
}
