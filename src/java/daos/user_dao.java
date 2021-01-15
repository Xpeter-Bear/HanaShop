/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import dtos.user_dto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import util.ConnectionDB;

/**
 *
 * @author Modern 15
 */
public class user_dao {

    private PreparedStatement psm;
    private Connection connect;
    private ResultSet rs;

    public ResultSet checkLogin(String user, String password) throws NamingException, SQLException {

        try {
            connect = ConnectionDB.getConnection();
            psm = connect.prepareStatement("Select userID, password, name, status, roleID from tblusers where userID = ? and password = ?");
            psm.setString(1, user);
            psm.setString(2, password);
            rs = psm.executeQuery();
            if (rs.next()) {
                return  rs;
            }
        } finally {
            psm.close();
            connect.close();
        }
        return null;
    }
}
