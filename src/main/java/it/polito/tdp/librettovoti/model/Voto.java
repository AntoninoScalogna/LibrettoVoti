package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class Voto {
	private String nomeCorso;
	private int votoOttenuto;   //e 30L?
	private LocalDate data;
	
	public Voto(String nomeCorso, int votoOttenuto, LocalDate data) {
		
		this.nomeCorso = nomeCorso;
		this.votoOttenuto = votoOttenuto;
		this.data = data;
	}
	public String getNomeCorso() {
		return nomeCorso;
	}
	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}
	public int getVotoOttenuto() {
		return votoOttenuto;
	}
	public void setVotoOttenuto(int votoOttenuto) {
		this.votoOttenuto = votoOttenuto;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Esame di " + nomeCorso + ", votoOttenuto=" + votoOttenuto + ", data=" + data;
	}
	
	
    
	
	
}
