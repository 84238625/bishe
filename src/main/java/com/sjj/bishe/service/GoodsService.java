package com.sjj.bishe.service;

import com.sjj.bishe.dao.GoodsDao;
import com.sjj.bishe.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    GoodsDao goodsDao;


    /*查询所有的物料信息*/
    public List<Goods> list(){
        Sort sort=new Sort(Sort.Direction.DESC,"id");  //根据id倒排序
        return goodsDao.findAll();
    }


    /*添加或更新Goods*/
    public Goods addOrUpdate(Goods goods){
        goodsDao.save(goods);
        return goods;
    }

    public void deleteById(int id){
        goodsDao.deleteById(id);
    }


    //jpa分页查询
    public Page<Goods> findAll (@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request=PageRequest.of(page,size);
        return goodsDao.findAll(request);
    }

    /*根据物料名模糊查询*/
    public List<Goods> findBygoodsnameLike(String keywords){

        return goodsDao.findBygoodsnameLike("%"+keywords+"%");
    }
    /*根据id查找*/
    public Goods findById(int id){
        return goodsDao.findById(id).get();
    }

}



