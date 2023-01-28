package home;

public class ProHome extends home{
    private int nbEmployés;

    public ProHome(String owner, String adress, int surface) {
        super(owner, adress, surface);
    }

    @Override
    public void tax(int surface, int nbpiece, boolean piscine) {
        if (piscine == true){
            System.out.println(2 * surface+15*nbEmployés + " euro");
        }
        else
            System.out.println(2 * surface+15*nbEmployés + " euro");
    }
}
