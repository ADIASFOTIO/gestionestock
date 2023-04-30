package com.adias.gestionestock.model.dto;
import lombok.Builder;
import lombok.Data;
import java.util.List;
@Builder
@Data
public class CategoryDto {
    private Integer id;
    private String code;
    private String description;
    private List<ArticleDto> articles;
}
