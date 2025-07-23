package app;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entetities.Department;
import model.entetities.Seller;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

    }
}
