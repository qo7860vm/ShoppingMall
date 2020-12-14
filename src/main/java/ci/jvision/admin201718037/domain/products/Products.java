package ci.jvision.admin201718037.domain.products;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Products {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition="TEXT", nullable = false)
    private String name ;

    private String price;

    @Column(length = 500, nullable = true)
    private String desc;

    @Builder
    public Products(String price, String name, String desc)
    {
        this.price = price;
        this.name = name;
        this.desc = desc;

    }

    public void update(String price, String name, String desc)
    {
        this.price = price;
        this.name = name;
        this.desc = desc;

    }

}
