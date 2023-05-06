package com.ABCTest.demo.Services;

import com.ABCTest.demo.Repository.EmpleadoRepository;
import com.ABCTest.demo.models.EmpleadoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<EmpleadoResult> ejecutarFnOperacionesEmpleados(Integer opcion, Integer numEmpleado, String nombre, String apPaterno, String apMaterno,
                                                               String direccion, String codigoPostal, String telefono, String curp, String nss,
                                                               Integer puesto, String causaBaja) {
        return empleadoRepository.callFnOperacionesEmpleados(opcion, numEmpleado, nombre, apPaterno, apMaterno, direccion, codigoPostal, telefono, curp, nss, puesto, causaBaja);
    }
}

