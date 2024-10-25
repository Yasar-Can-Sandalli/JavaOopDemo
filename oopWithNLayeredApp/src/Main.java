import business.ProductManager;
import core.logging.BaseLogger;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.MailLogger;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import entities.Product;


public class Main { //UI
    public static void main(String[] args) throws Exception {
        BaseLogger[] loggers2 = {new FileLogger(), new MailLogger(), new DatabaseLogger()};

        Product product = new Product(1,"Iphone 15 Pro Max",100000);
        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers2);
        productManager.add(product);
    }
}