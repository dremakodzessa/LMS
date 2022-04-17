package ub.LMS.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table (name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;
    @NotNull
    private String companyName;
    @NotNull
    private Integer companyNumber;
    @OneToMany (mappedBy = "company")
    private List<User> users;
    @OneToMany (mappedBy = "company")
    private List<Course> courses;

    public Company() {
    }

    public Company(Long companyId, String companyName, Integer companyNumber, List<User> users, List<Course> courses) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyNumber = companyNumber;
        this.users = users;
        this.courses = courses;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Integer getCompanyNumber() {
        return companyNumber;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyNumber(Integer companyNumber) {
        this.companyNumber = companyNumber;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
