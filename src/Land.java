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

    /*public StringBuilder getLandSymbols(){
        StringBuilder stringBuilder = new StringBuilder(100);
        for (int i =0; i< plots.size();i++) {
            //System.out.println(plots.get(i).getTreasure());
            if (plots.get(i).getTreasure() == 0) {
                stringBuilder.append("-");
            } else {
                stringBuilder.append("*");
            }
        } return stringBuilder;
    }*/

    public String getLandSymbols(){
        String stringBuilder = "";
        for (int i =0; i< plots.size();i++) {
            //System.out.println(plots.get(i).getTreasure());
            if (plots.get(i).getTreasure() == 0) {
                stringBuilder= stringBuilder.concat("-");
            } else {
                stringBuilder= stringBuilder.concat("*");
            }
        } return stringBuilder;
    }
    public void digPlot(Archeologist archeologist , int moveDirection) throws Exception {
        if(moveDirection == 0) {
            throw new Exception("Invalid move");
        }
        int resultingDirection = archeologist.getPosition()+ moveDirection;
        /*if(resultingDirection<-1 && resultingDirection>plots.size()){
            throw new Exception("Archeologist disqualified");
        }//////not working*/
        plots.get(resultingDirection).setTreasure(0);
        archeologist.setPosition(resultingDirection);
    }
}