package techmasterStudent.service;

import techmasterStudent.entities.ITStudent;

import java.util.Scanner;

public class ItStudentInfo {
    public void enterITStudent(Scanner scanner){
//        System.out.println("Enter name: ");
//        String name = scanner.nextLine() ;
//        System.out.println("Enter major: ");
//        String major = scanner.nextLine() ;
        System.out.println("Enter point in Java: ");
        double java = Double.parseDouble(scanner.nextLine()) ;
        System.out.println("Enter point in HTML: ");
        double html = Double.parseDouble(scanner.nextLine()) ;
        System.out.println("Enter point in CSS: ");
        double css = Double.parseDouble(scanner.nextLine()) ;
    }
}
