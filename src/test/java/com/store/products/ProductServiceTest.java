package com.store.products;

import com.store.products.model.Product;
import com.store.products.repository.ProductRepository;
import com.store.products.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class ProductServiceTest {
    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldSaveProduct() {
        Product product = new Product(null, "Test Product", BigDecimal.valueOf(100), 10);
        when(productRepository.save(product)).thenReturn(new Product(1L, "Test Product", BigDecimal.valueOf(100), 10));

        Product savedProduct = productService.save(product);
        assertNotNull(savedProduct.getId());
        assertEquals("Test Product", savedProduct.getName());
    }

    @Test
    public void shouldGetProductById() {
        Product product = new Product(1L, "Test Product", BigDecimal.valueOf(100), 10);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        Product foundProduct = productService.getById(1L);
        assertNotNull(foundProduct);
        assertEquals("Test Product", foundProduct.getName());
    }
}
