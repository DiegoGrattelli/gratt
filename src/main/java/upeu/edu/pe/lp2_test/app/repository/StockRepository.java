/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.lp2_test.app.repository;

import java.util.List;
import upeu.edu.pe.lp2_test.infraestructura.entity.ProductEntity;
import upeu.edu.pe.lp2_test.infraestructura.entity.StockEntity;

/**
 *
 * @author diego
 */
public interface StockRepository {
    
    Iterable <StockEntity> getStock ();
    List<StockEntity> getStockByProductEntity (ProductEntity productEntity);
    StockEntity getStockById (Integer id);
    StockEntity saveStock(StockEntity stockEntity);
    void deleteStockById (Integer id);
    
}
