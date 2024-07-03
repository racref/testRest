package com.api.test.services;

import com.api.test.entity.NamesEntity;
import com.api.test.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableTestServiceImpl implements ITableTestService{

    @Autowired
    TableRepository tableRepository;

    @Override
    public List<NamesEntity> getAll() {
        return tableRepository.findAll();
    }
}
