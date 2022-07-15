package com.weslley.dsmeta.service;

import com.weslley.dsmeta.entities.Sale;
import com.weslley.dsmeta.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;
    public List<Sale> findSales(){
        return repository.findAll();
    }
}
