package structural.Adapter.Sample;

public class Adapter extends RoundPeg {
    private SquarePeg peg;

    public Adapter(SquarePeg peg) {
        this.peg = peg;
    }
    @Override
    public int getRadius(){
        int result;
        result = (int) Math.sqrt(Math.pow((peg.getWidth()/2),2)*2);
        return result;
    }
}
