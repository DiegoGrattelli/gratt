/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.lp2_test.infraestructura.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import upeu.edu.pe.lp2_test.app.repository.ProductRepository;
import upeu.edu.pe.lp2_test.app.service.ProductService;

/**
 *
 * @author diego
 */
@Configuration
public class BeanConfiguration {
    @Bean
    public ProductService productService(ProductRepository productRepository){
       return new ProductService(productRepository);
    }
    
    
}
