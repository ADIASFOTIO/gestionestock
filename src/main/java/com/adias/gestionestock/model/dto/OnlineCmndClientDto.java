package com.adias.gestionestock.model.dto;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
@Data
public class OnlineCmndClientDto {
    private Integer id;
    private ArticleDto article;
    private ComandClientDto comandClient;
    private BigDecimal quantity;
    private BigDecimal unitPrice;
}
