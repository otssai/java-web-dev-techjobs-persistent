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
//    @JoinColumn(name = "id")
    private final List<Job> jobs = new ArrayList<>(
    );

    public List<Job> getJobs() {
        return jobs;
    }

    public Employer() { };

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
