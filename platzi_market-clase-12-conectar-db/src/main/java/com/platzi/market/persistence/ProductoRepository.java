package com.platzi.market.persistence;



import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository ProductoCrudRepository;

    public List<Producto> getALL() {
        return ProductoCrudRepository.findALL();
    }


}
