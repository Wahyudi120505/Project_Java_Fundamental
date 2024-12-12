package com.guitartune.project_wahyudi.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guitartune.project_wahyudi.models.Store;
import com.guitartune.project_wahyudi.models.StoreProduct;
import com.guitartune.project_wahyudi.models.User;

public interface StoreRepository extends JpaRepository<Store,String>{
    Store findStoreByStoreName(String storeName);
    Store findStoreByUser(User user);
    Store findStoreById(String id);

    Store findStoreByStoreProducts(StoreProduct storeProduct);
}
