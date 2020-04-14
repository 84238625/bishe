package com.sjj.bishe.controller;
import com.sjj.bishe.pojo.Supplier;
import com.sjj.bishe.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
public class SupplierController {
    @Autowired
    SupplierService supplierService;


    @GetMapping("/api/suppliers")
    public List<Supplier> list() throws Exception{
        return supplierService.list();
    }

    @PostMapping("/api/suppliers")
    public Supplier addOrUpdate(@RequestBody Supplier supplier)throws Exception{
        supplierService.addOrUpdate(supplier);
        return supplier;
    }

    @PostMapping("/api/delete")
    public void deleteById(@RequestBody Supplier supplier)throws Exception{
        supplierService.deleteByid(supplier.getId());
    }
    @GetMapping("/api/findBycoameLike")
    public List<Supplier> findByNameLike(@RequestParam("keywords") String keywords)throws Exception{
                if("".equals(keywords)){
                    return null;
        }else{
            return supplierService.findByconameLike(keywords);
        }
    }




    @GetMapping("/api/findAll/{page}/{size}")
    public Page <Supplier> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        return supplierService.findAll(page,size);
    }


    @PostMapping("/api/save")
    public String save(@RequestBody Supplier supplier){
   Supplier result= supplierService.addOrUpdate(supplier);

    if( result!=null) {return "success";}
    else{return"error";}
    }
}
