package com.github.cristianoaf81.cities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cidade")
@TypeDefs(value = { @TypeDef(name = "point", typeClass = PointType.class) })
public class City {

  @Id
  private Long id;

  @Column(name = "nome")
  private String name;

  private Integer uf;

  private Integer ibge;

  @Column(name = "lat_lon")
  private String geolocation;

  
  @Type(type = "point")
  @Column(name = "lat_lon", updatable = false, insertable = false)
  private Point location;
 
}
