package com.it355.dao.impl;

import com.it355.dao.SobaDao;

public class SobaDaoImpl implements SobaDao {

	@Override
	public void dodajSobu() {
		System.out.println("Metoda za dodavanje sobe!");
	}

	@Override
	public String dodajSobuRet() {
		System.out.println("Dodata je soba i vracena stranica.");
		return "dodato";
	}

	@Override
	public void dodajSobuThrowException() throws Exception {
		System.out.println("Dodavanje studenta, ali se baca izuzetak.");
		throw new Exception("Neki exception se desio.");
		
	}

}
