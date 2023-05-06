package com.ABCTest.demo;

import javax.sql.DataSource;
import java.sql.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class DatabaseConnectionChecker {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void checkConnection() {
        try (Connection connection = dataSource.getConnection()) {
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos.");
            } else {
                System.out.println("No se pudo establecer la conexión a la base de datos.");
            }
        } catch (Exception e) {
            System.out.println("Error al intentar conectarse a la base de datos:");
            e.printStackTrace();
        }
    }
}