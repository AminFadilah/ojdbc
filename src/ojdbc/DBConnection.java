/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ojdbc;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Amin
 */
public class DBConnection {
    private Connection connection;
    public Connection getConnection(){
        try{
            OracleDataSource ods = new OracleDataSource();
            ods.setDriverType("thin");
            ods.setServerName("localhost");
            ods.setPortNumber(1521);
            ods.setUser("system");
            ods.setServiceName("XE");
            ods.setPassword("MCCMetrodata");
            this.connection = ods.getConnection();
        } catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
