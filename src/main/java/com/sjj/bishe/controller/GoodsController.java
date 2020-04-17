package com.sjj.bishe.controller;


import com.sjj.bishe.pojo.Goods;
import com.sjj.bishe.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    /*h获取所有物料信息*/
    @GetMapping("/api/goods")
    public List<Goods> list() throws Exception{
        return goodsService.list();
    }

    /*根据id删除*/
    @DeleteMapping("/api/deleteByGoodsId/{id}")
    public void deleteById(@PathVariable("id") int id){
        goodsService.deleteById(id);
    }

    /*根据物料名模糊查询*/
    @GetMapping("/api/findByGoodsNameLike")
    public List<Goods> findByNameLike(@RequestParam("keywords") String keywords)throws Exception{
        if("".equals(keywords)){
            return null;
        }else{
            return goodsService.findBygoodsnameLike(keywords);
        }
    }

/*分页查询所有物料信息*/
    @GetMapping("/api/findAllGoods/{page}/{size}")
    public Page<Goods> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        return goodsService.findAll(page,size);
    }

    /*增加物料信息*/
    @PostMapping("/api/saveGoods")
    public String save(@RequestBody Goods goods){
        Goods result= goodsService.addOrUpdate(goods);

        if( result!=null) {return "success";}
        else{return"error";}
    }

/*修改物料信息*/
    @PutMapping("/api/updateGoods")
    public String update(@RequestBody Goods goods){
        Goods result= goodsService.addOrUpdate(goods);

        if( result!=null) {return "success";}
        else{return"error";}
    }
/*根据ID查物料信息*/
    @GetMapping("/api/findGoodsById/{id}")
    public Goods findById(@PathVariable("id") int id)throws Exception{
        return goodsService.findById(id);
    }

}
