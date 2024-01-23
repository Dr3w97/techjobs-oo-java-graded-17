package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        final String DEFAULT_MESSAGE = "Data not available";

        if (getId() != null && getName() == null && getEmployer() == null && getLocation() == null && getPositionType() == null && getCoreCompetency() == null) {
            return newline + "Oops this job doesn't exist" + newline;
        }

        return newline +
               "ID: " + getId() + newline +
               "Name: " + (getName() != null && !getName().isEmpty() ? getName() : DEFAULT_MESSAGE) + newline +
               "Employer: " + (getEmployer() != null && !getEmployer().getValue().isEmpty() ? getEmployer() : DEFAULT_MESSAGE) + newline +
               "Location: " + (getLocation() != null && !getLocation().getValue().isEmpty() ? getLocation() : DEFAULT_MESSAGE) + newline +
               "Position Type: " + (getPositionType() != null && !getPositionType().getValue().isEmpty() ?  getPositionType() : DEFAULT_MESSAGE) + newline +
               "Core Competency: " + (getCoreCompetency() != null && !getCoreCompetency().getValue().isEmpty() ? getCoreCompetency() : DEFAULT_MESSAGE) + newline;


    }
}



