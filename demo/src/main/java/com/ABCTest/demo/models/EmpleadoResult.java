package com.ABCTest.demo.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.*;


import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EmpleadoResult implements Serializable {

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

    @Column(name = "puesto")
    private String puesto;

    @Column(name = "estatus")
    private Short estatus;

    @Column(name = "mensaje")
    private String mensaje;

}
