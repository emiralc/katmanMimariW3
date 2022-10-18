package entities;

public class Instructor {
    private int instructorNumber;
    private String instructorName;
    private String instructorLastName;

    public Instructor() {
    }

    public Instructor(int instructorNumber, String instructorName, String instructorLastName) {
        this.instructorNumber = instructorNumber;
        this.instructorName = instructorName;
        this.instructorLastName = instructorLastName;
    }

    public int getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(int instructorId) {
        this.instructorNumber = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorLastName() {
        return instructorLastName;
    }

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }

}
