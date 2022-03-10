package bai8;

public class Student {
    private String name;
    private String classStudent;
    private int age;
    public Student(String name, String classStudent, int age) {
        this.name = name;
        this.classStudent = classStudent;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", classStudent=" + classStudent + ", name=" + name + "]";
    }

    
}
