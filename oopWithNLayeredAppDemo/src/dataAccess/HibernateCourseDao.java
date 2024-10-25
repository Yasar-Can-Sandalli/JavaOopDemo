package dataAccess;

import entities.Course;

public class HibernateCourseDao implements BaseCourseDao{
    @Override
    public void addCourse(Course course) {
        System.out.println("Hibernate Course Added : " + course.getCourseName());
    }
}
