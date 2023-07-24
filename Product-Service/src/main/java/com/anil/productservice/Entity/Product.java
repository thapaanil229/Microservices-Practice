package com.anil.productservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document  // for mongodb document
@Data   //getter/setter/hashcode/equals/all args constructor
@NoArgsConstructor //
@AllArgsConstructor
@Builder    //helps to build the complex api
public class Product {


    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
