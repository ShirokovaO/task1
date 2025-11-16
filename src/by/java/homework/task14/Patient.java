package by.java.homework.task14;

import by.java.homework.task14.enams.GenderEnum;

public class Patient implements Comparable<Patient> {
    //1.1 У пациента поля: уникальный идентификатор, имя, фамилия, диагноз, возраст, пол (сделать enum класс: Мужской, Женский).
    private int id;
    private String name;
    private String surname;
    private String diagnosis;
    private int age;
    private GenderEnum gender;


    public Patient(int id, String name, String surname, String diagnosis, int age, GenderEnum gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", age=" + age +
                ", gender='" + getGender() + '\'' +
                "}\n";
    }

    @Override
    public boolean equals(Object obj) {
        Patient patient = (Patient) obj;
        if (diagnosis.equals(patient.getDiagnosis())) {
            return true;
        } else
            return false;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode() + surname.hashCode() + diagnosis.hashCode() + age + gender.hashCode();
        return result;
    }

    @Override
    public int compareTo(Patient o) {
        if (id > o.getId()) {
            return 1;
        } else if (id == o.getId()) {
            return 0;
        }
        return -1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }
}
