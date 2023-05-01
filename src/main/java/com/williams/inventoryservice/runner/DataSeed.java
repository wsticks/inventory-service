package com.williams.inventoryservice.runner;

import com.williams.inventoryservice.model.Inventory;
import com.williams.inventoryservice.repository.InventoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
@Component
@AllArgsConstructor
public class DataSeed implements ApplicationListener<ContextRefreshedEvent> {

    private final InventoryRepository inventoryRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        loadInventoryData();

    }

    public void loadInventoryData(){
        List<Inventory> inventories = new ArrayList<Inventory>()
        {
            {
                add(new Inventory(1l,"iphone_13",200));
                add(new Inventory(2l,"iphone_14",0));
            }
        };

        inventories.forEach(this::saveIventory);

    }

    private void saveIventory(Inventory inventory) {
       Inventory savedInventory = inventoryRepository.findInventoriesBySkuCode(inventory.getSkuCode());
       if (savedInventory != null)
        inventoryRepository.save(inventory);
    }
}
