package com.it355.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "hotel")
@XmlRootElement
public class Hotel implements Serializable {

	private static final long serialVersionUID = -1129343045456946026L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "hotel_id")
	private int hotelId;
	@Column(name = "naziv")
	private String naziv;
	@Column(name = "adresa")
	private String adresa;
	@Column(name = "kategorija")
	private String kategorija;

	public Hotel() {
		super();
	}

	public Hotel(int hotelId, String naziv, String adresa, String kategorija) {
		super();
		this.hotelId = hotelId;
		this.naziv = naziv;
		this.adresa = adresa;
		this.kategorija = kategorija;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getKategorija() {
		return kategorija;
	}

	public void setKategorija(String kategorija) {
		this.kategorija = kategorija;
	}

	@Override
	public String toString() {
		return "Hotel [naziv=" + naziv + ", adresa=" + adresa + ", kategorija=" + kategorija + "]";
	}

}
