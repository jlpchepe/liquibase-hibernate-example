package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* 
* @author jpena
* @created 3 jun. 2019 12:16:12
*/
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(nullable = false, length = 100)
    private String name;
    
    @Column(length = 50)
    private String firstLastName;
    
    @Column(length = 50)
    private String secondLastName;
}
