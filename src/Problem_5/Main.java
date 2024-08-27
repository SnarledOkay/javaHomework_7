package Problem_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter the number of students: ");

//        Nhập thông tin sinh viên
        int n = Integer.parseInt(scanner.nextLine()) ;
        Student[] student = new Student[n] ;
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter the information of students (in order: ID,Full Name,Place of Birth,Gender,Average point,Major: ");
            int id = Integer.parseInt(scanner.nextLine()) ;
            String name = scanner.nextLine() ;
            String place = scanner.nextLine() ;
            String gender = scanner.nextLine() ;
            double point = Double.parseDouble(scanner.nextLine()) ;
            String major = scanner.nextLine() ;
            student[i] = new Student(id,name,place,gender,point,major) ;
        }

//        Thay đổi thông tin 1 sinh viên
        int k = n / 2 ;
        int id = Integer.parseInt(scanner.nextLine()) ;
        String place = scanner.nextLine() ;
        String gender = scanner.nextLine() ;
        student[k].setGender(gender);
        student[k].setPlaceOfBirth(place);
        student[k].setStudentID(id);

//        Xóa 1 sinh viên đi
        for(int i = k ; i < n ; i++){
            student[i].setMajor(student[i+1].getMajor());
            student[i].setStudentID(student[i+1].getStudentID());
            student[i].setGender(student[i+1].getGender());
            student[i].setName(student[i+1].getName());
            student[i].setPlaceOfBirth(student[i+1].getPlaceOfBirth());
            student[i].setPoint(student[i+1].getPoint());
        }
    }
}
