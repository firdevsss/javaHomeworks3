package Entities.Concrete;

import Abstract.Entity;

import java.time.LocalDate;

public class Customer implements Entity {
    private int id;
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;
    private String nationalityId;


    public Customer(int id , String name,String lastName, LocalDate dateOfBirth,String nationalityId){
        super();
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId=nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return name;
    }




}


