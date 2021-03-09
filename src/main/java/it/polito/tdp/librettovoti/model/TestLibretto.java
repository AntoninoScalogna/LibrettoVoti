package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {
	public static void main(String[] args) {
	System.out.println("Test metodi libretto");
    Libretto libretto=new Libretto();
    Voto voto1=new Voto("Analisi 1", 30, LocalDate.of(2019, 2, 15));
	libretto.aggiungiVoto(voto1);
	libretto.aggiungiVoto(new Voto("Fisica 1",28,LocalDate.of(2019, 7, 15)));
	libretto.aggiungiVoto(new Voto("Informatica",24,LocalDate.of(2019, 9, 15)));

	System.out.println();
}
}