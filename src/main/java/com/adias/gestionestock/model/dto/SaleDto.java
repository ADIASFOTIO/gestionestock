package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Sale;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;
@Data
@Builder

public class SaleDto {
    private Integer id;
    private String code;
    private Instant saleDate;
    private String coment;
    public static SaleDto fromEntity(Sale sale){
        if (sale == null){
            return null;
            //TODO throw an exception
        }

        return SaleDto.builder()
                .id(sale.getId())
                .code(sale.getCode())
                .saleDate(sale.getSaleDate())
                .coment(sale.getComent())
                .build();
    }
    public static Sale toEntity(SaleDto saleDto){
        if (saleDto == null){
            return null;
            //TODO throw an exception
        }
        Sale sale = new Sale();
        sale.setId(saleDto.getId());
        sale.setCode(saleDto.getCode());
        sale.setSaleDate(saleDto.getSaleDate());
        sale.setComent(saleDto.getComent());
        return sale;
    }
}
