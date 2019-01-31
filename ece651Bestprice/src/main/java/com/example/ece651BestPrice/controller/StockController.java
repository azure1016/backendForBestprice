package com.example.ece651BestPrice.controller;

import com.example.ece651BestPrice.bean.Stock;
import com.example.ece651BestPrice.mapper.StockMapper;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/Stock")

public class StockController {
    @Autowired
    private StockMapper stockMapper;
    @RequestMapping(value = "/Insert", method = RequestMethod.GET)
    public Object createStock(@ModelAttribute Stock stock){
        Map<String, String> result = new HashMap<>();
        int createResult = this.stockMapper.createStock(stock);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msg", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;

    }

    @RequestMapping(value = "/Query/{UPC}/{storeID}", method = RequestMethod.GET)
    public JSONArray getStock(@PathVariable("UPC") String UPC, @PathVariable("storeID") int storeID){
        JSONArray result = JSONArray.fromObject(stockMapper.queryStock(UPC, storeID));
        return result;
    }

    @RequestMapping(value = "/Update", method = RequestMethod.GET)
    public Object updateStock(@ModelAttribute Stock stock){
        Map<String, String> result = new HashMap<>();
        int createResult = this.stockMapper.updateStockprice(stock);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msg", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;

    }

    @RequestMapping(value = "/Delete/{UPC}/{storeID}", method = RequestMethod.GET)
    public Object deleteStock(@PathVariable("UPC") String UPC, @PathVariable("storeID") int storeID){
        Map<String, String> result = new HashMap<>();
        int createResult = this.stockMapper.deleteStock(UPC, storeID);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msg", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;
    }


}
