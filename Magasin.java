public class Magasin {
    public static int choixE = 2;
    public static int choixP = 2;
    public double Revenu;
    public double Depense;
    public ArticleElectromenager[] Ae;
    public ArticlePrimeur[] Ap;


    public Magasin() {
        Ae = new ArticleElectromenager[choixE];
        Ap = new ArticlePrimeur[choixP];
        Revenu = 0;
        Depense = 0;
    }


    public double rendement() {
        return (Revenu - Depense) / Depense;
    }

    public void info() {
        System.out.println("Les dépenses du magasin: " + Depense);
        System.out.println("Les revenus du magasin: " + Revenu);
        System.out.println("Le rendement: " + rendement());
        for (int i = 0; i < choixE; i++) {
            if (Ae[i] != null) {
                Ae[i].info();
            }
        }
        for (int i = 0; i < choixP; i++) {
            if (Ap[i] != null) {
                Ap[i].info();
            }
        }
    }
}