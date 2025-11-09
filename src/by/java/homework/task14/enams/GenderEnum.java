package by.java.homework.task14.enams;

public enum GenderEnum {
    MAN("мужской", "мужская"),
    WOMAN("женский", "женская");

    private String gender;
    private String genderWard;

    GenderEnum(String gender, String genderWard) {
        this.gender = gender;
        this.genderWard = genderWard;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGenderWard() {
        return genderWard;
    }

    public void setGenderWard(String genderWard) {
        this.genderWard = genderWard;
    }
}
