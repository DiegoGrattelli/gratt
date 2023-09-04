/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.lp2_test.app.service;

import java.util.List;
import upeu.edu.pe.lp2_test.app.repository.StockRepository;
import upeu.edu.pe.lp2_test.infraestructura.entity.ProductEntity;
import upeu.edu.pe.lp2_test.infraestructura.entity.StockEntity;

/**
 *
 * @author diego
 */
public class StockService {
    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }
    public Iterable <StockEntity> getStock (){
        return stockRepository.getStock();
        
    }
    public List<StockEntity> getStockByProductEntity (ProductEntity productEntity){
        return stockRepository.getStockByProductEntity(productEntity);
        
    }
    public StockEntity getStockById (Integer id){
        return stockRepository.getStockById(id);
        
    }
    public StockEntity saveStock(StockEntity stockEntity){
        return stockRepository.saveStock(stockEntity);
        
    }
    public void deleteStockById (Integer id){
        stockRepository.deleteStockById(id);
        
    }
    
}
