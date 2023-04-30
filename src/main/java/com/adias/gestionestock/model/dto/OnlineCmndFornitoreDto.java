package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Article;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
@Data
public class OnlineCmndFornitoreDto {
    private Integer id;
    private ArticleDto article;
    private ComandFornitoreDto comandFornitore;
    private BigDecimal quantity;
    private BigDecimal unitPrice;
}
