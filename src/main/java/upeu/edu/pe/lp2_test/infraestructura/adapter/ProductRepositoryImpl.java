/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.lp2_test.infraestructura.adapter;

import upeu.edu.pe.lp2_test.app.repository.ProductRepository;
import upeu.edu.pe.lp2_test.infraestructura.entity.ProductEntity;
import upeu.edu.pe.lp2_test.infraestructura.entity.UserEntity;

/**
 *
 * @author diego
 */
public class ProductRepositoryImpl implements ProductRepository {
    private final ProductCrudRepository productCrudRepository ;

    public ProductRepositoryImpl(ProductCrudRepository productCrudRepository) {
        this.productCrudRepository = productCrudRepository;
    }

    @Override
    public Iterable<ProductEntity> getProducts() {
        return productCrudRepository.findAll();
    }

    @Override
    public Iterable<ProductEntity> getProductsByUser(UserEntity user) {
        return productCrudRepository.findByUserEntity(user);
    }

    @Override
    public ProductEntity getProductById(Integer Id) {
        return productCrudRepository.findById(Id).get();
    }

    @Override
    public ProductEntity saveProduct(ProductEntity product) {
        return productCrudRepository.save(product);
    }

    @Override
    public void deleteProductById(Integer id) {
        productCrudRepository.deleteById(id);
    }
    
    
    
}
