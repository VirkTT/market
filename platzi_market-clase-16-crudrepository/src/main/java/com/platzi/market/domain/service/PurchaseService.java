package com.platzi.market.domain.service;

import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getALL() {
        return purchaseRepository.getALL();
    }

    public Optional<List<Purchase>> getByClient(String clienId){
        return purchaseRepository.getByClient(clienId);
    }

    public Purchase save(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }



}
