package com.example.ece651BestPrice.mapper;

import com.example.ece651BestPrice.bean.Stock;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.ModelAttribute;

@Mapper
public interface StockMapper {
    @Insert("INSERT INTO Stock(UPC, storeID, price)"+
            "VALUE(#{UPC}, #{storeID}, #{price})")
    int createStock(Stock stock);

    @Select("SELECT * FROM Stock WHERE UPC=#{UPC} AND storeID=#{storeID}")
    Stock queryStock(@Param("UPC")String UPC, @Param("storeID")int storeID);

    @Update("UPDATE Stock SET price=#{price}"+
    " WHERE UPC=#{UPC} AND storeID=#{storeID}")
    int updateStockprice(Stock stock);

    @Delete("DELETE FROM Stock WHERE UPC=#{UPC} AND storeID=#{storeID}")
    int deleteStock(@Param("UPC")String UPC, @Param("storeID")int storeID);





}
