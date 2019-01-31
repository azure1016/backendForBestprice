package com.example.ece651BestPrice.controller;

import com.example.ece651BestPrice.bean.Store;
import com.example.ece651BestPrice.mapper.StoreMapper;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/Store")
public class StoreController {
    @Autowired
    private StoreMapper storeMapper;

    @RequestMapping(value = "/Insert", method = RequestMethod.GET)
    public Object createStore(@ModelAttribute Store store){
        Map<String, String> result = new HashMap<>();
        int createResult = this.storeMapper.createStore(store);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msg", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;

    }

    @RequestMapping(value = "/Query/{storeID}", method = RequestMethod.GET)
    public JSONArray getStore(@PathVariable("storeID") int storeID){
        JSONArray result = JSONArray.fromObject(this.storeMapper.queryStorebyStoreID(storeID));
        return result;
    }

    @RequestMapping(value = "/Update", method = RequestMethod.GET)
    public Object updateStore(@ModelAttribute Store store){
        Map<String, String> result = new HashMap<>();
        int createResult = this.storeMapper.updateStore(store);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msg", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;

    }


    @RequestMapping(value = "/Delete/{storeID}", method = RequestMethod.GET)
    public Object deleteStore(@PathVariable("storeID") String storeID){
        Map<String, String> result = new HashMap<>();
        int createResult = this.storeMapper.deleteStore(storeID);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msg", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;

    }

    @RequestMapping(value = "/Updatestorename", method = RequestMethod.GET)
    public Object updateStorename(@ModelAttribute Store store){
        Map<String, String> result = new HashMap<>();
        int createResult = this.storeMapper.updateStorename(store);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msg", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;
    }

    @RequestMapping(value = "/Updatestoreaddress", method = RequestMethod.GET)
    public Object updatestoreAddress(@ModelAttribute Store store){
        Map<String, String> result = new HashMap<>();
        int createResult = this.storeMapper.updateStoreaddress(store);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msg", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;
    }

    @RequestMapping(value = "/Updatestorelatitude", method = RequestMethod.GET)
    public Object updatestorelatitude(@ModelAttribute Store store){
        Map<String, String> result = new HashMap<>();
        int createResult = this.storeMapper.updateStorelatitude(store);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msg", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;

    }

    @RequestMapping(value = "/Updatestorelongitude", method = RequestMethod.GET)
    public Object updatestorelongitude(@ModelAttribute Store store){
        Map<String, String> result = new HashMap<>();
        int createResult = this.storeMapper.updateStorelongitude(store);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msg", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;

    }

    @RequestMapping(value = "/Updatestorecity", method = RequestMethod.GET)
    public Object updatestorecity(@ModelAttribute Store store){
        Map<String, String> result = new HashMap<>();
        int createResult = this.storeMapper.updateStorecity(store);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msg", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;

    }

    @RequestMapping(value = "/Updatestoreprovince", method = RequestMethod.GET)
    public Object updatestoreprovince(@ModelAttribute Store store){
        Map<String, String> result = new HashMap<>();
        int createResult = this.storeMapper.updateStoreprovince(store);
        if(createResult>0){
            result.put("msg", "success");
        }
        else{
            result.put("msg", "failure");
        }
        JSONArray result1 = JSONArray.fromObject(result);
        return result1;

    }

    @RequestMapping(value = "/Updatestorepostcode", method = RequestMethod.GET)
    public Object updatestorepostcode(@ModelAttribute Store store){
        Map<String, String> result = new HashMap<>();
        int createResult = this.storeMapper.updateStorepostcode(store);
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
