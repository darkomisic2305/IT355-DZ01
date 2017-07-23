package com.it355.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Darko
 */
@Entity
@Table(name="soba")
public class Soba implements Serializable {

	private static final long serialVersionUID = -1493701830989975609L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "soba_id")
	private int sobaId;
	@Column(name = "broj_kreveta")
	private int brojKreveta;
	@Column(name = "velicina")
	private double velicina;// u m2
	@Column(name = "ima_kupatilo")
	private boolean imaKupatilo;
	@Column(name = "ima_tv")
	private boolean imaTv;
	@Column(name = "ima_klima")
	private boolean imaKlima;
	@Column(name = "cena_po_danu")
	private double cenaPoDanu;

	public Soba() {
	}

	public Soba(int sobaId, int brojKreveta, double velicina, boolean imaKupatilo, boolean imaTv, boolean imaKlima,
			double cenaPoDanu) {
		this.sobaId = sobaId;
		this.brojKreveta = brojKreveta;
		this.velicina = velicina;
		this.imaKupatilo = imaKupatilo;
		this.imaTv = imaTv;
		this.imaKlima = imaKlima;
		this.cenaPoDanu = cenaPoDanu;
	}

	
	public int getSobaId() {
		return sobaId;
	}

	public void setSobaId(int sobaId) {
		this.sobaId = sobaId;
	}

	
	public int getBrojKreveta() {
		return brojKreveta;
	}

	public void setBrojKreveta(int brojKreveta) {
		this.brojKreveta = brojKreveta;
	}

	
	public double getVelicina() {
		return velicina;
	}

	public void setVelicina(double velicina) {
		this.velicina = velicina;
	}

	
	public boolean getImaKupatilo() {
		return imaKupatilo;
	}

	public void setImaKupatilo(boolean imaKupatilo) {
		this.imaKupatilo = imaKupatilo;
	}

	
	public boolean getImaTv() {
		return imaTv;
	}

	public void setImaTv(boolean imaTv) {
		this.imaTv = imaTv;
	}

	
	public boolean getImaKlima() {
		return imaKlima;
	}

	public void setImaKlima(boolean imaKlima) {
		this.imaKlima = imaKlima;
	}

	
	public double getCenaPoDanu() {
		return cenaPoDanu;
	}

	public void setCenaPoDanu(double cenaPoDanu) {
		this.cenaPoDanu = cenaPoDanu;
	}

	@Override
	public String toString() {
		return "Soba [brojKreveta=" + brojKreveta + ", velicina=" + velicina + ", imaKupatilo=" + imaKupatilo
				+ ", imaTv=" + imaTv + ", imaKlima=" + imaKlima + ", cenaPoDanu=" + cenaPoDanu + "]";
	}

}
