package com.guitartune.project_wahyudi.services.store;

import org.springframework.web.multipart.MultipartFile;

import com.guitartune.project_wahyudi.dto.store.RegisterStoreRequest;
import com.guitartune.project_wahyudi.dto.store.StoreProductResponse;
import com.guitartune.project_wahyudi.dto.store.StoreResponse;
import com.guitartune.project_wahyudi.models.StoreProduct;

public interface StoreService {
    void registerStore(RegisterStoreRequest requestStore, MultipartFile file) throws Exception;
    StoreResponse getStore() throws Exception;
    void withdrawIncome(Long jum) throws Exception;
    StoreProductResponse toStoreProductResponse(StoreProduct storeProduct);
}
