package com.example.course_java.dto;

import java.time.LocalDate;

public class TrainersDTO {
    private Long id;
    private String name;
    private String surname;
    private String lastname;
    private String specialization;
    private LocalDate birthday;
    private String email;
    private String phone;
    private String password;
    private LocalDate employment_date;

    public TrainersDTO() {
    }

    public TrainersDTO(Long id, String name, String surname, String lastname, String specialization, LocalDate birthday, String email, String phone, String password, LocalDate employment_date) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.specialization = specialization;
        this.birthday = birthday;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.employment_date = employment_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getEmployment_date() {
        return employment_date;
    }

    public void setEmployment_date(LocalDate employment_date) {
        this.employment_date = employment_date;
    }
}
