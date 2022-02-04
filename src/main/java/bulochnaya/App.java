package bulochnaya;

public class App {
    public static void main(String[] args){
        Homemade home = new Homemade();
        FrenchLikeBitchesAss french = new FrenchLikeBitchesAss();
        RussishLikeBrick russish = new RussishLikeBrick();
        Deutch deutch = new Deutch();

        System.out.print("Домашние булки - ");
        prinimauInterface(home);
        System.out.print("французские булки - ");
        prinimauInterface(french);
        System.out.print("Русские булки - ");
        prinimauInterface(russish);
        //System.out.print("Немецкие булки - ");
        //prinimauInterface((Zhrabable) deutch);
    }

    private static void prinimauInterface(Zhrabable zhriScuka){
        System.out.println(zhriScuka.eshChtoDaut());
    }

}
