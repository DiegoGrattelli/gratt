/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.lp2_test.infraestructura.adapter;

import java.util.List;
import org.springframework.stereotype.Repository;
import upeu.edu.pe.lp2_test.app.repository.StockRepository;
import upeu.edu.pe.lp2_test.infraestructura.entity.ProductEntity;
import upeu.edu.pe.lp2_test.infraestructura.entity.StockEntity;

/**
 *
 * @author diego
 */
@Repository
public class StockRepositoryImpl implements StockRepository {
    
    private final StockCrudRepository stockCrudRepository ;

    public StockRepositoryImpl(StockCrudRepository stockCrudRepository) {
        this.stockCrudRepository = stockCrudRepository;
    }
    

    @Override
    public Iterable<StockEntity> getStock() {
        return stockCrudRepository.findAll();
    }

    @Override
    public List<StockEntity> getStockByProductEntity(ProductEntity productEntity) {
        return stockCrudRepository.findStockByProductEntity(productEntity);
    }

    @Override
    public StockEntity getStockById(Integer id) {
        return stockCrudRepository.findById(id).get();
    }

    @Override
    public StockEntity saveStock(StockEntity stock) {
        return stockCrudRepository.save(stock);
    }

    @Override
    public void deleteStockById(Integer id) {
        stockCrudRepository.deleteById(id);
    }
    
}
