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
public class Paragon implements DokumentSprzedazy {

    Date dataUtworzenia;
    List<Towar> pozycje;
    double sumaNetto;
    double sumaBrutto;

    public Paragon(Date dataUtworzenia, List<Towar> pozycje, double sumaNetto) {
        this.dataUtworzenia = dataUtworzenia;
        this.pozycje = pozycje;
        this.sumaNetto = sumaNetto;
        this.sumaBrutto = Functions.round(sumaNetto*1.23, 2);
    }
    
    
    
    @Override
    public void wydrukujDokument() {
        
    }

    @Override
    public void zapiszDokument() {
        
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

    public Date getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setDataUtworzenia(Date dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
    }
    
    
    
    
    
}
