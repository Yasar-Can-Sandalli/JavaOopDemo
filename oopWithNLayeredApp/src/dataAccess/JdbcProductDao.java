package dataAccess;

import entities.Product;

public class JdbcProductDao implements BaseProductDao{
    public void add(Product product){
        /*JDBC SQL komutlariyla veritabanina ekleme yapilir
        insert into Product .......*/
        System.out.println("JDBC product added");
    }
}
