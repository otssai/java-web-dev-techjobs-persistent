package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message = "Location is required.")
    @Size(max = 100, message = "Location name is too long.")
    private String location;

    @OneToMany(mappedBy = "employer")
//    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>(
    );

    public Employer() { };

    public void Employer(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
