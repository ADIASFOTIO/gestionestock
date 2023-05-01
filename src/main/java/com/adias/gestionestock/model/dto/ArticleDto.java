package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Article;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
@Data
@Builder
public class ArticleDto {
    private Integer id;
    private String codeArticle;
    private String description;
    private BigDecimal unitPriceWithoutTav;
    private BigDecimal rateTav;
    private BigDecimal unitPriceWithTav;
    private String photo;
    private CategoryDto category;
    public static ArticleDto fromEntity(Article article){
        if (article == null){
            return null;
            //TODO throw an exception
        }

        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .description(article.getDescription())
                .unitPriceWithoutTav(article.getUnitPriceWithoutTav())
                .photo(article.getPhoto())
                .category(CategoryDto.fromEntity(article.getCategory()))
                .build();
    }
    public static Article toEntity(ArticleDto articleDto){
        if (articleDto == null){
            return null;
            //TODO throw an exception
        }
        Article article = new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDescription(articleDto.getDescription());
        article.setUnitPriceWithoutTav(articleDto.getUnitPriceWithoutTav());
        article.setUnitPriceWithTav(articleDto.getUnitPriceWithTav());
        article.setPhoto(articleDto.getPhoto());
        article.setCategory(CategoryDto.toEntity(articleDto.getCategory()));
        return article;
    }
}
