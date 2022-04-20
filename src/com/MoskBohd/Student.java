package com.MoskBohd;

import java.time.LocalDate;

public class Student extends Person{

    private Person studentPersonalInfo;
    private LocalDate dateOfAdmission;
    private LocalDate dateOfGraduation;
    private boolean isFullTimeEducation;
    private String lettersOfStudentTicket;
    private int codeOfStudentTicket;
    private String nameOfUniversity;
    private int postcodeOfUniversity;
    private String postAddressOfUniversity;
    private String addressOfUniversity;
    private String nameOfFaculty;
    private int codeOfFaculty;
    private int numberOfStudentGroup;
    private int amountOfStudentsInGroup;
    private Person groupLeaderPersonalInfo;
    private int amountOfSubjects;
    private int amountOfExamPerSemester;
    private String studentAddressOfPermanentResidence;
    private String studentCurrentAddressOfResidence;
    private String studentPhoneNumber;
    private int studentCourseNumber;
    private boolean isBudget;
    private boolean haveStipend;
    private byte bloodType;
    private boolean rhesusBloodFactor;
    private String studentNationality;

    public Student(String firstName, String lastName, String patronymic, LocalDate dateOFBirth) {
        super(firstName, lastName, patronymic, dateOFBirth);
    }

    // Getters and Setters

    public Person getStudentPersonalInfo() {
        return studentPersonalInfo;
    }

    public void setStudentPersonalInfo(Person studentPersonalInfo) {
        this.studentPersonalInfo = studentPersonalInfo;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public LocalDate getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(LocalDate dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    public boolean isFullTimeEducation() {
        return isFullTimeEducation;
    }

    public void setFullTimeEducation(boolean fullTimeEducation) {
        isFullTimeEducation = fullTimeEducation;
    }

    public String getLettersOfStudentTicket() {
        return lettersOfStudentTicket;
    }

    public void setLettersOfStudentTicket(String lettersOfStudentTicket) {
        this.lettersOfStudentTicket = lettersOfStudentTicket;
    }

    public int getCodeOfStudentTicket() {
        return codeOfStudentTicket;
    }

    public void setCodeOfStudentTicket(int codeOfStudentTicket) {
        this.codeOfStudentTicket = codeOfStudentTicket;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public int getPostcodeOfUniversity() {
        return postcodeOfUniversity;
    }

    public void setPostcodeOfUniversity(int postcodeOfUniversity) {
        this.postcodeOfUniversity = postcodeOfUniversity;
    }

    public String getPostAddressOfUniversity() {
        return postAddressOfUniversity;
    }

    public void setPostAddressOfUniversity(String postAddressOfUniversity) {
        this.postAddressOfUniversity = postAddressOfUniversity;
    }

    public String getAddressOfUniversity() {
        return addressOfUniversity;
    }

    public void setAddressOfUniversity(String addressOfUniversity) {
        this.addressOfUniversity = addressOfUniversity;
    }

    public String getNameOfFaculty() {
        return nameOfFaculty;
    }

    public void setNameOfFaculty(String nameOfFaculty) {
        this.nameOfFaculty = nameOfFaculty;
    }

    public int getCodeOfFaculty() {
        return codeOfFaculty;
    }

    public void setCodeOfFaculty(int codeOfFaculty) {
        this.codeOfFaculty = codeOfFaculty;
    }

    public int getNumberOfStudentGroup() {
        return numberOfStudentGroup;
    }

    public void setNumberOfStudentGroup(int numberOfStudentGroup) {
        this.numberOfStudentGroup = numberOfStudentGroup;
    }

    public int getAmountOfStudentsInGroup() {
        return amountOfStudentsInGroup;
    }

    public void setAmountOfStudentsInGroup(int amountOfStudentsInGroup) {
        this.amountOfStudentsInGroup = amountOfStudentsInGroup;
    }

    public Person getGroupLeaderPersonalInfo() {
        return groupLeaderPersonalInfo;
    }

    public void setGroupLeaderPersonalInfo(Person groupLeaderPersonalInfo) {
        this.groupLeaderPersonalInfo = groupLeaderPersonalInfo;
    }

    public int getAmountOfSubjects() {
        return amountOfSubjects;
    }

    public void setAmountOfSubjects(int amountOfSubjects) {
        this.amountOfSubjects = amountOfSubjects;
    }

    public int getAmountOfExamPerSemester() {
        return amountOfExamPerSemester;
    }

    public void setAmountOfExamPerSemester(int amountOfExamPerSemester) {
        this.amountOfExamPerSemester = amountOfExamPerSemester;
    }

    public String getStudentAddressOfPermanentResidence() {
        return studentAddressOfPermanentResidence;
    }

    public void setStudentAddressOfPermanentResidence(String studentAddressOfPermanentResidence) {
        this.studentAddressOfPermanentResidence = studentAddressOfPermanentResidence;
    }

    public String getStudentCurrentAddressOfResidence() {
        return studentCurrentAddressOfResidence;
    }

    public void setStudentCurrentAddressOfResidence(String studentCurrentAddressOfResidence) {
        this.studentCurrentAddressOfResidence = studentCurrentAddressOfResidence;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public int getStudentCourseNumber() {
        return studentCourseNumber;
    }

    public void setStudentCourseNumber(int studentCourseNumber) {
        this.studentCourseNumber = studentCourseNumber;
    }

    public boolean isBudget() {
        return isBudget;
    }

    public void setBudget(boolean budget) {
        isBudget = budget;
    }

    public boolean isHaveStipend() {
        return haveStipend;
    }

    public void setHaveStipend(boolean haveStipend) {
        this.haveStipend = haveStipend;
    }

    public byte getBloodType() {
        return bloodType;
    }

    public void setBloodType(byte bloodType) {
        this.bloodType = bloodType;
    }

    public boolean isRhesusBloodFactor() {
        return rhesusBloodFactor;
    }

    public void setRhesusBloodFactor(boolean rhesusBloodFactor) {
        this.rhesusBloodFactor = rhesusBloodFactor;
    }

    public String getStudentNationality() {
        return studentNationality;
    }

    public void setStudentNationality(String studentNationality) {
        this.studentNationality = studentNationality;
    }
    //
}
