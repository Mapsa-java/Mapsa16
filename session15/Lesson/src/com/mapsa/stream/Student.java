package com.mapsa.stream;

public class Student {

    private String firstName;
    private String nationalCode;
    private String lastName;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String studentId;
    private Course course;
    private double gpa = 0 ;


    public Student(String firstName) {
        this.firstName = firstName;
    }

    public Student(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public Student(String firstName, String nationalCode, String lastName, int age, Gender gender, String address, String phoneNumber, String email, String studentId, Course course, double gpa) {
        this.firstName = firstName;
        this.nationalCode = nationalCode;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.studentId = studentId;
        this.course = course;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        return firstName;
    }

    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    public enum Course {
        COMPUTER_SCIENCE,
        MATHEMATICS,
        BIOLOGY,
        ENGLISH
    }
}
