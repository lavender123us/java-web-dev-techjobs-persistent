package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(max=500, message="Description too long")
    private String description;
    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    public List<Job> getJobs() {
        return jobs;
    }

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}