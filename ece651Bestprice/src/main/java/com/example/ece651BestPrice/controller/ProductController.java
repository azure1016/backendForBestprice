package com.example.ece651BestPrice.controller;

import com.example.ece651BestPrice.bean.Product;
import com.example.ece651BestPrice.mapper.ProductMapper;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/Product")

public class ProductController {
    @Autowired
    private ProductMapper productMapper;

    @RequestMapping(value = "/Insert", method = RequestMethod.GET)
    public Object createProduct(@ModelAttribute Product product){
        Map<String, String> result = new HashMap<>();
        int createResult = this.productMapper.createProduct(product);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msp", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;

    }

    @RequestMapping(value = "/Query/{UPC}", method = RequestMethod.GET)
    public JSONArray getProduct(@PathVariable("UPC")String UPC){
        JSONArray result = JSONArray.fromObject(this.productMapper.queryProductByUpc(UPC));
//        return this.productMapper.queryProductByUpc(UPC);
        return result;
    }

    @RequestMapping(value = "/Update", method = RequestMethod.GET)
    public Object updateProduct(@ModelAttribute Product product){
        Map<String, String> result = new HashMap<>();
        int createResult = this.productMapper.updateProduct(product);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msp", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;
    }


    @RequestMapping(value = "/Delete/{UPC}", method = RequestMethod.GET)
    public Object deleteProduct(@PathVariable("UPC") String UPC){
        Map<String, String> result = new HashMap<>();
        int createResult = this.productMapper.deleteProduct(UPC);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msp", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;

    }

    @RequestMapping(value = "/Updatename", method = RequestMethod.GET)
    public Object updateProductname(@ModelAttribute Product product){
        Map<String, String> result = new HashMap<>();
        int createResult = this.productMapper.updateProductname(product);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msp", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;

    }

    @RequestMapping(value = "/Updatecategory", method = RequestMethod.GET)
    public Object updateProductcategory(@ModelAttribute Product product){
        Map<String, String> result = new HashMap<>();
        int createResult = this.productMapper.updateProductcategory(product);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msp", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;

    }

    @RequestMapping(value = "/Updatepicture", method = RequestMethod.GET)
    public Object updateProductpicture(@ModelAttribute Product product){
        Map<String, String> result = new HashMap<>();
        int createResult = this.productMapper.updateProductpicture(product);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msp", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;
    }

}
