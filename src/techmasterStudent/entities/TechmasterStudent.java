package techmasterStudent.entities;

public abstract class TechmasterStudent {
    private String fullName ;
    private String major ;
//    private double averagePoint ;
//    private String classify ;

    public TechmasterStudent(String fullName, String major) {
        this.fullName = fullName;
        this.major = major;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public abstract double getPoint() ;
    public String classify(){
        if(getPoint() < 5){
            return "Weak" ;
        }
        else if(getPoint() < 6.5){
            return "Average" ;
        }
        else if(getPoint() < 7.5){
            return "Good" ;
        }
        else return "Excellent" ;
    }

    public void printInfo(){
        System.out.println("Name: " + fullName + "\nMajor: " + major + "\nPoint: " + getPoint() + "\nClassify: " + classify());
    }
}
