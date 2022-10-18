package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import dataAccess.InstructorDao;
import entities.Instructor;

import java.util.List;

public class InstructorManager {

    private Logger[] loggers;

    private List<InstructorDao> instructorDaos;

    public InstructorManager(List<InstructorDao> instructorDaos, Logger[] loggers) {
        this.instructorDaos = instructorDaos;
        this.loggers = loggers;

    }

    public void add(Instructor instructor) {


        for(InstructorDao categoryDao1: instructorDaos){
            categoryDao1.add(instructor);
        }
        for (Logger logger : loggers) {
            logger.log(instructor.getInstructorNumber() + " " + instructor.getInstructorName() + " "
                    + instructor.getInstructorLastName() + "\n");
        }
    }

}
