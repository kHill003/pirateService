package com.codeclan.example.pirateservice.models;


import javax.persistence.*;

@Entity // NEW
@Table(name="pirates")
public class Pirate
{

    @Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)

@Column(name = "id") // NEW
private Long id;

    @Column(name = "first_name") // NEW
    private String firstName;

    @Column(name = "last_name") // NEW
    private String lastName;

    @Column(name = "age") // NEW
    private int age;

    public Pirate(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Pirate() { // NEW

    }

    public Long getId() { // NEW
        return id;
    }

    public void setId(Long id) { // NEW
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

