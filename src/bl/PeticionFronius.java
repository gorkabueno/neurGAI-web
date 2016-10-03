package bl;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;



public class PeticionFronius{
	


	private int idInverter;

	private static float day_Energy;

	private static float power;

	private int status;

	private static float TOTAL_ENERGY;

	private static float year_Energy;

	public static void peticionInverter() throws MalformedURLException, IOException {
		
		     
		      URL url3 = new URL("http://u020556.bi.ehu.es/solar_api/v1/GetInverterRealtimeData.cgi?Scope=System");

		      try (InputStream is = url3.openStream();
		           JsonReader rdr = Json.createReader(is)) {

		          JsonObject obj = rdr.readObject();

		          JsonObject body = obj.getJsonObject("Body");
		          JsonObject data = body.getJsonObject("Data");
		          JsonObject energy = data.getJsonObject("TOTAL_ENERGY");
		          JsonObject valuestotal = energy.getJsonObject("Values");
		          TOTAL_ENERGY = valuestotal.getInt("1");
		          
		          JsonObject pac =data.getJsonObject("PAC");
		          JsonObject valuespac =pac.getJsonObject("Values");
		          power = valuespac.getInt("1");
		          
		          JsonObject day =data.getJsonObject("DAY_ENERGY");
		          JsonObject valuesday =day.getJsonObject("Values");
		          day_Energy = valuesday.getInt("1");
		          
		          JsonObject year =data.getJsonObject("YEAR_ENERGY");
		          JsonObject valuesyear =year.getJsonObject("Values");
		          year_Energy = valuesyear.getInt("1");
		          
		          System.out.println(power);
		          System.out.println(day_Energy);
		          System.out.println(year_Energy);
		          System.out.println(TOTAL_ENERGY);
		          
		          
		      }
		      
		      try
		      {
				
				
			      Class.forName("org.gjt.mm.mysql.Driver");
			      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/neurGaiBBDD", "root", "19071989j");
			      String query = "update Inverter set total_Energy = ?, power = ?, day_energy = ?, year_Energy = ? where idInverter = ?";
			      PreparedStatement preparedStmt = conn.prepareStatement(query);
			      preparedStmt.setFloat(1, TOTAL_ENERGY);
			      preparedStmt.setFloat(2, power);
			      preparedStmt.setFloat(3, day_Energy);
			      preparedStmt.setFloat(4, year_Energy);
			      preparedStmt.setInt(5, 1);
		        
			      preparedStmt.executeUpdate();
			      
			      conn.close();
		         
		      }catch (Exception e)
		      {
		          e.printStackTrace();
		       }
		      
		     
		   }
		    

	public int getIdInverter() {
		return idInverter;
	}

	public void setIdInverter(int idInverter) {
		this.idInverter = idInverter;
	}

	public float getDay_Energy() {
		return day_Energy;
	}

	public void setDay_Energy(float day_Energy) {
		PeticionFronius.day_Energy = day_Energy;
	}

	public float getPower() {
		return power;
	}

	public void setPower(float power) {
		PeticionFronius.power = power;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public float getTOTAL_ENERGY() {
		return TOTAL_ENERGY;
	}

	public void setTOTAL_ENERGY(float tOTAL_ENERGY) {
		TOTAL_ENERGY = tOTAL_ENERGY;
	}

	public float getYear_Energy() {
		return year_Energy;
	}

	public void setYear_Energy(float year_Energy) {
		PeticionFronius.year_Energy = year_Energy;
	}

}
