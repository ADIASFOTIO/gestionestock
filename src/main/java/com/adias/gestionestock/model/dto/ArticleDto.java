package com.adias.gestionestock.model.dto;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
@Data
public class ArticleDto {
    private Integer id;
    private String codeArticle;
    private String description;
    private BigDecimal unitPriceWithoutTav;
    private BigDecimal rateTav;
    private BigDecimal unitPriceWithTav;
    private String photo;
    private CategoryDto category;
}
