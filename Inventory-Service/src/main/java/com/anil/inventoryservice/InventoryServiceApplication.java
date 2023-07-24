package com.anil.inventoryservice;

import com.anil.inventoryservice.Entity.Inventory;
import com.anil.inventoryservice.Repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(InventoryRepository  inventoryRepository){
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("Iphone 11");
            inventory.setQuantity(12);

            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("Iphone");
            inventory1.setQuantity(29);

            Inventory inventory2 = new Inventory();
            inventory2.setSkuCode("Iphone Y");
            inventory2.setQuantity(0);

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory1);
            inventoryRepository.save(inventory2);
        };
    }
}
