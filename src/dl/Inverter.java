package dl;

/**
 * The persistent class for the Inverter database table.
 * 
 */
public class Inverter {

	private int idInverter;

	private float day_Energy;

	private float power;

	private int status;

	private float total_Energy;

	private float year_Energy;

	public Inverter() {
	}

	public int getIdInverter() {
		return this.idInverter;
	}

	public void setIdInverter(int idInverter) {
		this.idInverter = idInverter;
	}

	public float getDay_Energy() {
		return this.day_Energy;
	}

	public void setDay_Energy(float day_Energy) {
		this.day_Energy = day_Energy;
	}

	public float getPower() {
		return this.power;
	}

	public void setPower(float power) {
		this.power = power;
	}

	public float getTotal_Energy() {
		return this.total_Energy;
	}

	public void setTotal_Energy(float total_Energy) {
		this.total_Energy = total_Energy;
	}

	public float getYear_Energy() {
		return this.year_Energy;
	}

	public void setYear_Energy(float year_Energy) {
		this.year_Energy = year_Energy;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}