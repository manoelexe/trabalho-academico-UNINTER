package com.IPSEI.mapsrecicle.service;

import com.IPSEI.mapsrecicle.model.item;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    item save(item pitem);

    List<item> findAll();

    Optional<item> findById(Long id);

    item update(item pitem);

    void deleteById(Long id);

}