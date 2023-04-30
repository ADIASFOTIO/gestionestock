package com.adias.gestionestock.model.dto;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
@Data
public class OnlineSaleDto {
    private Integer id;
    private SaleDto sale;
    private BigDecimal quantity;
    private BigDecimal unitPrice;
}
