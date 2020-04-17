package com.sjj.bishe.dao;

import com.sjj.bishe.pojo.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsDao extends JpaRepository<Goods,Integer> {
    List<Goods> findBygoodsnameLike(String keywords);
}
