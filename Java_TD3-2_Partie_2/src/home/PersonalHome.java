package home;

public class PersonalHome extends home{
    private int nbPiece;
    private boolean piscine;
    public PersonalHome(String owner, String adress, int surface) {
        super(owner, adress, surface);
    }
    @Override
    public void tax(int surface, int nbPiece, boolean piscine) {
        if (piscine == true){
            System.out.println(2 * surface+15*nbPiece+80 + " euro");
        }
        else
            System.out.println(2 * surface+15*nbPiece + " euro");
    }
}
