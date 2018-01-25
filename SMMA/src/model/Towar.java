/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Application.Functions;

/**
 *
 * @author lreplin
 */
public class Towar {
    
    String nazwa;
    String numerKatalogowy;
    String kodEan;
    double cenaNetto;
    double cenaBrutto;

    public Towar(String nazwa, String numerKatalogowy, String kodEan, double cenaNetto) {
        this.nazwa = nazwa;
        this.numerKatalogowy = numerKatalogowy;
        this.kodEan = kodEan;
        this.cenaNetto = cenaNetto;
        this.cenaBrutto = Functions.round(cenaNetto*1.23, 2);
    }
    
    public Towar() {
        
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNumerKatalogowy() {
        return numerKatalogowy;
    }

    public void setNumerKatalogowy(String numerKatalogowy) {
        this.numerKatalogowy = numerKatalogowy;
    }

    public String getKodEan() {
        return kodEan;
    }

    public void setKodEan(String kodEan) {
        this.kodEan = kodEan;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public double getCenaBrutto() {
        return cenaBrutto;
    }

    public void setCenaBrutto(double cenaBrutto) {
        this.cenaBrutto = cenaBrutto;
    }
    
    
    
}
