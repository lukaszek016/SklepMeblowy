/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author lreplin
 */
public class Zamowienie {
    
    DokumentSprzedazy dokument;
    List<Towar> listaTowarow;
    int sumaNetto;

    public Zamowienie() {
        
    }

    public DokumentSprzedazy getDokument() {
        return dokument;
    }

    public void setDokument(DokumentSprzedazy dokument) {
        this.dokument = dokument;
    }

    public List<Towar> getListaTowarow() {
        return listaTowarow;
    }

    public void setListaTowarow(List<Towar> listaTowarow) {
        this.listaTowarow = listaTowarow;
    }

    public int getSumaNetto() {
        return sumaNetto;
    }

    public void setSumaNetto(int sumaNetto) {
        this.sumaNetto = sumaNetto;
    }
    
    public void dodajTowar(Towar towar) {
        this.listaTowarow.add(towar);
    }
    
    public void usunTowar(int id) {
        this.listaTowarow.remove(id);
    }
    
    
}
