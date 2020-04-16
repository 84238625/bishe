package com.sjj.bishe.dao;

import com.sjj.bishe.pojo.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface SupplierDao extends JpaRepository<Supplier,Integer> {
            List<Supplier> findByconameLike(String keywords);


}
