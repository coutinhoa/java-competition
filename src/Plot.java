public class Plot {
    private int treasure ;
    private int digCounter;
    public Plot(int treasure ) {
        this.treasure  = treasure;
        this.digCounter = 0;
    }

    public int getTreasure() {
        return treasure;
    }

    public int getDigCounter(){
        return digCounter;
    }

    public void dig(){
        this.treasure=0;
        digCounter++;
    }

}

