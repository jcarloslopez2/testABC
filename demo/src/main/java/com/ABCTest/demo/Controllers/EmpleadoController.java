package com.ABCTest.demo.Controllers;

import com.ABCTest.demo.Services.EmpleadoService;
import com.ABCTest.demo.models.EmpleadoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping("/ejecutar")
    public List<EmpleadoResult> ejecutarFnOperacionesEmpleados(
            @RequestParam("opcion") Integer opcion,
            @RequestParam("numEmpleado") Integer numEmpleado,
            @RequestParam("nombre") String nombre,
            @RequestParam("apPaterno") String apPaterno,
            @RequestParam("apMaterno") String apMaterno,
            @RequestParam("direccion") String direccion,
            @RequestParam("codigoPostal") String codigoPostal,
            @RequestParam("telefono") String telefono,
            @RequestParam("curp") String curp,
            @RequestParam("nss") String nss,
            @RequestParam("puesto") Integer puesto,
            @RequestParam("causaBaja") String causaBaja) {

        return empleadoService.ejecutarFnOperacionesEmpleados(opcion, numEmpleado, nombre, apPaterno, apMaterno, direccion, codigoPostal, telefono, curp, nss, puesto, causaBaja);
    }
}
