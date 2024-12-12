package com.guitartune.project_wahyudi.services.transaction;

import com.guitartune.project_wahyudi.dto.product.ProductResponse;
import com.guitartune.project_wahyudi.dto.transaction.TransactionRequest;
import com.guitartune.project_wahyudi.dto.transaction.TransactionResponse;
import com.guitartune.project_wahyudi.models.Product;

public interface TransactionService {
    TransactionResponse buy(String id, TransactionRequest transactionRequest) throws Exception;
    public ProductResponse toProduct(Product product);
    void deleteTransaction(String id) throws Exception;
}
