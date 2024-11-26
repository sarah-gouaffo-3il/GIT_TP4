/**
 * Classe qui répresentant les réductions sur une facture en fonction de la catégorie des produits
 */
public class FactureManager {

    /**
     * @param typeProduit Le type du produit
     * @param quantite La quantité du produit
     * @param prixUnitaire Le prix unitaire du produit
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        /**
         * Calcul le total d'une facture
         */ 
        double total = quantite * prixUnitaire;
         /**
         * reduction sur le total
         */
         if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }

        /**
         * reduction selon la catégorie
         */ 

        switch (reduction){
            case "Alimentaire":
                total -= total * 0.05; // Réduction de 5%
                break;
            case "Electronique":
                total -= total * 0.1; // Réduction de 10%
                break;
            case "Luxe":
                total -= total * 0.15; // Réduction de 15%
                break;
            default: total = total;
        }
        return total;
    }
}
