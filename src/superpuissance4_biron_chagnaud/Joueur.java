package superpuissance4_biron_chagnaud;


import superpuissance4_biron_chagnaud.Jeton;

/*
classe joueur
 */

/**
 *
 * @author jbiron
 */
public class Joueur {
    String nom , couleur;
    Jeton [] ListeJetons = new Jeton[21];
    int nombreDesintegrateurs , nombreJetonsRestants;
    
    public Joueur(String unNom, String uneCouleur, int nbDesintegrateur, int nbJetonsRestants){
        nom = unNom;
        couleur = uneCouleur;
        nombreDesintegrateurs = nbDesintegrateur;
        nombreJetonsRestants = nbJetonsRestants;
    }
    
    public void affecterCouleur(String couleur){
        System.out.println("vous avez les jetons de couleur " + couleur);
    }
    
    public boolean ajouterJetons(Jeton unJeton){
        for (int i=0;i<=20;i++){
            ListeJetons[i] = unJeton;
            nombreJetonsRestants = nombreJetonsRestants + 1;
            return true;
        }
        return false;
    }
    
    public void obtenirDesintegrateur(){
        nombreDesintegrateurs = nombreDesintegrateurs + 1;
    }
    
    public boolean utiliserDesintegrateur(){
        if(nombreDesintegrateurs > 0){
            nombreDesintegrateurs = nombreDesintegrateurs - 1;
            return true;
        }else{
            return false;
        }
    }
}
