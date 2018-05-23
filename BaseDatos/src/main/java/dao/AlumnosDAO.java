/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Alumno;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import org.apache.commons.dbutils.DbUtils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 *
 * @author oscar
 */
public class AlumnosDAO {

    
    //Select DBUtils
    public List<Alumno> getAllAlumnosDBUtils() {
        List<Alumno> lista = null;
       
        Connection con = null;
        try {
            con = DBConnection.getInstance().getConnection();

            QueryRunner qr = new QueryRunner();
            ResultSetHandler<List<Alumno>> handler
              = new BeanListHandler<Alumno>(Alumno.class);
            lista = qr.query(con, "select * FROM ALUMNOS", handler);

        } catch (Exception ex) {
            Logger.getLogger(AlumnosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            DBConnection.getInstance().cerrarConexion(con);
        }
        return lista;
    }

    // Con datasource
    public Alumno getUserById(int id) {
        Alumno alumno = null;


        Connection con = null;
        try {
            con = DBConnection.getInstance().getDataSourceFromServer().getConnection();
            QueryRunner qr = new QueryRunner();
            ResultSetHandler<Alumno> h
              = new BeanHandler<>(Alumno.class);
            alumno = qr.query(con, "select * FROM ALUMNOS where ID = ?",
              h, id);
        } catch (Exception ex) {
            Logger.getLogger(AlumnosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBConnection.getInstance().cerrarConexion(con);
        }
        return alumno;
    }

    
  
  
     // insert DBUTILS
    public Alumno addUserDBUtils(Alumno alumno, String activacion) {
   
        Connection con = null;

        try {
            con = DBConnection.getInstance().getConnection();
            con.setAutoCommit(false);
            QueryRunner qr = new QueryRunner();

            BigInteger id = qr.insert(con,
              "INSERT INTO LOGIN (USER,PASSWORD,MAIL,ACTIVACION,"
              + "ACTIVO,FECHA_RENOVACION) VALUES(?,?,?,?,?,now())",
              new ScalarHandler<BigInteger>(),
              "", "", "", activacion, 0);

            alumno.setId(id.longValue());
            con.commit();

        } catch (Exception ex) {
            try {
                Logger.getLogger(AlumnosDAO.class.getName()).log(Level.SEVERE, null, ex);
                if (con!= null)
                    con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(AlumnosDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            DBConnection.getInstance().cerrarConexion(con);
        }
        return alumno;

    }

    public Alumno updateUserDBUtils(Alumno alumno, String activacion) {

        Connection con = null;

        try {
            con = DBConnection.getInstance().getConnection();

            QueryRunner qr = new QueryRunner();

           int filas = qr.update(con,
              "UPDATE ALUMNOS SET NOMBRE = ? WHERE ID = ?",
              alumno.getNombre(),alumno.getId());



        } catch (Exception ex) {
            Logger.getLogger(AlumnosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBConnection.getInstance().cerrarConexion(con);
        }
        return alumno;

    }

}
