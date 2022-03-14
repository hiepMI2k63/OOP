package bai13.Entity;



import java.util.List;

public abstract class Employee {
    public static long count = 0;
    protected String id;
    protected String fullName;
    protected String birthday;
    protected String phone;
    protected String email;
    protected List<Certification> certificates;

    public Employee(String id, String fullName, String birthday, String phone, String email,
            List<Certification> certificates) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.certificates = certificates;
    }


    @Override
    public String toString() {
        return "Employee [birthday=" + birthday + ", certificates=" + certificates + ", email=" + email + ", fullName="
                + fullName + ", id=" + id + ", phone=" + phone + "]";
    }


    public abstract void showInformation();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Certification> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certification> certificates) {
        this.certificates = certificates;
    }
}
