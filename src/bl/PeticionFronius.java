package bl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import dl.Historico;
import dl.Inverter;

public class PeticionFronius {

	public static void peticion() throws MalformedURLException, IOException {
		 
		      URL url = new URL("http://u020556.bi.ehu.es/solar_api/v1/GetInverterRealtimeData.cgi?Scope=System");
		      URLConnection con = url.openConnection();
		 
		      BufferedReader in = new BufferedReader(
		         new InputStreamReader(con.getInputStream()));
		 
		      String linea;
		    
		      while ((linea = in.readLine()) != null) {
		         System.out.println(linea);
		       
		      }  
		      
		      Gson gson = new Gson();
		      Type listtype = new TypeToken<ArrayList<Historico>>(){}
		      .getType();
		     List<Historico> datos = gson.fromJson(in, listtype);
		     
		     
		     String sURL ="http://u020556.bi.ehu.es/solar_api/v1/GetInverterRealtimeData.cgi?Scope=System"; //"http://freegeoip.net/json/"; //just a string

		     // Connect to the URL using java's native library
		     URL url2 = new URL(sURL);
		     HttpURLConnection request = (HttpURLConnection) url2.openConnection();
		     request.connect();

		     // Convert to a JSON object to print data
		     JsonParser jp = new JsonParser(); //from gson
		     JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
		     JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object. 
		     //Con esto he conseguido obtener datos de un json, pero de campos simples
		     //String zipcode = rootobj.get("ip").getAsString(); //just grab the zipcode
		     //System.out.println(zipcode);
		     Inverter countryObj = gson.fromJson(rootobj, Inverter.class); 
		     System.out.println("Temperatura modulo: "+countryObj.getTOTAL_ENERGY());  

		      
		      
		   }

}
