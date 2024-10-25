package business;

import core.logging.BaseLogger;
import dataAccess.BaseCourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    //Burada ArrayList in neden static tanimlandığına dikkat ediniz
    private BaseCourseDao baseCourseDao;
    private static final List<Course> courses = new ArrayList<>();
    private BaseLogger[] loggers;

    public CourseManager(BaseCourseDao baseCourseDao, BaseLogger[] loggers){
        this.baseCourseDao = baseCourseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        //Burada kurs fiyatinin negatif olamayacagini kontrol ediyoruz
        if (course.getCoursePrice() < 0){
            throw new Exception("Kurs Fiyati Negatif Olamaz !");
        }

        for (Course existingCourse : courses) {
            //Aynı kurs kontrolü
            if (existingCourse.getCourseName().equalsIgnoreCase(course.getCourseName())) {
                throw new Exception("Bu isimde bir kurs zaten mevcut!");
            }

            // Aynı kategori kontrolü
            if (existingCourse.getCategoryName().equalsIgnoreCase(course.getCategoryName())) {
                throw new Exception("Bu kategoride bir kurs zaten mevcut!");
            }
        }

        baseCourseDao.addCourse(course);
        courses.add(course); //Eğer yeni kurs eklenmeye uygunsa yeni kursu ArrayList e ekliyoruz

        //Burda Logger larin "log" fonksiyonları çalısıyor
        for (BaseLogger logger : loggers) {
            logger.log("Logged");
        }
    }
}
