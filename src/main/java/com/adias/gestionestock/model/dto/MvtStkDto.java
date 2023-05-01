package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Article;
import com.adias.gestionestock.model.entities.Client;
import com.adias.gestionestock.model.entities.MvtStk;
import com.adias.gestionestock.model.entities.TypeMvtStk;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.time.Instant;
@Data
@Builder
public class MvtStkDto {
    private Integer id;
    private ArticleDto article;
    private Instant dateMvtStk;
    private BigDecimal quantity;
    private TypeMvtStk typeMvtStk;
    public static MvtStkDto fromEntity(MvtStk mvtStk){
        if (mvtStk == null){
            return null;
            //TODO throw an exception
        }

        return MvtStkDto.builder()
                .id(mvtStk.getId())
                .article(ArticleDto.fromEntity(mvtStk.getArticle()))
                .dateMvtStk(mvtStk.getDateMvtStk())
                .quantity(mvtStk.getQuantity())
                .typeMvtStk(mvtStk.getTypeMvtStk())
                .build();
    }
    public static MvtStk toEntity(MvtStkDto mvtStkDto){
        if (mvtStkDto == null){
            return null;
            //TODO throw an exception
        }
        MvtStk mvtStk = new MvtStk();
        mvtStk.setId(mvtStkDto.getId());
        mvtStk.setArticle(ArticleDto.toEntity(mvtStkDto.getArticle()));
        mvtStk.setDateMvtStk(mvtStkDto.getDateMvtStk());
        mvtStk.setQuantity(mvtStkDto.getQuantity());
        mvtStk.setTypeMvtStk(mvtStkDto.getTypeMvtStk());
        return mvtStk;
    }
}
