package dataAccess;

import entities.Product;

public class HibernateProductDao implements BaseProductDao{
    public void add(Product product) {
        System.out.println("Hibernate product added");
    }
}
