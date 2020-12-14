package ci.jvision.admin201718037.web.dto;

import ci.jvision.admin201718037.domain.products.Products;

public class ProductsListResponseDto {


    private String name;
    private String price;
    private String desc;


    public ProductsListResponseDto(Products entity)
    {

        this.name = entity.getName();
        this.price = entity.getPrice();
        this.desc = entity.getDesc();

    }
}