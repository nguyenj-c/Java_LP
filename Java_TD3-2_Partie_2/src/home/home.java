package home;

public class home {
    private String owner;
    private String adress;
    private int surface;

    public home(String owner, String adress, int surface) {
        this.owner = owner;
        this.adress = adress;
        this.surface = surface;
    }
    public void tax(int surface) {
        System.out.println(2 * surface + " euro");
    }
    @Override
    public String toString() {
        return "home{" +
                "owner=" + owner +
                ", adress=" + adress +
                ", surface=" + surface +
                '}';
    }

}
