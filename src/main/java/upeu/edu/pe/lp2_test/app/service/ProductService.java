/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.lp2_test.app.service;

import upeu.edu.pe.lp2_test.app.repository.ProductRepository;
import upeu.edu.pe.lp2_test.infraestructura.entity.ProductEntity;
import upeu.edu.pe.lp2_test.infraestructura.entity.UserEntity;

/**
 *
 * @author diego
 */
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    
    
    public Iterable<ProductEntity>getProducts(){
           return productRepository.getProducts();
    }
             
    
    public Iterable<ProductEntity>getProductsByUser(UserEntity user){
        return productRepository.getProductsByUser(user);
    }
    public ProductEntity getProductById(Integer Id){
        return productRepository.getProductById(Id);
    }
    public ProductEntity saveProduct(ProductEntity product){
        return productRepository.saveProduct(product);
    }
    public void deleteProductById(Integer id){
     productRepository.deleteProductById(id);
    }
    
}
