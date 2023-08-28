/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.lp2_test.infraestructura.adapter;

import org.springframework.data.repository.CrudRepository;
import upeu.edu.pe.lp2_test.infraestructura.entity.ProductEntity;
import upeu.edu.pe.lp2_test.infraestructura.entity.UserEntity;

/**
 *
 * @author diego
 */
public interface ProductCrudRepository extends CrudRepository<ProductEntity, Integer> {
    Iterable <ProductEntity> findByUserEntity(UserEntity userEntity);
}
