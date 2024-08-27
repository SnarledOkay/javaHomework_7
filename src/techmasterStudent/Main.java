package techmasterStudent;

import techmasterStudent.entities.BizStudent;
import techmasterStudent.entities.ITStudent;
import techmasterStudent.entities.TechmasterStudent;
import techmasterStudent.service.BizStudentInfo;
import techmasterStudent.service.ItStudentInfo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int sinhvienIT = 0 , sinhvienBiz = 0 ;
        System.out.println("Enter number of students: ");
        int n = Integer.parseInt(scanner.nextLine()) ;
        ArrayList<TechmasterStudent>[] student = new ArrayList[2] ;
        for(int i = 0 ; i < 2 ; i++){
            student[i] = new ArrayList<TechmasterStudent>() ;
        }
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter the information of student " + (i+1) + ":");
            String name = scanner.nextLine() ;
            String major = scanner.nextLine() ;
            if(major.equalsIgnoreCase("it")){
                System.out.println("Enter points in Java, HTML and CSS: ");
                double java = Double.parseDouble(scanner.nextLine()) ;
                double html = Double.parseDouble(scanner.nextLine()) ;
                double css = Double.parseDouble(scanner.nextLine()) ;
                ITStudent itStudent = new ITStudent(name,major, java,html,css) ;
                double point = itStudent.getPoint() ;
                String classification = itStudent.classify();
                student[0].add(new ITStudent(name,major,point,classification)) ;
                sinhvienIT++ ;
//                student[0].add(new ITStudent(name,major,))
            }
            else{
                System.out.println("Enter points in marketing and sales: ");
                double marketing = Double.parseDouble(scanner.nextLine()) ;
                double sales = Double.parseDouble(scanner.nextLine()) ;
                BizStudent bizStudent = new BizStudent(name,major, marketing,sales) ;
                double point = bizStudent.getPoint() ;
                String classification = bizStudent.classify();
                student[1].add(new BizStudent(name,major,point,classification)) ;
                sinhvienBiz++ ;
            }
        }
        System.out.println("Information of all IT students: ");
        int num = 0 ;
        for(TechmasterStudent k : student[0]){
            num++ ;
            System.out.println("Student " + num + ":");
            k.printInfo();
            System.out.println();
        }
        num = 0 ;
        for(TechmasterStudent k : student[1]){
            num++ ;
            System.out.println("Student " + num + ":");
            k.printInfo();
            System.out.println();
        }
    }
}
