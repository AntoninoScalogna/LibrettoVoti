package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti/*=new LinkedList<Voto>()*/;
	
	public Libretto() {
		this.voti=new ArrayList<Voto>();
	}
	public void aggiungiVoto(Voto v) {
	voti.add(v);	
	}
	public String toString() {
		String s="";
		for(Voto v:this.voti)
			s=s+v.toString()+"\n";
		return this.toString();
	}

}
