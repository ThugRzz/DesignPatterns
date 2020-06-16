package structural.Adapter.Sample;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public boolean fits(RoundPeg peg){
        boolean isFits;
        isFits= this.getRadius()>=peg.getRadius();
        return isFits;
    }
}
