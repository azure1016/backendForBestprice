package com.example.ece651BestPrice.mapper;

import com.example.ece651BestPrice.bean.Store;
import org.apache.ibatis.annotations.*;

@Mapper
public interface StoreMapper {
    @Insert("INSERT INTO Store(storename, address, latitude, longitude, city, province, postcode)"+
            "VALUE(#{storename}, #{address}, #{latitude}, #{longitude}, #{city}, #{province}, #{postcode})")
    int createStore(Store s);

    @Select("SELECT * FROM Store"+ " WHERE storeID = #{storeID}")
    Store queryStorebyStoreID(@Param("storeID") int storeID);

    @Update("UPDATE Store SET storename = #{storename}, address = #{address}, latitude = #{latitude}, longitude = #{longitude}"+
            ",city = #{city}, province = #{province}, postcode = #{postcode}"+
            " where storeID = #{storeID}")
    int updateStore(Store s);

    @Delete("DELETE from Store where storeID = #{storeID}")
    int deleteStore(@Param("storeID") String storeID);

    @Update("UPDATE Store SET storename = #{storename}"+" where storeID = #{storeID}")
    int updateStorename(Store s);

    @Update("UPDATE Store SET address = #{address}"+" where storeID = #{storeID}")
    int updateStoreaddress(Store s);

    @Update("UPDATE Store SET latitude = #{latitude}"+" where storeID = #{storeID}")
    int updateStorelatitude(Store s);

    @Update("UPDATE Store SET longitude = #{longitude}"+" where storeID = #{storeID}")
    int updateStorelongitude(Store s);

    @Update("UPDATE Store SET city = #{city}"+" where storeID = #{storeID}")
    int updateStorecity(Store s);

    @Update("UPDATE Store SET province  = #{province}"+" where storeID = #{storeID}")
    int updateStoreprovince(Store s);

    @Update("UPDATE Store SET postcode  = #{postcode}"+" where storeID = #{storeID}")
    int updateStorepostcode(Store s);






}
