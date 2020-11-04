/*
classe grille
 */
package superpuissance4_biron_chagnaud;

/**
 *
 * @author jbiron
 */
public class Grille {
    Cellule[][] grille = new Cellule[6][7];
    
    public boolean ajouterJetonDansColonne(Jeton unJeton, int numeroColonne){
        for(int i=6; i >=0; i--){
            for (int j=0; j <= 7; j++){
                grille[i][j]=grille[i][numeroColonne];
                if (grille[i][j]==null){
                    grille[i][j].affecterJeton(unJeton); 
                
                }
            }
        }  
        return false;
    }
    
    public boolean etreRempli(){
        for(int i=0; i <= 6; i++){
            for (int j=0; j <= 7; j++){
                if (grille[i][j]!=null){
                    return true;
                }
            }
        }
    }
    
    public void viderGrille(){
        for(int i=0; i <= 6; i++){
            for (int j=0; j <= 7; j++){
                grille[i][j]=null;
            }
        }
    }
    
    public void afficherGrilleSurConsole(){
        
    }
    
    public boolean celluleOccupé(){
        
    }
    
    public String lireCouleurDuJeton(){
        
    }
    
    public boolean etreGgnantePourJoueur(Joueur unJoueur){
        
        for (int j=0;j<7;j++){
            for(int i=0;i<6;i++){
                if(("rouge"==grille[i][j].lireCouleurDuJeton())){
                    
                }
            }
        }
    }
    
    public void tasserGrille(){
        for (int j=0;j<7;j++){
            for(int i=6;i>0;i++){
                if(grille[i][j].jetonCourant == null){
                    grille[i][j].jetonCourant = grille[i-1][j].jetonCourant;
                }
            }
        }
    }
    
    public boolean colonneRemplie(){
        for (int i=0;i<7;i++){
            if(grille[6][i]!= null){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
    public boolean placerDesintegrateur (int uneLigne,int uneColonne){
        if(grille[uneLigne][uneColonne].desintegrateur==true){
            return false;
        }else{
            grille[uneLigne][uneColonne].placerDesintegrateur();
            return true;
        }
    }
    
    public boolean placerTrouNoir (int uneLigne,int uneColonne){
        if(grille[uneLigne][uneColonne].trouNoir==true){
            return false;
        }else{
            grille[uneLigne][uneColonne].placerTrouNoir();
            return true;
        }
    }
    
    public boolean supprimerJeton(int uneLigne,int uneColonne){
        if(grille[uneLigne][uneColonne].jetonCourant==null){
            return false;
        }else{
            grille[uneLigne][uneColonne].jetonCourant=null;
            return true;
        }
    }
    
    public Jeton reupererJeton (int uneLigne,int uneColonne){
        grille[uneLigne][uneColonne].jetonCourant=null;
        
    }
            
    
}
