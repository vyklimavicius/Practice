package com.klimavicius;

import java.sql.*;

public class DataBConfig {

    private Connection con;

    public DataBConfig() {

        try{
            // step1 load the driver class //
            Class.forName("org.postgresql.Driver");

            // step2 create  the connection object //
            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/test","postgres","Cotiweco1");

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection() {
        System.out.println("Connection success!");
        return con;
    }


}
