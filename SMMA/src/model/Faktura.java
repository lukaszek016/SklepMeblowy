/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Application.Functions;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lreplin
 */
public class Faktura implements DokumentSprzedazy {

    Klient klient;
    List<Towar> pozycje;
    double sumaNetto;
    double sumaBrutto;
    Date dataWystawienia;

    public Faktura(Klient klient, List<Towar> pozycje, double sumaNetto, Date dataWystawienia) {
        this.klient = klient;
        this.pozycje = pozycje;
        this.sumaNetto = sumaNetto;
        this.sumaBrutto = Functions.round(sumaNetto*1.23, 2);
        this.dataWystawienia = dataWystawienia;
    }

    @Override
    public void wydrukujDokument() {
        
    }

    @Override
    public void zapiszDokument() {
        
    }
    
    public void setKlient(Klient klient) {
        this.klient = klient;
    }
    
    public Klient getKlient() {
        return klient;
    }

    public List<Towar> getPozycje() {
        return pozycje;
    }

    public void setPozycje(List<Towar> pozycje) {
        this.pozycje = pozycje;
    }

    public double getSumaNetto() {
        return sumaNetto;
    }

    public void setSumaNetto(double sumaNetto) {
        this.sumaNetto = sumaNetto;
    }

    public double getSumaBrutto() {
        return sumaBrutto;
    }

    public void setSumaBrutto(double sumaBrutto) {
        this.sumaBrutto = sumaBrutto;
    }

    public Date getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(Date dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }
    
    
    
    
    
}
