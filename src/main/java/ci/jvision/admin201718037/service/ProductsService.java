package ci.jvision.admin201718037.service;

import ci.jvision.admin201718037.domain.products.Products;
import ci.jvision.admin201718037.domain.products.ProductsRepository;
import ci.jvision.admin201718037.web.dto.ProductsListResponseDto;
import ci.jvision.admin201718037.web.dto.ProductsSaveRequestDto;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductsService {

    private final ProductsRepository productsRepository;

    @Transactional
    public Long save(ProductsSaveRequestDto requestDto)
    {
        return productsRepository.save(requestDto.toEntity()).getId();
    }



    @Transactional
    public void delete(Long id)
    {
        Products products = productsRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        productsRepository.delete(products);
    }




    @Transactional
    public List<ProductsListResponseDto> findAllDesc()
    {
        return productsRepository.findAllDesc().stream()
                .map(ProductsListResponseDto::new)
                .collect(Collectors.toList());
    }
}
