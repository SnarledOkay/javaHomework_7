package techmasterStudent.service;

import techmasterStudent.entities.BizStudent;

import java.util.Scanner;

public class BizStudentInfo {
    public void enterBizStudent(Scanner scanner){
        System.out.println("Enter marketing points: ");
        double marketing = Double.parseDouble(scanner.nextLine()) ;
        System.out.println("Enter sales points: ");
        double sales = Double.parseDouble(scanner.nextLine()) ;
    }
}
