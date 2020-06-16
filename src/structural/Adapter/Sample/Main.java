package structural.Adapter.Sample;

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(2);
        RoundPeg roundPeg = new RoundPeg(2);
        if (roundHole.fits(roundPeg)) {
            System.out.println("OK");
        }
        SquarePeg smallSquarePeg = new SquarePeg(1);
        SquarePeg bigSquarePeg = new SquarePeg(10);

        Adapter smallSquarePegAdapter = new Adapter(smallSquarePeg);
        Adapter bigSquarePegAdapter = new Adapter(bigSquarePeg);
        if (roundHole.fits(smallSquarePegAdapter)) {
            System.out.println("OK");
        }
        if (roundHole.fits(bigSquarePegAdapter)) {
            System.out.println("OK");
        } else {
            System.out.println("This peg does not fit");
        }
    }
}
