package ci.jvision.admin201718037.web;

import ci.jvision.admin201718037.service.ProductsService;
import ci.jvision.admin201718037.web.dto.ProductsSaveRequestDto;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ProductsApiController {

    private final ProductsService productsService;

    @PostMapping("/api/v1/products")
    public Long save(@RequestBody ProductsSaveRequestDto requestDto)
    {
        return productsService.save(requestDto);
    }


    @DeleteMapping("/api/v1/products/{id}")
    public Long delete(@PathVariable Long id)
    {
        productsService.delete(id);
        return id;
    }


}
