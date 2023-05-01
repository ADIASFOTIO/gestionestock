package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.OnlineCmndFornitore;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
@Data
@Builder
public class OnlineCmndFornitoreDto {
    private Integer id;
    private ArticleDto article;
    private ComandFornitoreDto comandFornitore;
    private BigDecimal quantity;
    private BigDecimal unitPrice;
    public static OnlineCmndFornitoreDto fromEntity(OnlineCmndFornitore onlineCmndFornitore){
        if (onlineCmndFornitore == null){
            return null;
            //TODO throw an exception
        }

        return OnlineCmndFornitoreDto.builder()
                .id(onlineCmndFornitore.getId())
                .article(ArticleDto.fromEntity(onlineCmndFornitore.getArticle()))
                .comandFornitore(ComandFornitoreDto.fromEntity(onlineCmndFornitore.getComandFornitore()))
                .quantity(onlineCmndFornitore.getQuantity())
                .unitPrice(onlineCmndFornitore.getUnitPrice())
                .build();
    }
    public static OnlineCmndFornitore toEntity(OnlineCmndFornitoreDto onlineCmndFornitoreDto){
        if (onlineCmndFornitoreDto == null){
            return null;
            //TODO throw an exception
        }
        OnlineCmndFornitore onlineCmndFornitore = new OnlineCmndFornitore();
        onlineCmndFornitore.setId(onlineCmndFornitoreDto.getId());
        onlineCmndFornitore.setArticle(ArticleDto.toEntity(onlineCmndFornitoreDto.getArticle()));
        onlineCmndFornitore.setComandFornitore(ComandFornitoreDto.toEntity(onlineCmndFornitoreDto.getComandFornitore()));
        onlineCmndFornitore.setQuantity(onlineCmndFornitoreDto.getQuantity());
        onlineCmndFornitore.setUnitPrice(onlineCmndFornitoreDto.getUnitPrice());
        return onlineCmndFornitore;
    }
}
