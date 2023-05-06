package com.ABCTest.demo.Repository;

import com.ABCTest.demo.models.Empleado;
import com.ABCTest.demo.models.EmpleadoResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>, JpaSpecificationExecutor<Empleado> {

    @Query(value = "SELECT * FROM fnoperacionesempleados(" +
            ":iopcion, " +
            ":inumempleado, " +
            ":snombre, " +
            ":sappaterno, " +
            ":sapmaterno, " +
            ":sdireccion, " +
            ":scodigopostal, " +
            ":stelefono, " +
            ":scurp, " +
            ":snss, " +
            ":ipuesto, " +
            ":scausabaja)", nativeQuery = true)
    List<EmpleadoResult> callFnOperacionesEmpleados(
            @Param("iopcion") Integer iopcion,
            @Param("inumempleado") Integer inumempleado,
            @Param("snombre") String snombre,
            @Param("sappaterno") String sappaterno,
            @Param("sapmaterno") String sapmaterno,
            @Param("sdireccion") String sdireccion,
            @Param("scodigopostal") String scodigopostal,
            @Param("stelefono") String stelefono,
            @Param("scurp") String scurp,
            @Param("snss") String snss,
            @Param("ipuesto") Integer ipuesto,
            @Param("scausabaja") String scausabaja);
}
