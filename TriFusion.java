package PracticeAlgorithms;

/**
 * TriFusion ce programme fait la fusion de deux tableaux trié vous y trouverez
 * une fonction affiche pour afficher un tableau et la fonction triFusion2tab
 * qui fait la fusion de deux tableau trié et vous retourne un tableau final
 * trié Merci :)
 */
public class TriFusion {

    // tableaux comme exemple vous pouvez modifier
    static int[] t1 = { 2, 3, 5, 8, 12, 15, 100 };
    static int[] t2 = { 1, 6, 7, 11, 14, 20, 25, 30, 40 };
    static int[] tabFinal;

    public static void main(String[] args) {

        System.out.println("Votre premier tableau");
        affiche(t1);
        System.out.println("Votre deuxième tableau");
        affiche(t2);
        System.out.println("votre tableau final trié");
        tabFinal = triFusion2tab(t1, t2);
        affiche(tabFinal);

    }

    public static void affiche(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " | ");

        }
        System.out.println();

    }

    public static int[] triFusion2tab(int[] t1, int[] t2) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] t = new int[t1.length + t2.length];

        while ((i < t1.length) && (j < t2.length)) {
            if (t1[i] <= t2[j]) {
                t[k] = t1[i];
                i++;
                k++;
            } else {
                t[k] = t2[j];
                j++;
                k++;
            }

        }

        if (i == t1.length) {

            while (k < t.length) {
                t[k] = t2[j];
                j++;
                k++;
            }

        } else {
            while (k < t.length) {
                t[k] = t1[i];
                i++;
                k++;
            }
        }

        return t;
    }

}
