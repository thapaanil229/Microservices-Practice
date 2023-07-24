package com.anil.productservice.Service;

import com.anil.productservice.Repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class ProductServiceTest {

    @Mock
    ProductRepository repository;

    @InjectMocks
    ProductService productService;

    @Test
    void testCreateProduct(){

    }

}