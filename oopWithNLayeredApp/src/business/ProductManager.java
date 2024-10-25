package business;

import core.logging.BaseLogger;
import dataAccess.BaseProductDao;
import entities.Product;

/*business rules -> is kurallari yazilir
    Eger urun is kurallarindan gecerse JdbcProductDao daki add cagirarak veritabanina ekletir
    Yani bu class Main ile ProductDao arasindaki baglantiyi saglar
    Katmanli mimari olarakta UI ile DataBase arasinda ara bir katmandir*/
public class ProductManager {
    private final BaseProductDao baseProductDao;
    BaseLogger[] baseLoggerArray;

    public ProductManager(BaseProductDao baseProductDao, BaseLogger[] baseLoggerArray) {
        this.baseProductDao = baseProductDao;
        this.baseLoggerArray = baseLoggerArray;

    }

    public void add(Product product) throws Exception {
        if (product.getUnitPrice() < 10) {
            throw new Exception("Product Price cannot be less than 10");
        }
        baseProductDao.add(product);

        for (BaseLogger baseLogger : baseLoggerArray) {
            baseLogger.log(product.getName());
        }
    }

}
