package org.mapsa.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Relative {

    private String fname ;
    private String lname ;
    private RelativeType type ;

    public Relative(String fname, String lname, RelativeType type) {
        this.fname = fname;
        this.lname = lname;
        this.type = type;
    }

    public Relative(){}

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public RelativeType getType() {
        return type;
    }

    public void setType(RelativeType type) {
        this.type = type;
    }
}
