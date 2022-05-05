package com.lcz.controller;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.*;

@Controller
@RequestMapping("/Hello")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello_param")
    @ResponseBody
    public String hello_param ( @RequestParam Integer start){
        return start.toString();
    }

    @GetMapping("/hello_path/{start}")
    @ResponseBody
    public String hello_path(@PathVariable Integer start){
        return start.toString();
    }

    @PostMapping("/hello_post")
    @ResponseBody
    public String hello_post(@RequestParam(value = "start",required = true) Integer start){
        return start.toString();
    }

    @PostMapping("/hello_postjson")
    @ResponseBody
    public String hello_postjson(@RequestBody JSONObject jsonParam){
        System.out.println(jsonParam);
        Map<String,Object> map =new HashMap<>();
        Iterator it = jsonParam.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,Object> entry = (Map.Entry<String,Object>) it.next();
            map.put(entry.getKey(),entry.getValue());
        }
        System.out.println(map);
        System.out.println(map.get("start"));
        return jsonParam.toJSONString();
    }

    @PostMapping("/hello_postjsonarray")
    @ResponseBody
    public String hello_postjsonarray(@RequestBody JSONArray jsonParam){
        System.out.println(jsonParam);
        List<Map<String,Object>> mapList =new ArrayList<Map<String,Object>>();
        for(int i=0 ;i<jsonParam.size();i++){
            Map<String,Object> map =new HashMap<>();
            JSONObject jsObject=jsonParam.getJSONObject(i);
            System.out.println(jsObject);
            Iterator<Map.Entry<String, Object>> it = jsObject.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry<String,Object> entry = (Map.Entry<String,Object>) it.next();
                map.put(entry.getKey(),entry.getValue());
            }
            mapList.add(map);
        }
        System.out.println(mapList);
        return jsonParam.toJSONString();
    }
}
