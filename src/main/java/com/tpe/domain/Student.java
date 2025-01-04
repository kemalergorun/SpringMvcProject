package com.tpe.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
@Entity
@Table(name = "t_student")
public class Student {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private  Long id;
    @NotBlank(message = "please enter a firstname")
    @Column(nullable = false)
    private String firstname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }
   // public void setCreateDate(LocalDateTime createDate) {
    //    this.createDate = createDate;
   // }
    @NotEmpty(message = "please enter a lastname")
    @Column(nullable = false)
    private String lastname;


    @NotNull(message = "please enter a grade")
    @Column(nullable = false)
    private Integer grade;

    private LocalDateTime createDate;
    @PrePersist
    public  void prePersist(){
        createDate=LocalDateTime.now();
    }
}
