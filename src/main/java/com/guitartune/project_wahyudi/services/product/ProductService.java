package com.guitartune.project_wahyudi.services.product;


import org.springframework.web.multipart.MultipartFile;

// import com.guitartune.project_wahyudi.dto.product.PageProductsResponse;
import com.guitartune.project_wahyudi.dto.product.ProductRequest;
import com.guitartune.project_wahyudi.dto.product.ProductResponse;
import com.guitartune.project_wahyudi.models.Product;

public interface ProductService {
    void addProduct(ProductRequest productRequest, MultipartFile file) throws Exception;

    ProductResponse toProduct(Product product);

    // PageProductsResponse<ProductResponse> getAllProduct(String name, String category, String sortBy, String sortOrder, Long minPrice, Long maxPrice);

    void editProduct(String id, ProductRequest productRequest, MultipartFile file) throws Exception;

    void deleteProduct(String id) throws Exception;

    // void deleteProductAdmin(String id) throws Exception;


}
