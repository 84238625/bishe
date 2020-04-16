package com.sjj.bishe;

import com.sjj.bishe.controller.SupplierController;
import com.sjj.bishe.pojo.Supplier;
import com.sjj.bishe.service.SupplierService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BisheApplicationTests {
@Autowired
    SupplierService supplierService;
    @Test
    void contextLoads() {
    }

    @Test
    void save(){
        Supplier supplier=new Supplier();
        supplier.setConame("aaaa");
        supplier.setCophone("123455");
        supplier.setCoaddress("dddsad");
        supplier.setCocredibility("acccc");
        Supplier supplier1=supplierService.addOrUpdate(supplier);
        System.out.println(supplier1);
    }



    @Test
    void findById(){
        Supplier supplier = supplierService.findById(1);
        System.out.println(supplier);
    }
}
