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

    public Archeologist archeologistMerit(String name) throws Exception {
        Archeologist a = findArcheologist(name);
        for(Archeologist element : archeologists) {
            element.getMerit();
            //element.setMerit();
        } /*if(a!=) {
            throw new Exception("Archeologist does not exist.");
        }/*if(!nameOne || !nameTwo){
            System.out.println("Arqueologo inexistente");*/
        return null;
    }

}
