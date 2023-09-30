/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.DAOequipo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author dchri
 */
public class CrudEquipo {
    Conexion conexion = new Conexion();
    public String Create(Object obj) throws SQLException{
       DAOequipo equipo = (DAOequipo) obj;
       Connection connection;
       PreparedStatement pst;
       String query = "INSERT INTO TBL_EQUIPOS VALUES (?)";
       String respuesta;
      
      try{
          Class.forName(conexion.getDriver());
          connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getPassword());
          
          pst = (PreparedStatement) connection.prepareStatement(query);
          pst.setString(1 , equipo.getVCH_NOMBRE_EQUIPO());
          respuesta = Integer.toString(pst.executeUpdate());
        }
      catch(ClassNotFoundException | SQLException ex){
          respuesta = ex.getMessage();
        }
      return respuesta;
    }

   public List<DAOequipo> Read_Search(String parametro) {
    Connection connection;
    PreparedStatement pst;
    String query = "SELECT * FROM TBL_EQUIPOS WHERE VCH_NOMBRE_EQUIPO = ?";
    ResultSet rs;

    List<DAOequipo> ListaEquipo = new ArrayList<>();
    try {
        Class.forName(conexion.getDriver());
        connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getPassword());
        pst = connection.prepareStatement(query);
        pst.setString(1, parametro); 
        rs = pst.executeQuery();
        while (rs.next()) {
            DAOequipo Equipos = new DAOequipo();
            Equipos.setID_EQUIPO(rs.getInt("ID_EQUIPO"));
            Equipos.setVCH_NOMBRE_EQUIPO(rs.getString("VCH_NOMBRE_EQUIPO"));
            ListaEquipo.add(Equipos);
        }
        rs.close();
    } catch (SQLException | ClassNotFoundException ex) {
        ex.getMessage();
    }
    return ListaEquipo;
    }
}
