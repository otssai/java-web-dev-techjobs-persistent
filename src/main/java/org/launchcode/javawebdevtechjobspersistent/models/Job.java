package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @NotNull(message = "Employer is required.")
    @ManyToOne
    private Employer employer;

    @NotNull(message = "Skills are required.")
    @ManyToMany
    private List<Skill> skills;

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> skills) {
        this.employer = anEmployer;
        this.skills = skills;
    }

    // Getters and setters.

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Employer getEmployer() {
        return employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
