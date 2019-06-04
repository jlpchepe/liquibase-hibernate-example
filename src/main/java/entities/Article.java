package entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* 
* @author jpena
* @created 30 may. 2019 18:53:34
*/
@Entity
@Table(name = "article")
public class Article {
    private Article() {}
    public Article(String name) {
        this();
        this.sku = name;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false, length = 50)
    private String sku;
    @Column(nullable = true, length = 500)
    private String description;
    @Column(nullable = false)
    private BigDecimal price;
    
    public int getId() {
        return id;
    }
    public String getName() {
        return sku;
    }
    public void setName(String name) {
        this.sku = name;
    }      
}