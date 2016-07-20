package bl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import dl.*;

public class ConsultaBBDD 
{
   public static LinkedList<Historico> getDatosHistorico()
   {
      LinkedList<Historico> listaHistorico=new LinkedList<Historico>();
      try
      {
         Class.forName("org.gjt.mm.mysql.Driver");
         Connection conexion = DriverManager.getConnection(
            "jdbc:mysql://localhost/neurGaiBBDD", "root", "19071989j");
         Statement st = conexion.createStatement();
         ResultSet rs = st.executeQuery("select * from Historico" );
         while (rs.next())
         {
            Historico datos = new Historico();
            datos.setIdHistorico(rs.getInt("idHistorico"));
            datos.setDay_Energy(rs.getFloat("day_Energy"));
            datos.setFrecuencia(rs.getFloat("frecuencia"));
            datos.setIAc(rs.getFloat("iAc"));
            datos.setIDc(rs.getFloat("iDc"));
            datos.setTemperatura_modulo(rs.getFloat("temperatura_modulo"));
            datos.setVAc(rs.getFloat("vAc"));
            datos.setVAc(rs.getFloat("vDc"));
            listaHistorico.add(datos);

         }
         rs.close();
         st.close();
         conexion.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaHistorico;
   }
   
   public static LinkedList<Inverter> getDatosInverter()
   {
      LinkedList<Inverter> listaInverter=new LinkedList<Inverter>();
      try
      {
         Class.forName("org.gjt.mm.mysql.Driver");
         Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/neurGaiBBDD", "root", "19071989j");
         Statement st = conexion.createStatement();
         ResultSet rs = st.executeQuery("SELECT * FROM Inverter" );
         while (rs.next())
         {
            Inverter datos = new Inverter();
            datos.setIdInverter(rs.getInt("idInverter"));
            datos.setDay_Energy(rs.getFloat("day_Energy"));
            datos.setPower(rs.getFloat("power"));
            datos.setStatus(rs.getInt("status"));
            datos.setTOTAL_ENERGY(rs.getFloat("TOTAL_ENERGY"));
            datos.setYear_Energy(rs.getFloat("year_Energy"));
            listaInverter.add(datos);

         }
         rs.close();
         st.close();
         conexion.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaInverter;
   }
   
   public static LinkedList<Sensor> getDatosSensor()
   {
      LinkedList<Sensor> listaSensor=new LinkedList<Sensor>();
      try
      {
         Class.forName("org.gjt.mm.mysql.Driver");
         Connection conexion = DriverManager.getConnection(
            "jdbc:mysql://localhost/neurGaiBBDD", "root", "19071989j");
         Statement st = conexion.createStatement();
         ResultSet rs = st.executeQuery("SELECT * FROM Sensor" );
         while (rs.next())
         {
            Sensor datos = new Sensor();
            datos.setIdSensor(rs.getInt("idSensor"));
            datos.setRadiacion_solar(rs.getFloat("radiacion_solar"));
            datos.setTemperatura_ambiente(rs.getFloat("temperatura_ambiente"));
            datos.setTemperatura_modulo(rs.getInt("temperatura_modulo"));
            datos.setViento(rs.getFloat("viento"));
            listaSensor.add(datos);

         }
         rs.close();
         st.close();
         conexion.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaSensor;
   }
} 