import java.util.ArrayList;

public class Land {
    public ArrayList<Plot> plots;
        public Land() {
        plots = new ArrayList<Plot>();
    }

    public int getNumberOfPlots(){
        return plots.size();
    }

    public int getWealth(){
        int wealth=0;
        for(int i = 0; i<plots.size(); i++){
            wealth +=plots.get(i).getTreasure();}
        return wealth;
    };
}