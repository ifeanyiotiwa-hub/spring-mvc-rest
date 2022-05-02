package io.codewithwinnie.springmvcrest.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created on 5/2/2022
 * @author Ifeanyichukwu Otiwa
 */

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    private String firstName;
    private String lastName;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
}
