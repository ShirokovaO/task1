package by.java.homework.task14;

import by.java.homework.task14.enams.GenderEnum;
import com.sun.source.tree.Tree;

import java.util.*;

public class Ward {
    //1.2 У палаты поля: номер, тип палаты (энам мужская или женская), список пациентов
    private int number;
    private GenderEnum genderWard;
    private String diagnosis;
    private TreeSet<Patient> patients;

    public Ward(int number, GenderEnum genderWard, TreeSet<Patient> patients) {
        this.number = number;
        this.genderWard = genderWard;
        this.patients = patients;
    }

    public Ward(int number, String diagnosis, TreeSet<Patient> patients) {
        this.number = number;
        this.diagnosis = diagnosis;
        this.patients = patients;
    }

    public Ward() {
    }

    @Override
    public String toString() {
        return "Ward{" +
                "number=" + number +
                ", typeEnam='" + genderWard + '\'' +
                ", \npatients=" + patients.toString() +
                "}\n";
    }


    public Ward addPatientByDiagnosis(TreeSet<Patient> patients, String diagnosis, int number) {
        TreeSet<Patient> patientList = new TreeSet<>();
        for (Patient patient : patients) {
            if (patient.getDiagnosis().equals(diagnosis)) {
                patientList.add(patient);
            }
        }
        Ward ward = new Ward(number,diagnosis, patientList);
        return ward;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public GenderEnum getGenderWard() {
        return genderWard;
    }

    public void setGenderWard(GenderEnum genderWard) {
        this.genderWard = genderWard;
    }

    public TreeSet<Patient> getPatients() {
        return patients;
    }

    public void setPatients(TreeSet<Patient> patients) {
        this.patients = patients;
    }
}
