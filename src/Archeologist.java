public class Archeologist {
    private String name;
    private int position;

    private int merit;

    public Archeologist(String name) {
        this.name = name;
        this.position =-1;
        this.merit= 0;
    }

    public String getName() {return name;}

    public void setName() {
        this.name= name;
    }

    public int getPosition() {return position;}

    public void setPosition(int position) {this.position= position;}

    public int getMerit() {return merit;}

    public void addMerit(int merit) {
        this.merit += merit;}

}
