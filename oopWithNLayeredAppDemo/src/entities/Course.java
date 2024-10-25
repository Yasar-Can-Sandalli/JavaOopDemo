package entities;

public class Course {
    private int courseID;
    private String courseName;
    private String categoryName;
    private String instructorName;
    private String instructorLastName;
    private double coursePrice;

    public Course(int courseID, String courseName, String categoryName, String instructorName, String instructorLastName,double coursePrice) {
        this.setCourseID(courseID);
        this.setCourseName(courseName);
        this.setCategoryName(categoryName);
        this.setInstructorName(instructorName);
        this.setInstructorLastName(instructorLastName);
        this.setCoursePrice(coursePrice);
    }

    public Course() {

    }


    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
}
