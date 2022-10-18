package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import dataAccess.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {

    private Logger[] loggers;
    private List<Course> courseDb;

    private List<CourseDao> courseDaos;

    public CourseManager(List<CourseDao> courseDaos,Logger[] loggers, List<Course> courses) {
        this.courseDaos = courseDaos;
        this.loggers = loggers;
        this.courseDb = courses;
    }

    public void add(Course course) throws Exception {
        if (course.getCoursePrice() < 0) {
            throw new Exception("Kurs fiyatı 0 dan küçük olamaz");

        }
        for(Course cours : courseDb) {
            if(cours.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Kurs adı diğerleriyle aynı olamaz");
            }

        }
        for(CourseDao courseDao1: courseDaos){
            courseDao1.add(course);
        }


        courseDb.add(course);

        for(Logger logger : loggers) {
            logger.log(course.getCourseName());
        }

    }
}
