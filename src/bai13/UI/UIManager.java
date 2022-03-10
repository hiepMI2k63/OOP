
package bai13.UI;

import  bai13.Entity.Employee;
import  bai13.Entity.Experience;
import  bai13.Entity.Fresher;
import  bai13.Entity.Intern;
import  bai13.Entity.Certification;


import bai13.Service.EmployeeManager;
import bai13.Service.ValidatorService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UIManager {

    private EmployeeManager employeeManager = new EmployeeManager();

    /**
     * @param type
     * @return Employee
     * type = 0 => Experience
     * type = 1 => Fresher
     * type = 2 => Intern
     */
    public void insert(int type) {
        Employee employee = null;
        if (type == 0) {
            employee = insertExperience();
        }
        if (type == 1) {
            employee = insertFresher();
        }
        if (type == 2) {
            employee = insertIntern();
        }
        this.employeeManager.insert(employee);
    }

    private Experience insertExperience() {
        Experience experience = new Experience();
    
        // TODO
        return experience;
    }

    private Intern insertIntern() {

        Intern intern = new Intern();
        // TODO
        return intern;
    }

    private Fresher insertFresher( ) {
    
       Scanner scanner = new Scanner(System.in);
       System.out.print("Input ID: ");
       String id = scanner.nextLine();
       System.out.print("Input Name: ");
       String name = scanner.nextLine();
       System.out.print("Input birthday: ");
       String birthday1 = scanner.nextLine();
       LocalDate birthday = LocalDate.parse(birthday1);
       System.out.print("Input Phone: ");
       String phone = scanner.nextLine();
       System.out.print("Input Email: ");
       String email = scanner.nextLine();
       System.out.print("Input graduation Date: ");
       String graduationDate1 = scanner.nextLine();
       LocalDate graduationDate = LocalDate.parse(graduationDate1);
       System.out.print("Input graduation Rank: ");
       String graduationRank = scanner.nextLine();
       System.out.print("Input graduation university Name: ");
       String universityName = scanner.nextLine();
       System.out.print("Input number of certificates : ");
       int n = Integer.valueOf(scanner.nextLine());
       List<Certification> certificates = null;
       
       for (int i = 0; i <n; i++) {
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
               Certification certificate = new Certification(certificatesId, certificatesName, certificatesRank, certificatesDate1);
               certificates.add(certificate);
       }

       Fresher fresher = new Fresher(id, name, birthday, phone, email, certificates, graduationDate, graduationRank, universityName);
       fresher.showInformation();
       return fresher;
}

 

    public void showAllEmployee() {
        this.employeeManager.findAll().forEach(Employee::showInformation);
    }

}
