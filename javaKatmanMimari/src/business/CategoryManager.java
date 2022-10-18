package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;


import java.util.List;

public class CategoryManager {

    private Logger[] loggers;
    private List<Category> categoryDb;

    private List<CategoryDao> categoryDaos;



    public CategoryManager(List<CategoryDao> categoryDaos, Logger[] loggers, List<Category> categories) {
        super();
        this.categoryDaos = categoryDaos;
        this.loggers = loggers;
        this.categoryDb = categories;
    }


    public void add(Category category) throws Exception {

        for (Category category1 : categoryDb) {

            if (category1.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception("Kategori adı diğerleriyle aynı olamaz ");

            }
        }

        categoryDb.add(category);

        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }

        for(CategoryDao categoryDao1: categoryDaos){
            categoryDao1.add(category);
        }



    }
}
