package ci.jvision.admin201718037.domain.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, Long> {

    @Query("SELECT p from Products p ORDER BY p.id ASC")  // 오름차순 desc -> asc
    List<Products> findAllDesc();
}
