package ci.jvision.admin201718037.web.dto;

import ci.jvision.admin201718037.domain.products.Products;
import lombok.Builder;

public class ProductsSaveRequestDto {


    private String name;
    private String price;
    private String desc;

    @Builder
    public ProductsSaveRequestDto(String name, String price, String desc)
    {

        this.name = name;
        this.price = price;
        this.desc = desc;

    }

    public Products toEntity()
    {
        return Products.builder()

                .name(name)
                .price(price)
                .desc(desc)
                .build();
    }
}
