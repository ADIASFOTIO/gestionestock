package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.TypeMvtStk;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.time.Instant;
@Builder
@Data
public class MvtStkDto {
    private Integer id;
    private ArticleDto article;
    private Instant dateMvtStk;
    private BigDecimal quantity;
    private TypeMvtStk typeMvtStk;
}
