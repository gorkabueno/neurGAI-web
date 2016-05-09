package dl;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Inverter database table.
 * 
 */
@Entity
@NamedQuery(name="Inverter.findAll", query="SELECT i FROM Inverter i")
public class Inverter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idInverter;

	@Column(name="Day_Energy")
	private String day_Energy;

	@Column(name="Opcion_idOpcion")
	private int opcion_idOpcion;

	@Column(name="Power")
	private String power;

	@Column(name="Status")
	private int status;

	@Column(name="Total_Energy")
	private String total_Energy;

	@Column(name="Year_Energy")
	private String year_Energy;

	public Inverter() {
	}

	public int getIdInverter() {
		return this.idInverter;
	}

	public void setIdInverter(int idInverter) {
		this.idInverter = idInverter;
	}

	public String getDay_Energy() {
		return this.day_Energy;
	}

	public void setDay_Energy(String day_Energy) {
		this.day_Energy = day_Energy;
	}

	public int getOpcion_idOpcion() {
		return this.opcion_idOpcion;
	}

	public void setOpcion_idOpcion(int opcion_idOpcion) {
		this.opcion_idOpcion = opcion_idOpcion;
	}

	public String getPower() {
		return this.power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTotal_Energy() {
		return this.total_Energy;
	}

	public void setTotal_Energy(String total_Energy) {
		this.total_Energy = total_Energy;
	}

	public String getYear_Energy() {
		return this.year_Energy;
	}

	public void setYear_Energy(String year_Energy) {
		this.year_Energy = year_Energy;
	}

}