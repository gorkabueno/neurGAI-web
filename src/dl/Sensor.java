package dl;

/**
 * The persistent class for the Sensors database table.
 * 
 */

public class Sensor {

	private int idSensor;

	private float radiacion_solar;

	private float temperatura_ambiente;

	private float temperatura_modulo;

	private float viento;

	public Sensor() {
	}



	public float getRadiacion_solar() {
		return this.radiacion_solar;
	}

	public void setRadiacion_solar(float radiacion_solar) {
		this.radiacion_solar = radiacion_solar;
	}

	public float getTemperatura_ambiente() {
		return this.temperatura_ambiente;
	}

	public void setTemperatura_ambiente(float temperatura_ambiente) {
		this.temperatura_ambiente = temperatura_ambiente;
	}

	public float getTemperatura_modulo() {
		return this.temperatura_modulo;
	}

	public void setTemperatura_modulo(float temperatura_modulo) {
		this.temperatura_modulo = temperatura_modulo;
	}

	public float getViento() {
		return this.viento;
	}

	public void setViento(float viento) {
		this.viento = viento;
	}



	public int getIdSensor() {
		return idSensor;
	}



	public void setIdSensor(int idSensor) {
		this.idSensor = idSensor;
	}

}