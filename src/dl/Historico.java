package dl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the Historico database table.
 * 
 */
@XmlRootElement
public class Historico {

	private int idHistorico;

	private float day_Energy;

	private float frecuencia;

	private float iAc;

	private float iDc;

	private float temperatura_modulo;

	private float vAc;

	private float vDc;

	public Historico() {
	}
	
	@XmlElement
	public int getIdHistorico() {
		return this.idHistorico;
	}

	public void setIdHistorico(int idHistorico) {
		this.idHistorico = idHistorico;
	}
	
	@XmlElement
	public float getDay_Energy() {
		return this.day_Energy;
	}

	public void setDay_Energy(float day_Energy) {
		this.day_Energy = day_Energy;
	}

	@XmlElement
	public float getFrecuencia() {
		return this.frecuencia;
	}

	public void setFrecuencia(float frecuencia) {
		this.frecuencia = frecuencia;
	}

	@XmlElement
	public float getIAc() {
		return this.iAc;
	}

	public void setIAc(float iAc) {
		this.iAc = iAc;
	}

	@XmlElement
	public float getIDc() {
		return this.iDc;
	}

	public void setIDc(float iDc) {
		this.iDc = iDc;
	}

	@XmlElement
	public float getTemperatura_modulo() {
		return this.temperatura_modulo;
	}

	public void setTemperatura_modulo(float temperatura_modulo) {
		this.temperatura_modulo = temperatura_modulo;
	}

	@XmlElement
	public float getVAc() {
		return this.vAc;
	}

	public void setVAc(float vAc) {
		this.vAc = vAc;
	}

	@XmlElement
	public float getVDc() {
		return this.vDc;
	}

	public void setVDc(float vDc) {
		this.vDc = vDc;
	}

}