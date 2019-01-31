package com.example.ece651BestPrice.mapper;

import com.example.ece651BestPrice.bean.Product;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ProductMapper {
    @Insert("INSERT INTO Product(UPC, name, category, picture)"+
            "VALUE(#{UPC}, #{name}, #{category}, #{picture})")
    int createProduct(Product p);

    @Select("SELECT * FROM Product WHERE UPC = #{UPC}")
    Product queryProductByUpc(@Param("UPC") String UPC);

    @Update("UPDATE Product SET UPC = #{UPC}, name = #{name}, category = #{category}, picture = #{picture}"+
    " WHERE UPC = #{UPC}")
    int updateProduct(Product p);

    @Delete("DELETE FROM Product WHERE UPC = #{UPC}")
    int deleteProduct(@Param("UPC") String UPC);

    @Update("UPDATE Product SET name = #{name}"+ " WHERE UPC = #{UPC}")
    int updateProductname(Product p);

    @Update("UPDATE Product SET category = #{category}"+ " WHERE UPC = #{UPC}")
    int updateProductcategory(Product p);

    @Update("UPDATE Product SET picture = #{picture}"+ " WHERE UPC = #{UPC}")
    int updateProductpicture(Product p);








}
