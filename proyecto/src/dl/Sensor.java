package dl;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Sensors database table.
 * 
 */
@Entity
@Table(name="Sensors")
@NamedQuery(name="Sensor.findAll", query="SELECT s FROM Sensor s")
public class Sensor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idSensors;

	@Column(name="Opcion_idOpcion")
	private int opcion_idOpcion;

	@Column(name="Radiacion_solar")
	private String radiacion_solar;

	@Column(name="Temperatura_ambiente")
	private String temperatura_ambiente;

	@Column(name="Temperatura_modulo")
	private String temperatura_modulo;

	@Column(name="Viento")
	private String viento;

	public Sensor() {
	}

	public int getIdSensors() {
		return this.idSensors;
	}

	public void setIdSensors(int idSensors) {
		this.idSensors = idSensors;
	}

	public int getOpcion_idOpcion() {
		return this.opcion_idOpcion;
	}

	public void setOpcion_idOpcion(int opcion_idOpcion) {
		this.opcion_idOpcion = opcion_idOpcion;
	}

	public String getRadiacion_solar() {
		return this.radiacion_solar;
	}

	public void setRadiacion_solar(String radiacion_solar) {
		this.radiacion_solar = radiacion_solar;
	}

	public String getTemperatura_ambiente() {
		return this.temperatura_ambiente;
	}

	public void setTemperatura_ambiente(String temperatura_ambiente) {
		this.temperatura_ambiente = temperatura_ambiente;
	}

	public String getTemperatura_modulo() {
		return this.temperatura_modulo;
	}

	public void setTemperatura_modulo(String temperatura_modulo) {
		this.temperatura_modulo = temperatura_modulo;
	}

	public String getViento() {
		return this.viento;
	}

	public void setViento(String viento) {
		this.viento = viento;
	}

}