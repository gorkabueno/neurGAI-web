package dl;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Historico database table.
 * 
 */
@Entity
@NamedQuery(name="Historico.findAll", query="SELECT h FROM Historico h")
public class Historico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idHistorico;

	@Column(name="Day_Energy")
	private String day_Energy;

	@Column(name="Frecuencia")
	private String frecuencia;

	@Column(name="I_AC")
	private String iAc;

	@Column(name="I_DC")
	private String iDc;

	@Column(name="Opcion_idOpcion")
	private int opcion_idOpcion;

	@Column(name="Temperatura_modulo")
	private String temperatura_modulo;

	@Column(name="V_AC")
	private String vAc;

	@Column(name="V_DC")
	private String vDc;

	public Historico() {
	}

	public String getIdHistorico() {
		return this.idHistorico;
	}

	public void setIdHistorico(String idHistorico) {
		this.idHistorico = idHistorico;
	}

	public String getDay_Energy() {
		return this.day_Energy;
	}

	public void setDay_Energy(String day_Energy) {
		this.day_Energy = day_Energy;
	}

	public String getFrecuencia() {
		return this.frecuencia;
	}

	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getIAc() {
		return this.iAc;
	}

	public void setIAc(String iAc) {
		this.iAc = iAc;
	}

	public String getIDc() {
		return this.iDc;
	}

	public void setIDc(String iDc) {
		this.iDc = iDc;
	}

	public int getOpcion_idOpcion() {
		return this.opcion_idOpcion;
	}

	public void setOpcion_idOpcion(int opcion_idOpcion) {
		this.opcion_idOpcion = opcion_idOpcion;
	}

	public String getTemperatura_modulo() {
		return this.temperatura_modulo;
	}

	public void setTemperatura_modulo(String temperatura_modulo) {
		this.temperatura_modulo = temperatura_modulo;
	}

	public String getVAc() {
		return this.vAc;
	}

	public void setVAc(String vAc) {
		this.vAc = vAc;
	}

	public String getVDc() {
		return this.vDc;
	}

	public void setVDc(String vDc) {
		this.vDc = vDc;
	}

}