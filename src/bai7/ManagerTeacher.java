package bai7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * ManagerTeacher
 */
public class ManagerTeacher {

    List<Teacher> teachers;
    public ManagerTeacher()
    {
        this.teachers  = new ArrayList<>();
    }
    // public Candidate searchById(String id) {
    //     return this.candidates.stream().filter(candidate -> candidate.getId().equals(id)).findFirst().orElse(null);
    // }
    public void add(Teacher teacher)
    {
        this.teachers.add(teacher);
    }
    public Teacher findTeacher( String id) {
        return this.teachers.stream().filter( teacher -> teacher.getId().equals(id)).findFirst().orElse(null);
    }
    public boolean deleteTeacher( String id)
    {
        Teacher teachertemp =  this.teachers.stream().filter( teacher -> teacher.getId().equals(id)).findFirst().orElse(null);
       if (teachertemp != null) {
           this.teachers.remove(teachertemp);
           return true;
       }
        else{
            return false;
        }
    }
    public double caculationSalary(String id)
    {
        Teacher teachertemp = this.teachers.stream().filter( teacher -> teacher.getId().equals(id)).findFirst().orElse(null);
        if (teachertemp != null) {
             return teachertemp.getBonus()+teachertemp.getSalary() - teachertemp.getPenaty();
        }
        else
        {
            return 0;
        }
    }

}