/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


/**
 *
 * @author Modern 15
 */
public class ConnectionDB implements Serializable {

    public static Connection getConnection() throws NamingException, SQLException {
        Context context = new InitialContext();
        Context tomCatContext = (Context) context.lookup("java:comp/env");
        DataSource ds = (DataSource) tomCatContext.lookup("SE140636");
        Connection connect = ds.getConnection();
        return connect;
    }

}
