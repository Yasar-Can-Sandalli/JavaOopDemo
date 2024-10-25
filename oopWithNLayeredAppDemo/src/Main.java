import business.CourseManager;
import core.logging.*;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCourseDao;
import entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course1 = new Course(1,"2022 Yazilim Gelistirici Yetistirme Kampi - Java","Programlama","Engin","Demirog",300);
        Course course2 = new Course(2,"2024 Yazilim Gelistirici Yetistirme Kampi - C#","Programlama2","Engin","Demirog",300);
        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new FileLogger(), new MailLogger()};
        BaseLogger[] loggers1 = new BaseLogger[] {}; //Herhangi bir loglama yapilmak istenmeyedebilir

        CourseManager HibarnateCourseManager = new CourseManager(new HibernateCourseDao(), loggers);
        CourseManager JDBCCourseManager = new CourseManager(new JdbcCourseDao(),loggers1);

        HibarnateCourseManager.add(course1);
        JDBCCourseManager.add(course2);

        /*Burada ayni isimde veya ayni kategoride kursun eklenmeye çalıştıgında programın nasıl davrandığına dikkat ediniz
        * Bir kurs iş kurallarına uyduğu takdirde veritabanına  eklenebilir, iş kurallarını analiz ediniz
        * Bir kurs eklenmeye uygun olduğunda veri tabanına nasıl eklendiğine dikkat ediniz
        * Bir kurs eklendiğinde başka yeni bir kursun aynı isimde veya aynı kategoride olamayacagini sağlayan kodun analizini yapınız
        * */

    }
}