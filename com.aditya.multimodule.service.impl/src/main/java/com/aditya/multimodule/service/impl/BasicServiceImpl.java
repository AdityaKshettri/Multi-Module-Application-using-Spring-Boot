package com.aditya.multimodule.service.impl;

import com.aditya.multimodule.model.Basic;
import com.aditya.multimodule.repository.BasicRepository;
import com.aditya.multimodule.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BasicServiceImpl implements BasicService
{
    @Autowired
    private BasicRepository basicRepository;

    @Override
    public Basic save(Basic theBasic) {
        return basicRepository.save(theBasic);
    }

    @Override
    public List<Basic> findAll() {
        return basicRepository.findAll();
    }

    @Override
    public Optional<Basic> findById(int id) {
        return basicRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        basicRepository.deleteById(id);
    }
}
