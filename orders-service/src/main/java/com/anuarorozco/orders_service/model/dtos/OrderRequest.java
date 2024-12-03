package com.anuarorozco.orders_service.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
public class OrderRequest {

    private List<OrderItemRequest> orderItems;

}
