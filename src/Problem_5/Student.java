package Problem_5;

public class Student {
    private int studentID ;
    private String name ;
    private String placeOfBirth ;
    private String gender ;
    private double point ;
    private String major ;

    public Student(int studentID, String name, String placeOfBirth, String gender, double point, String major) {
        this.studentID = studentID;
        this.name = name;
        this.placeOfBirth = placeOfBirth;
        this.gender = gender;
        this.point = point;
        this.major = major;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "\nStudent ID: " + getStudentID() +
                "\nStudent name: " + getName() +
                "\nPlace of birth: " + getPlaceOfBirth() +
                "\nGender: " + getGender() +
                "\nAverage point: " + getPoint() +
                "\nMajor: " + getMajor() ;
    }
}
