package model.dao;

import model.entetities.Department;
import model.entetities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller seller);

    void update(Seller seller);

    void deleteById(Integer id);

    Seller findById(Integer id);

    List<Seller> findAll();

    List<Seller> findByDepartment(Department department);
}
