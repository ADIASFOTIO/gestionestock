package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.OnlineSale;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
@Data
@Builder
public class OnlineSaleDto {
    private Integer id;
    private SaleDto sale;
    private BigDecimal quantity;
    private BigDecimal unitPrice;
    public static OnlineSaleDto fromEntity(OnlineSale onlineSale){
        if (onlineSale == null){
            return null;
            //TODO throw an exception
        }

        return OnlineSaleDto.builder()
                .id(onlineSale.getId())
                .sale(SaleDto.fromEntity(onlineSale.getSale()))
                .quantity(onlineSale.getQuantity())
                .unitPrice(onlineSale.getUnitPrice())
                .build();
    }
    public static OnlineSale toEntity(OnlineSaleDto onlineSaleDto){
        if (onlineSaleDto == null){
            return null;
            //TODO throw an exception
        }
        OnlineSale onlineSale = new OnlineSale();
        onlineSale.setId(onlineSaleDto.getId());
        onlineSale.setQuantity(onlineSaleDto.getQuantity());
        onlineSale.setUnitPrice(onlineSaleDto.getUnitPrice());
        onlineSale.setSale(SaleDto.toEntity(onlineSaleDto.getSale()));;
        return onlineSale;
    }
}
