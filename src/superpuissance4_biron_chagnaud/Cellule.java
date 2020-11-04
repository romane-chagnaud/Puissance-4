/*
classe cellule
 */
package superpuissance4_biron_chagnaud;

/**
 *
 * @author jbiron
 */
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
    
    public Cellule(Jeton unJetonCourant, boolean unTrouNoir, boolean unDesintegrateur){
        jetonCourant = unJetonCourant;
        trouNoir = unTrouNoir;
        desintegrateur = unDesintegrateur;
    }
    
    public boolean affecterJeton(Jeton unJeton){
        if(jetonCourant == null){
            jetonCourant = unJeton;
            return true;
        }else{
            return false;
        }
    }
    
    public Jeton recupererJeton(){
        Jeton jetonRecup = jetonCourant;
        jetonCourant = null;
        return jetonRecup;
        
    }
    
    public boolean supprimerJeton(){
        
        if(jetonCourant == null){
            return false;
        }else{
            jetonCourant = null;
            return true;
        }   
    }
    
    public boolean placerTrouNoir(){
        if(trouNoir == true){
            return false;
        }else{
            trouNoir = true;
            return true;
        }        
    }
    
    public boolean placerDesintegrateur(){
        if(desintegrateur == true){
            return false;
        }else{
            desintegrateur = true;
            return true;
        }
    }
    
    public boolean presenceTrouNoir(){
        return trouNoir == true;
    }
    
    public boolean presenceDesintegrateur(){
        return desintegrateur == true;
    }
    
    public String lireCouleurDuJeton(){
        if(jetonCourant != null){
            return jetonCourant.lireCouleur();
        }else{
            return "vide";
        }
    }
    
    public boolean recupererDesintegrateur(){
        if(desintegrateur == false){
            return false;
        }else{
            desintegrateur = false;
            return true;
        }
    }
    
    public boolean activerTrouNoir(){
        if(trouNoir == true && jetonCourant != null){
            trouNoir = false;
            jetonCourant = null;
            return true;
        }else{
            return false;
        }
    }
}
