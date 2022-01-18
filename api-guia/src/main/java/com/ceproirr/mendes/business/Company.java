package com.ceproirr.mendes.business;

import javax.persistence.*;

@Entity(name = "Company")
@Table(name = "empresa")
public class Company {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "telefone")
    private String phone;

    @Column(name = "pagina")
    private String Link;

    @Column(name = "categoria")
    private String Category;

    @Column(name = "situacao")
    private Integer Status;

    @Column(name = "endereco")
    private String Address;

    public Company() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getLink() {
        return Link;
    }

    public String getCategory() {
        return Category;
    }

    public Integer getStatus() {
        return Status;
    }

    public String getAddress() { return Address; }
}
