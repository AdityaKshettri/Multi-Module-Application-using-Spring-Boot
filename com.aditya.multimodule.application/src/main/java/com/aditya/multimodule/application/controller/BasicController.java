package com.aditya.multimodule.application.controller;

import com.aditya.multimodule.model.Basic;
import com.aditya.multimodule.service.BasicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/basics")
public class BasicController
{
    @Autowired
    private BasicService basicService;

    @GetMapping("")
    public List<Basic> findAll() {
        return basicService.findAll();
    }

    @GetMapping("/{id}")
    public Basic findById(@PathVariable int id) {
        Optional<Basic> basic = basicService.findById(id);
        if(basic.isEmpty()) {
            return null;
        }
        return basic.get();
    }

    @PostMapping("")
    public Basic save(@RequestBody Basic theBasic) {
        return basicService.save(theBasic);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        basicService.deleteById(id);
    }
}
