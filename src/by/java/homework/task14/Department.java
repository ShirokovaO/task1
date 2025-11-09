package by.java.homework.task14;

import by.java.homework.task14.enams.GenderEnum;

import java.util.Set;

public class Department {
    //1.3 У отделения поля: наименование отделения, список палат (коллекция Set)
    //1.5 Посчитать количество мужчин и женщин в отделении.
    private String nameDepartment;
    Set<Ward> wards;

    public Department(String nameDepartment, Set<Ward> wards) {
        this.nameDepartment = nameDepartment;
        this.wards = wards;
    }

    @Override
    public String toString() {
        return "Department{" +
                "nameDepartment='" + nameDepartment + '\'' +
                ", wards=" + wards +
                '}';
    }

    public String countMenWomen (Department department){
        int men = 0;
        int women = 0;
        for (Ward ward :wards){
            if (ward.getGenderWard().equals(GenderEnum.MAN)){
                men = ward.getPatients().size();
            } else if (ward.getGenderWard().equals(GenderEnum.WOMAN)){
                women = ward.getPatients().size();
            }
        }
        String countMenWomen = "количество женщин в отделении " + getNameDepartment()+ ": " + women + "\nколичество мужчин в отделении " + getNameDepartment()+ ": "+ men;
        return countMenWomen;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public Set<Ward> getWards() {
        return wards;
    }

    public void setWards(Set<Ward> wards) {
        this.wards = wards;
    }
}
