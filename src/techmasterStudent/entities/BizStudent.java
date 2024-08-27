package techmasterStudent.entities;

public class BizStudent extends TechmasterStudent{
    private double marketing ;
    private double sales ;
    //    private double


    public BizStudent(String fullName, String major, double marketing, double sales) {
        super(fullName, major);
        this.marketing = marketing;
        this.sales = sales;
    }

    public BizStudent(String fullName, String major, double averagePoint , String classify) {
        super(fullName, major);
    }

    public BizStudent(String fullName, String major) {
        super(fullName, major);
    }
    //    public BizStudent(String fullName, String major,) {
//        super(fullName, major);
//        this.marketing = marketing;
//        this.sales = sales;
//    }

    public double getMarketing() {
        return marketing;
    }

    public void setMarketing(double marketing) {
        this.marketing = marketing;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public double getPoint() {
        return (2*marketing+sales)/3 ;
    }
}
