package com.formacionbdi.springboot.app.commons.usuarios.models.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Getter
@Setter
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, length = 30)
  private String nombre;

  public Role() {}
}
