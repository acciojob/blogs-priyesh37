package com.driver.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String Username;
    private String password;
    private String firstName;
    private String lastName;


    // @JsonIgnore
    @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL)
    private List<Blog> blogList;

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }

    public User(int id, String username, String password, String firstName, String lastName, List<Blog> blogList) {
        this.id = id;
        Username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.blogList = blogList;
    }

//    public User(int id) {
//        this.id = id;
//    }
}