package com.guitartune.project_wahyudi.dto.transaction;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {

    private Integer purchaseQuantity;

    private Long totalPayment;


}
