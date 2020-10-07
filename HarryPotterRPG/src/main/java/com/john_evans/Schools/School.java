package com.john_evans.Schools;

public abstract class School {
    public String house;
    public abstract void sorting();
    
    public School(String house) {
        this.house = house;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
    
        
}
