package com.github.cristianoaf81.cities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter 
@NoArgsConstructor
@Entity
@Table(name="pais")
public class Country {
    @Id
    private Long id;

    @Column(name="nome")
    private String name;

    @Column(name="nome_pt")
    private String portugueseName;

    @Column(name="sigla")
    private String code;

    private Integer bacen;
}
