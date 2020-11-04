/*
classe Jeton
 */
package superpuissance4_biron_chagnaud;

/**
 *
 * @author jbiron
 */
public class Jeton {
    String couleur;
    
    public Jeton(String uneCouleur){
        couleur = uneCouleur;
    }
    
    public String lireCouleur(){
        return "la couleur du jeton du joueur " + couleur;
        
                
    }
}
