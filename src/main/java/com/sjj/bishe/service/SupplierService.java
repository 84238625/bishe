package com.sjj.bishe.service;

import com.sjj.bishe.dao.SupplierDao;
import com.sjj.bishe.pojo.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {
    @Autowired
    SupplierDao supplierDao;


    /*查询所有的Supplier*/
    public List<Supplier> list(){
        Sort sort=new Sort(Sort.Direction.DESC,"id");  //根据id倒排序
        return supplierDao.findAll(sort);
    }

    /*添加或更新Supplier*/
    public Supplier addOrUpdate(Supplier supplier){
            supplierDao.save(supplier);
        return supplier;
    }


    public void deleteById(int id){
        supplierDao.deleteById(id);
    }


    //jpa分页查询
   public Page<Supplier> findAll (@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request=PageRequest.of(page,size);
        return supplierDao.findAll(request);
    }

   /*根据公司名模糊查询*/
    public List<Supplier> findByconameLike(String keywords){

        return supplierDao.findByconameLike("%"+keywords+"%");
    }


    /*根据id查找*/
    public Supplier findById(int id){
       return supplierDao.findById(id).get();
    }

}
