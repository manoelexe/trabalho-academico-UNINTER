

package com.IPSEI.mapsrecicle.service;
import com.IPSEI.mapsrecicle.model.item;
import com.IPSEI.mapsrecicle.repository.itemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class itemServiceImpl implements ItemService{

    @Autowired
    private itemRepository itemRepository;

    @Override
    public item save(item pitem) {
        return itemRepository.save(pitem);
    }

    @Override
    public List<item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<item> findById(Long id) {
        return itemRepository.findById(id);
    }

    @Override
    public item update(item pitem) {
        return itemRepository.save(pitem);
    }

    @Override
    public void deleteById(Long id) {
        itemRepository.deleteById(id);
    }

}