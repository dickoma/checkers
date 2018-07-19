package com.main;

public class Grille {

    private int nombreDeCases;
    private  Case grilleDeJeu []  ;
    public Grille(int nombreDeCases){
        this.nombreDeCases = nombreDeCases ;
        this.grilleDeJeu  = new Case [nombreDeCases] ; // Le plateau de jeu
    }

    public void mettreDansCase(int numeroCase ){
        this.grilleDeJeu[numeroCase] = new Case () ;
    }

}
