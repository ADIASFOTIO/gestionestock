package com.adias.gestionestock.model.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import java.util.List;
@Data
public class CategoryDto {
    private Integer id;
    private String code;
    private String description;
    @JsonIgnore
    private List<ArticleDto> articles;


}
