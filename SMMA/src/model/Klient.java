/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lreplin
 */
public class Klient {

    String imie;
    String nazwisko;
    String kodPocztowy;
    String miasto;
    String ulicaINr;
    String nip;

    public Klient(String imie, String nazwisko, String kodPocztowy, String miasto, String ulicaINr, String nip) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.ulicaINr = ulicaINr;
        this.nip = nip;
    }

    public Klient() {

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlicaINr() {
        return ulicaINr;
    }

    public void setUlicaINr(String ulicaINr) {
        this.ulicaINr = ulicaINr;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    
}
