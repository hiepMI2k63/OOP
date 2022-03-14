package bai13.Entity;


import java.time.LocalDate;
import java.util.List;

public class Experience extends Employee{
    private LocalDate yearOfExperience;
    private String proSkill;



    public Experience(String id, String fullName, String birthday, String phone, String email, List<Certification> certificates, LocalDate yearOfExperience, String proSkill) {
        super(id, fullName, birthday, phone, email, certificates);
        this.yearOfExperience = yearOfExperience;
        this.proSkill = proSkill;
    }

    @Override
    public void showInformation() {
        System.out.println(this);
    }

    public LocalDate getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(LocalDate yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", yearOfExperience=" + yearOfExperience +
                ", certification=" + certificates +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}
