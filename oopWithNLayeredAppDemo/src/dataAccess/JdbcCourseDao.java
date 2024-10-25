package dataAccess;

import entities.Course;

public class JdbcCourseDao implements BaseCourseDao{
    @Override
    public void addCourse(Course course) {
        System.out.println("JDBC Course Added : " + course.getCourseName());
    }
}
