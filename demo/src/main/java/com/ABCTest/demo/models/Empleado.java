package com.ABCTest.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tbcatempleadosprueba")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado implements Serializable {

    @Id
    @Column(name = "num_empleado")
    private Integer numEmpleado;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "codigo_postal")
    private String codigoPostal;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "curp")
    private String curp;

    @Column(name = "nss")
    private String nss;

    @Column(name = "keyx")
    private Integer keyx;

    @Column(name = "fecha_alta")
    private Date fechaAlta;

    @Column(name = "puesto")
    private Integer puesto;

    @Column(name = "fecha_baja")
    private Date fechaBaja;

    @Column(name = "estatus")
    private Short estatus;

    @Column(name = "causa_baja")
    private String causaBaja;

    // Constructor vacío


}
