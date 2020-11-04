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
                grille[i][j]=UnJeton; 
                
            }
            
                
          }
            
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
        
    }
    
    public void tasserGrille(){
        for (int i=1;i<7;i++){
            for(int j=0;j<6;j++){
                if(grille[i][j] != null]){
                    grille[i-1][j] = grille[i][j];
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
    
    public boolean placerdesintegrateur (int uneLigne,int uneColonne){
        
    }
    
    public boolean placerTrouNoir (int uneLigne,int uneColonne){
        
    }
    
    public boolean supprimerJeton(int uneLigne,int uneColonne){
        
    }
    
    public Jeton reupererJeton (int uneLigne,int uneColonne){
        
    }
            
    
}
