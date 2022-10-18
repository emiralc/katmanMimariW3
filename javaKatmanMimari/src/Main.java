import business.CategoryManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.CategoryDao;
import dataAccess.hibernate.HibernateCategoryDao;
import dataAccess.jdbc.JdbcCategoryDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
        List<Category> categoryDb = new ArrayList<>();
        List<CategoryDao> categoryDaos=new ArrayList<>();
        categoryDaos.add(0,new HibernateCategoryDao());
        categoryDaos.add(1,new JdbcCategoryDao());
        Category category = new Category(1, "Programming");
        CategoryManager categoryManager = new CategoryManager(categoryDaos, loggers,categoryDb);
        categoryManager.add(category);




    }
}