import java.util.ArrayList;
public class Competition {
    private  Land land;
    private ArrayList<Archeologist> archeologists;
    public Competition() {
        archeologists=new ArrayList<Archeologist>();
        land = new Land();
    }

    public void addCompetitor(String name) {
        Archeologist archeologist = new Archeologist(name);
        archeologists.add(archeologist);
    }

    public void addPlotToLand(Plot plot) {
        land.plots.add(plot);
    }

    public int getBuriedWealth(){
       return land.getWealth();
    };

    public String getLandSymbols(){
        return land.getLandSymbols();
    }

    public void dig(String name, int direction) throws Exception {
        Archeologist a = findArcheologist(name);
        if(a == null) {
            throw new Exception("Archeologist does not exist.");
        }

        if(a.isDisqualified()){
            throw new Exception("Archeologist lost the license.");
        }

        land.digPlot(a, direction);
    }

    private Archeologist findArcheologist(String name) {
        for(Archeologist element : archeologists) {
            if (element.getName().equals(name.trim())) {
                return element;
            }
        }
        return null;
    }

    public int getArcheologistMerit(String name) throws Exception {
        Archeologist a = findArcheologist(name);
        if(a==null) {
            throw new Exception("Archeologist does not exist.");
        }
        return a.getMerit();
    }

    public boolean allCompetitorsDisqualified(){
        for(Archeologist element : archeologists) {
            if (!element.isDisqualified()) {
                return false;
            }
        }
        return true;
    }
}
