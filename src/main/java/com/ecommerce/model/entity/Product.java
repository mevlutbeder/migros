package com.ecommerce.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategory productCategory;

   /* @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ProductVariant> productVariantList;*/

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;

    @Column(name = "long_desc")
    @Type(type = "text")
    private String longDesc;

    @Column(name = "date_created", insertable = false)
    private Date dateCreated;

    @Column(name = "last_updated", insertable = false)
    @Type(type = "timestamp")
    private Date lastUpdated;

    @Column(name = "unlimited")
    private Integer unlimited;
}
