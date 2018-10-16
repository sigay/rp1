package cn.itcast.dao;

import cn.itcast.domain.Item;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemDao {
    //dddddd
    @Select("select * from `items` ")
    List<Item> findAll();

}
