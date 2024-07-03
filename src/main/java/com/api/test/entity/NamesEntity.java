package com.api.test.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name="names")
@Data
public class NamesEntity implements Serializable {

    @Id
    private Long id;

    @Column
    private String nombre;
}
