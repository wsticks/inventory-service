package com.williams.inventoryservice.repository;
import com.williams.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface InventoryRepository extends JpaRepository<Inventory,Long> {

     List<Inventory> findBySkuCodeIn(List<String> skuCode);
     Inventory findInventoriesBySkuCode(String skuCode);
}
