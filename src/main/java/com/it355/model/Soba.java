package com.it355.model;

/**
 *
 * @author Darko
 */
public class Soba {
    private int brojKreveta;
    private double velicina;//u m2
    private boolean imaKupatilo;
    private boolean imaTv;
    private boolean imaKlima;
    private double cenaPoDanu;

    public Soba() {
    }

    public Soba(int brojKreveta, double velicina, boolean imaKupatilo, boolean imaTv, boolean imaKlima, double cenaPoDanu) {
        this.brojKreveta = brojKreveta;
        this.velicina = velicina;
        this.imaKupatilo = imaKupatilo;
        this.imaTv = imaTv;
        this.imaKlima = imaKlima;
        this.cenaPoDanu = cenaPoDanu;
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

}
