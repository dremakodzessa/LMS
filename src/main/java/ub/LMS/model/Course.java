package ub.LMS.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table (name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String courseName;
    @NotNull
    private String category;
    @ManyToOne
    @JoinColumn (name = "company_id")
    private Company company;
    @ManyToMany (mappedBy = "courses")
    private List<User> users;

    public Course() {
    }

    public Course(Long id, String courseName, String category, Company company, List<User> users) {
        this.id = id;
        this.courseName = courseName;
        this.category = category;
        this.company = company;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCategory() {
        return category;
    }

    public Company getCompany() {
        return company;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
