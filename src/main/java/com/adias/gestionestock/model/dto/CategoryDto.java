package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import java.util.List;
@Data
@Builder
public class CategoryDto {
    private Integer id;
    private String code;
    private String description;
    @JsonIgnore
    private List<ArticleDto> articles;
    public static CategoryDto fromEntity(Category category){
        if (category == null){
            return null;
            //TODO throw an exception
        }
        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .description(category.getDescription())
                .build();
    }
    public static  Category toEntity(CategoryDto categoryDto){
        if (categoryDto == null){
            return null;
            //TODO throw an exception
        }
        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDescription(category.getDescription());
        return category;
    }



}
