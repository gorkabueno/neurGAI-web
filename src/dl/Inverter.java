package dl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the Inverter database table.
 * 
 */
@XmlRootElement
public class Inverter {

	private int idInverter;

	private float day_Energy;

	private float power;

	private int status;

	private float TOTAL_ENERGY;

	private float year_Energy;

	public Inverter() {
	}

	@XmlElement
	public int getIdInverter() {
		return this.idInverter;
	}

	public void setIdInverter(int idInverter) {
		this.idInverter = idInverter;
	}

	@XmlElement
	public float getDay_Energy() {
		return this.day_Energy;
	}

	public void setDay_Energy(float day_Energy) {
		this.day_Energy = day_Energy;
	}

	@XmlElement
	public float getPower() {
		return this.power;
	}

	public void setPower(float power) {
		this.power = power;
	}

	@XmlElement
	public float getYear_Energy() {
		return this.year_Energy;
	}

	public void setYear_Energy(float year_Energy) {
		this.year_Energy = year_Energy;
	}

	@XmlElement
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	@XmlElement
	public float getTOTAL_ENERGY() {
		return TOTAL_ENERGY;
	}

	public void setTOTAL_ENERGY(float tOTAL_ENERGY) {
		TOTAL_ENERGY = tOTAL_ENERGY;
	}

}