
package bai13.UI;

import bai13.Entity.Employee;
import bai13.Entity.Experience;
import bai13.Entity.Fresher;
import bai13.Entity.Intern;
import bai13.Exception.BirthDayException;
import bai13.Exception.EmailException;
import bai13.Exception.FullNameException;
import bai13.Exception.PhoneException;
import bai13.Entity.Certification;

import bai13.Service.EmployeeManager;
import bai13.Service.ValidatorService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UIManager {

    private EmployeeManager employeeManager = new EmployeeManager();

    public void insert(int type,boolean flag,String updateid) {
        Employee employee = null;
        if (type == 3) {
            employee = insertExperience(flag,updateid);
        }
        if (type == 1) {
            employee = insertFresher(flag,updateid);
        }
        if (type == 2) {
            employee = insertIntern(flag,updateid);
        }

        this.employeeManager.insert(employee);
    }

    private Experience insertExperience(boolean flag,String updateid) {
        String id ;
        Scanner scanner = new Scanner(System.in);
        if (flag == true) {
            System.out.print("Input ID: ");
            id = scanner.nextLine();
        }
        else {
             
            id = updateid;
           
        }
      
        System.out.print("Input Name: ");
        String name = scanner.nextLine();
        try {
            checkFullName(name);
        } catch (FullNameException m) {
            System.out.println("Exception occured: " + m.getMessage());
           
            return null;
        }

     

        System.out.print("Input Phone: ");
        String phone = scanner.nextLine();
        try {
            checkPhone(phone);
        } catch (PhoneException m) {
            System.out.println("Exception occured: " + m.getMessage());
            return null;
        }

        System.out.print("Input Email: ");
        String email = scanner.nextLine();
        try {
            checkEmail(email);
        } catch (EmailException m) {
            System.out.println("Exception occured: " + m.getMessage());
            return null;
        }
        System.out.print("Input birthday: ");
        String birthday = scanner.nextLine();

        try {
            checkBirthday(birthday);
        } catch (BirthDayException m) {
            System.out.println("Exception occured: " + m.getMessage());
            return null;
        }

        System.out.print("Input  proSkill: ");
        String proSkill = scanner.nextLine();
       
        System.out.print("Input yearOfExperience: ");
        String yearOfExperience1 = scanner.nextLine();
        LocalDate yearOfExperience = LocalDate.parse(yearOfExperience1);
        System.out.print("Input number of certificates : ");
        int n = Integer.valueOf(scanner.nextLine());
        List<Certification> certificates = null;

        for (int i = 1; i <=n; i++) {
            certificates = new ArrayList<>();
            System.out.print("Input certificates id: ");
            String certificatesId = scanner.nextLine();
            System.out.print("Input certificates  Name: ");
            String certificatesName = scanner.nextLine();
            System.out.print("Input certificates rank: ");
            String certificatesRank = scanner.nextLine();
            System.out.print("Input certificates  date: ");
            String certificatesDate = scanner.nextLine();
            LocalDate certificatesDate1 = LocalDate.parse(certificatesDate);
            Certification certificate = new Certification(certificatesId, certificatesName, certificatesRank,
                    certificatesDate1);
            certificates.add(certificate);
        }
        if (flag == false) {
            employeeManager.deleteById(id);
            }

        Experience experience = new Experience(id, name, birthday, phone, email, certificates,yearOfExperience,proSkill);
     
      
        return experience;
    }

    private Intern insertIntern(boolean flag,String updateid) {

       
        String id ;
        Scanner scanner = new Scanner(System.in);
        if (flag == true) {
            System.out.print("Input ID: ");
            id = scanner.nextLine();
        }
        else {
             
            id = updateid;
           
        }
        System.out.print("Input Name: ");
        String name = scanner.nextLine();
        try {
            checkFullName(name);
        } catch (FullNameException m) {
            System.out.println("Exception occured: " + m.getMessage());
            return null;
        }

      
        System.out.print("Input Phone: ");
        String phone = scanner.nextLine();
        try {
            checkPhone(phone);
        } catch (PhoneException m) {
            System.out.println("Exception occured: " + m.getMessage());
            return null;
        }

        System.out.print("Input Email: ");
        String email = scanner.nextLine();
        try {
            checkEmail(email);
        } catch (EmailException m) {
            System.out.println("Exception occured: " + m.getMessage());
            return null;
        }
        System.out.print("Input birthday: ");
        String birthday = scanner.nextLine();

        try {
            checkBirthday(birthday);
        } catch (BirthDayException m) {
            System.out.println("Exception occured: " + m.getMessage());
            return null;
        }

        System.out.print("Input  major: ");
        String major = scanner.nextLine();
       
        System.out.print("Input semester: ");
        int semester = Integer.valueOf(scanner.nextLine());
       
        System.out.print("Input graduation university Name: ");
        String universityName = scanner.nextLine();


        System.out.print("Input number of certificates : ");
        int n = Integer.valueOf(scanner.nextLine());
        List<Certification> certificates = null;

        for (int i = 1; i <=n; i++) {
            certificates = new ArrayList<>();
            System.out.print("Input certificates id: ");
            String certificatesId = scanner.nextLine();
            System.out.print("Input certificates  Name: ");
            String certificatesName = scanner.nextLine();
            System.out.print("Input certificates rank: ");
            String certificatesRank = scanner.nextLine();
            System.out.print("Input certificates  date: ");
            String certificatesDate = scanner.nextLine();
            LocalDate certificatesDate1 = LocalDate.parse(certificatesDate);
            Certification certificate = new Certification(certificatesId, certificatesName, certificatesRank,
                    certificatesDate1);
            certificates.add(certificate);
        }
    if (flag == false) {
                employeeManager.deleteById(id);
                }
                
        Intern intern = new Intern(id, name, birthday, phone, email, certificates,major,semester,universityName);
        return intern;
    }

    private Fresher insertFresher(boolean flag,String updateid) {
        String id ;
        Scanner scanner = new Scanner(System.in);
        if (flag == true) {
            System.out.print("Input ID: ");
            id = scanner.nextLine();
        }
        else {
             
            id = updateid;
           
        }
    
        System.out.print("Input Name: ");
        String name = scanner.nextLine();
        try {
            checkFullName(name);
        } catch (FullNameException m) {
            System.out.println("Exception occured: " + m.getMessage());
            return null;
        }

       

        System.out.print("Input Phone: ");
        String phone = scanner.nextLine();
        try {
            checkPhone(phone);
        } catch (PhoneException m) {
            System.out.println("Exception occured: " + m.getMessage());
            return null;
        }

        System.out.print("Input Email: ");
        String email = scanner.nextLine();
        try {
            checkEmail(email);
        } catch (EmailException m) {
            System.out.println("Exception occured: " + m.getMessage());
            return null;
        }
        System.out.print("Input birthday: ");
        String birthday = scanner.nextLine();

        try {
            checkBirthday(birthday);
        } catch (BirthDayException m) {
            System.out.println("Exception occured: " + m.getMessage());
            return null;
        }
        System.out.print("Input graduation Date: ");
        String graduationDate1 = scanner.nextLine();
        LocalDate graduationDate = LocalDate.parse(graduationDate1);
        System.out.print("Input graduation Rank: ");
        String graduationRank = scanner.nextLine();
        System.out.print("Input graduation university Name: ");
        String universityName = scanner.nextLine();
        
        System.out.print("Input number of certificates : ");
        int n = Integer.valueOf(scanner.nextLine());

        List<Certification> certificates = new ArrayList<>();

        for (int i = 1; i <=n; i++) {
        //    certificates = new ArrayList<>(); ui rồi ôi may có anh phúc chỉ  
            System.out.print("Input certificates id: ");
            String certificatesId = scanner.nextLine();
            System.out.print("Input certificates  Name: ");
            String certificatesName = scanner.nextLine();
            System.out.print("Input certificates rank: ");
            String certificatesRank = scanner.nextLine();
            System.out.print("Input certificates  date: ");
            String certificatesDate = scanner.nextLine();
            LocalDate certificatesDate1 = LocalDate.parse(certificatesDate);
            Certification certificate = new Certification(certificatesId, certificatesName, certificatesRank,
                    certificatesDate1);
            certificates.add(certificate);
        }

        
        if (flag == false) {
        employeeManager.deleteById(id);
        }

        Fresher fresher = new Fresher(id, name, birthday, phone, email, certificates, graduationDate, graduationRank,
                universityName);
        
        return fresher;
    }
    private void checkBirthday(String strDate)
            throws BirthDayException {
            ValidatorService.birthdayCheck(strDate);
    }

    private void checkEmail(String strDate)
            throws EmailException {
        ValidatorService.emailCheck(strDate);
    }

    private void checkFullName(String strDate)
            throws FullNameException {
        ValidatorService.fullNameCheck(strDate);

    }

    private void checkPhone(String strDate)
            throws PhoneException {
        ValidatorService.phoneCheck(strDate);

    }
    public void deleteById(String id) {
       boolean flag = 
        employeeManager.deleteById(id);
        if (flag) {
            System.out.println(" delete successful");
        }
        else{
            System.out.println(" don't delete ");
        }
    }
    public void showEmployeeById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id:");
        String id = scanner.nextLine();
        Employee x =  employeeManager.findById(id);
           System.out.println(x);
           //System.out.println(t1);
        
    }
    public void showAllEmployee() {
        // this.employeeManager.findAll().forEach(Employee::showInformation);
         //System.out.println(this.employeeManager.findAll());
       //  for (Employee tEmployee : this.employeeManager.findAll()) {
             System.out.println(this.employeeManager.findAll());
        // }
      }
      public void showByType( int type) {
        List<Employee> x = this.employeeManager.findByType(type);
        System.out.println(x);
      }
}
