/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.lp2_test.app.repository;

import upeu.edu.pe.lp2_test.infraestructura.entity.ProductEntity;
import upeu.edu.pe.lp2_test.infraestructura.entity.UserEntity;

/**
 *
 * @author diego
 */
public interface ProductRepository {
    
    //
    Iterable<ProductEntity>getProducts();
    Iterable<ProductEntity>getProductsByUser(UserEntity user);
    ProductEntity getProductById(Integer Id);
    ProductEntity saveProduct(ProductEntity product);
    void deleteProductById(Integer id);
    
}
