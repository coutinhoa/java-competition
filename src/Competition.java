import java.util.ArrayList;
public class Competition {
    private  Land land;
    private ArrayList<Archelogist> archelogists;
    public Competition() {
        archelogists=new ArrayList<Archelogist>();
        land = new Land();
    }

    public void addCompetitor(String name) {
        Archelogist archelogist = new Archelogist(name);
        archelogists.add(archelogist);
    }

    public void addPlotToLand(Plot plot) {
        land.plots.add(plot);
    }

    public int getBurriedWealth(){
       return land.getWealth();
    };
}
