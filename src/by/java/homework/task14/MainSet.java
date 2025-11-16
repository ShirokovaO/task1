package by.java.homework.task14;

import by.java.homework.task14.enams.GenderEnum;

import java.util.*;

public class MainSet {
    static void main(String[] args) {
//1. Создать класс пациент, палата, отделение.
//1.1 У пациента поля: уникальный идентификатор, имя, фамилия, диагноз, возраст, пол (сделать enum класс: Мужской, Женский).
//1.2 У палаты поля: номер, тип палаты (энам мужская или женская), список пациентов
//1.3 У отделения поля: наименование отделения, список палат (коллекция Set)
//1.4 Создать пациентов. Распределить их по палатам. В одной палате по 3 пациента максимум. При этом попробуйте добавить двух пациентов, с одинаковыми полями. Если количество пациентов в палате увеличилось, значит неправильно реализованы equals и hashСode. Палаты распределить по отделениям.
//1.5 Посчитать количество мужчин и женщин в отделении.
//1.6 Реализовать метод добавления пациента в палату на основе диагноза. Т.е, в палате должны лежать пациенты с одинаковыми диагнозами. Метод реализовать в классе Палата.
//1.7 В классе Палата создать метод, которые выводить информацию по всем пациентам в палате.
//1.8*. Сортировать пациентов по идентификационному номеру. (коллекция TreeSet, интерфейс Comparable) Для этого в классе Палата пациенты должны лежать в коллекции TreeSet. А класс пациент должен имплементировать интерфейс Comparable

        Patient patient1 = new Patient(1, "Vasya", "Pupkin", "Abuser", 29, GenderEnum.MAN);
        Patient patient2 = new Patient(2, "Petya", "Durkin", "ponos", 71, GenderEnum.MAN);
        Patient patient3 = new Patient(3, "Tosya", "Vilkina", "UshibMozga", 22, GenderEnum.WOMAN);
        Patient patient4 = new Patient(4, "Frosya", "Tarelkina", "UshibMozga", 22, GenderEnum.WOMAN);
        Patient patient5 = new Patient(5, "Stepan", "Turkin", "ponos", 48, GenderEnum.MAN);
        Patient patient6 = new Patient(6, "Ignat", "Stelkin", "COVID", 33, GenderEnum.MAN);
        Patient patient7 = new Patient(7, "Dormidont", "Germidontovich", "Abuser", 50, GenderEnum.MAN);
        Patient patient8 = new Patient(8, "Angelika", "Velikanova", "UshibMozga", 29, GenderEnum.WOMAN);
        Patient patient9 = new Patient(9, "Tarzan", "Ivanov", "COVID", 38, GenderEnum.MAN);
        Patient patient10 = new Patient(10, "Dazdraperma", "Lenina", "Objorstvo", 30, GenderEnum.WOMAN);
        Patient patient11 = new Patient(11, "Trolebuzina", "Pugovkina", "Objorstvo", 52, GenderEnum.WOMAN);
        Patient patient12 = new Patient(11, "Trolebuzina", "Pugovkina", "Objorstvo", 52, GenderEnum.WOMAN);

        TreeSet<Patient> patientsInfection = new TreeSet<>();
        Ward infectionWardMan = new Ward(2,GenderEnum.MAN,patientsInfection);
        patientsInfection.add(patient6);
        patientsInfection.add(patient9);
        System.out.println("infectionWardMan: \n" + infectionWardMan);

        TreeSet<Patient> patientsDurka = new TreeSet<>();
        Ward durkaWardMan = new Ward(6,GenderEnum.MAN,patientsDurka);
        patientsDurka.add(patient1);
        patientsDurka.add(patient7);
        System.out.println("durkaWardMan: \n" + durkaWardMan);


        TreeSet<Patient> patientsZasrancy = new TreeSet<>();
        Ward zasrancyWardMan = new Ward(7,GenderEnum.MAN,patientsZasrancy);
        patientsZasrancy.add(patient5);
        patientsZasrancy.add(patient2);
        System.out.println("zasrancyWardMan: \n" + zasrancyWardMan);

        TreeSet<Patient> patientsDurkaWoman = new TreeSet<>();
        Ward durkaWardWoman = new Ward(66,GenderEnum.WOMAN,patientsDurkaWoman);
        patientsDurkaWoman.add(patient3);
        patientsDurkaWoman.add(patient4);
        patientsDurkaWoman.add(patient8);
        System.out.println("durkaWardWoman: \n" + durkaWardWoman);

        TreeSet<Patient> patientsZasrancyWoman = new TreeSet<>();
        Ward zasrancyWardWoman = new Ward(77,GenderEnum.WOMAN,patientsZasrancyWoman);
        patientsZasrancyWoman.add(patient10);
        patientsZasrancyWoman.add(patient11);
        patientsZasrancyWoman.add(patient12);
        System.out.println("zasrancyWardWoman: \n" + zasrancyWardWoman);

        System.out.println("****************** Отделения ********************");

        Set<Ward> pridurkiWards = new HashSet<>();
        Department pridurkiDep = new Department("Дурдом на выезде", pridurkiWards);
        pridurkiWards.add(durkaWardWoman);
        pridurkiWards.add(durkaWardMan);
        System.out.println("Дурдом на выезде: \n" + pridurkiDep);

        Set<Ward> zasrancyWards = new HashSet<>();
        Department zasrancyDep = new Department("Всегда занято", zasrancyWards);
        zasrancyWards.add(zasrancyWardMan);
        zasrancyWards.add(zasrancyWardWoman);
        System.out.println("Всегда занято: \n" + zasrancyDep);

        System.out.println("*********пункт 1.5************");
        System.out.println(zasrancyDep.countMenWomen(zasrancyDep));
        System.out.println(pridurkiDep.countMenWomen(pridurkiDep));


        System.out.println("*********пункт 1.6************");
        TreeSet<Patient> patients = new TreeSet<>();
        initializeCollection(patients);
        Ward accordingToDiagnosis = new Ward();
        System.out.println(accordingToDiagnosis.addPatientByDiagnosis(patients, "COVID", 3));

        System.out.println("*********пункт 1.8************");
        System.out.println(patients);


    }

    public static void initializeCollection(Collection<Patient> patients) {
        Patient patient1 = new Patient(15, "Vasya", "Pupkin", "Abuser", 29, GenderEnum.MAN);
        Patient patient2 = new Patient(2, "Petya", "Durkin", "ponos", 71, GenderEnum.MAN);
        Patient patient3 = new Patient(3, "Tosya", "Vilkina", "UshibMozga", 22, GenderEnum.WOMAN);
        Patient patient4 = new Patient(4, "Frosya", "Tarelkina", "UshibMozga", 22, GenderEnum.WOMAN);
        Patient patient5 = new Patient(5, "Stepan", "Turkin", "ponos", 48, GenderEnum.MAN);
        Patient patient6 = new Patient(6, "Ignat", "Stelkin", "COVID", 33, GenderEnum.MAN);
        Patient patient7 = new Patient(7, "Dormidont", "Germidontovich", "Abuser", 50, GenderEnum.MAN);
        Patient patient8 = new Patient(8, "Angelika", "Velikanova", "VospalenieHitrosti", 29, GenderEnum.WOMAN);
        Patient patient9 = new Patient(9, "Tarzan", "Ivanov", "COVID", 38, GenderEnum.MAN);
        Patient patient10 = new Patient(10, "Dazdraperma", "Lenina", "VospalenieHitrosti", 30, GenderEnum.WOMAN);
        Patient patient11 = new Patient(11, "Trolebuzina", "Pugovkina", "Objorstvo", 52, GenderEnum.WOMAN);
        Patient patient12 = new Patient(11, "Trolebuzina", "Pugovkina", "Objorstvo", 52, GenderEnum.WOMAN);

        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);
        patients.add(patient4);
        patients.add(patient5);
        patients.add(patient6);
        patients.add(patient7);
        patients.add(patient8);
        patients.add(patient9);
        patients.add(patient10);
        patients.add(patient11);
        patients.add(patient12);
    }
}
