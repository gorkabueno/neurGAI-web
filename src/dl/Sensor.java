package dl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the Sensors database table.
 * 
 */
@XmlRootElement
public class Sensor {

	private int idSensor;

	private float radiacion_solar;

	private float temperatura_ambiente;

	private float temperatura_modulo;

	private float viento;
	
	private Sensor sensor;

	public Sensor() {
	}
	
	


	@XmlElement
	public float getRadiacion_solar() {
		return this.radiacion_solar;
	}

	public void setRadiacion_solar(float radiacion_solar) {
		this.radiacion_solar = radiacion_solar;
	}

	@XmlElement
	public float getTemperatura_ambiente() {
		return this.temperatura_ambiente;
	}

	public void setTemperatura_ambiente(float temperatura_ambiente) {
		this.temperatura_ambiente = temperatura_ambiente;
	}

	@XmlElement
	public float getTemperatura_modulo() {
		return this.temperatura_modulo;
	}

	public void setTemperatura_modulo(float temperatura_modulo) {
		this.temperatura_modulo = temperatura_modulo;
	}

	@XmlElement
	public float getViento() {
		return this.viento;
	}

	public void setViento(float viento) {
		this.viento = viento;
	}


	@XmlElement
	public int getIdSensor() {
		return idSensor;
	}



	public void setIdSensor(int idSensor) {
		this.idSensor = idSensor;
	}


	@XmlElement
	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

}