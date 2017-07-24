package com.it355.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Darko
 */
@Entity
@Table(name = "soba")
@XmlRootElement
public class Soba implements Serializable {

	private static final long serialVersionUID = -1493701830989975609L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "soba_id")
	private Integer sobaId;
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

	@ManyToOne
	@JoinColumn(name = "hotel_id", referencedColumnName = "hotel_id")
	private Hotel hotel;

	public Soba() {
	}

	public Soba(Integer sobaId, int brojKreveta, double velicina, boolean imaKupatilo, boolean imaTv, boolean imaKlima,
			double cenaPoDanu, Hotel hotel) {
		super();
		this.sobaId = sobaId;
		this.brojKreveta = brojKreveta;
		this.velicina = velicina;
		this.imaKupatilo = imaKupatilo;
		this.imaTv = imaTv;
		this.imaKlima = imaKlima;
		this.cenaPoDanu = cenaPoDanu;
		this.hotel = hotel;
	}

	public Integer getSobaId() {
		return sobaId;
	}

	public void setSobaId(Integer sobaId) {
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

	
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Soba [brojKreveta=" + brojKreveta + ", velicina=" + velicina + ", imaKupatilo=" + imaKupatilo
				+ ", imaTv=" + imaTv + ", imaKlima=" + imaKlima + ", cenaPoDanu=" + cenaPoDanu + ", hotel=" + hotel
				+ "]";
	}

}
