/**
 * Classe représentant la gestion des notes des étudiants
 */

public class GestionnaireNotes {

    /**
     * Affiche les notes des étudiants
     * @param nomEtudiant nom de l'étudiant
     * @param notes tableau comportant les notes de l'étudiant
     */
    public void afficherNotes(String nomEtudiant, int[] notes) {
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /*
    * Calcule la somme des notes 
    */
    public int calculerSomme(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return somme;
    }

    /**
    * Affichage de la moyenne
    */
    public void afficherMoyenne(int somme){
        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne);
    }
}
