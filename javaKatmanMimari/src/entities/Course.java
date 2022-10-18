package entities;

public class Course {

    private int courseNumber;
    private String courseName;
    private double coursePrice;

    public Course() {
        super();
    }

    public Course(int courseNumber, String courseName, double coursePrice) {
        super();
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

}