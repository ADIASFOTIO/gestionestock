package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Client;
import com.adias.gestionestock.model.entities.OnlineCmndClient;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
@Data
@Builder
public class OnlineCmndClientDto {
    private Integer id;
    private ArticleDto article;
    private ComandClientDto comandClient;
    private BigDecimal quantity;
    private BigDecimal unitPrice;
    public static OnlineCmndClientDto fromEntity(OnlineCmndClient onlineCmndClient){
        if (onlineCmndClient == null){
            return null;
            //TODO throw an exception
        }

        return OnlineCmndClientDto.builder()
                .id(onlineCmndClient.getId())
                .article(ArticleDto.fromEntity(onlineCmndClient.getArticle()))
                .comandClient(ComandClientDto.fromEntity(onlineCmndClient.getComandClient()))
                .quantity(onlineCmndClient.getQuantity())
                .unitPrice(onlineCmndClient.getUnitPrice())
                .build();
    }
    public static OnlineCmndClient toEntity(OnlineCmndClientDto onlineCmndClientDto){
        if (onlineCmndClientDto == null){
            return null;
            //TODO throw an exception
        }
        OnlineCmndClient onlineCmndClient = new OnlineCmndClient();
        onlineCmndClient.setId(onlineCmndClientDto.getId());
        onlineCmndClient.setArticle(ArticleDto.toEntity(onlineCmndClientDto.getArticle()));
        onlineCmndClient.setComandClient(ComandClientDto.toEntity(onlineCmndClientDto.getComandClient()));
        onlineCmndClient.setQuantity(onlineCmndClientDto.getQuantity());
        onlineCmndClient.setUnitPrice(onlineCmndClientDto.getUnitPrice());
        return onlineCmndClient;
    }
}
