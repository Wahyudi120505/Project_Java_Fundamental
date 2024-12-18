package com.guitartune.project_wahyudi.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guitartune.project_wahyudi.models.Product;
import com.guitartune.project_wahyudi.models.Store;
import com.guitartune.project_wahyudi.models.StoreProduct;

public interface StoreProductRepository extends JpaRepository<StoreProduct,String>{
    List<StoreProduct> findAllByStore(Store store);
    List<StoreProduct> findProductByProduct(Product product);
    StoreProduct findStoreProductByProduct(Product product);
}
