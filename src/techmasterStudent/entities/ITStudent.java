package techmasterStudent.entities;

public class ITStudent extends TechmasterStudent{
    private double html ;
    private double java ;
    private double css ;
    private double averagePoint ;

    public ITStudent(String fullName, String major, double html, double java, double css) {
        super(fullName, major);
        this.html = html;
        this.java = java;
        this.css = css;
    }

    public ITStudent(String fullName, String major, double averagePoint , String classify) {
        super(fullName, major);
    }

    public ITStudent(String fullName, String major) {
        super(fullName, major);
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    @Override
    public double getPoint() {
        return (double) (java * 2 + html + css) /4 ;
    }
}
