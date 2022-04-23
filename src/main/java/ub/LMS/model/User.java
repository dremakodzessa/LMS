package ub.LMS.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @ManyToMany
    private Set<Role> roles;
    @ManyToOne
    @JoinColumn (name = "company_id")
    private Company company;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "user_courses",
            joinColumns = { @JoinColumn(name = "user_id") },
            inverseJoinColumns = { @JoinColumn(name = "course_id") }
    )
    private List<Course> courses;

    public User() {
    }

    public User(Long userId, String username, String password, String firstName, String lastName, Set<Role> roles, Company company, List<Course> courses) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roles = roles;
        this.company = company;
        this.courses = courses;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public Company getCompany() {
        return company;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
