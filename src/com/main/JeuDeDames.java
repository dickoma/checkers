package com.main;

public class JeuDeDames {


    private Joueur joueur1 ;
    private Joueur joueur2 ;
    private boolean auTourDe ; // Vrai pour le j1, faux pour le  j2

    private final int nombreDeCases = 100 ; // Version américiane
    private Grille grilelDeJeu ;
    private  int [] caseInterdite = new int [nombreDeCases/2] ; // On ne peut/doit pas occuper toutes les positions


    public JeuDeDames(Joueur joueur1 , Joueur joueur2 ){
        this.joueur2 = joueur2 ;
        this.joueur1 = joueur1 ;
    }

    public void jouer (Joueur joueurCourant , int position ){

    }

    /// A definir ...

}
