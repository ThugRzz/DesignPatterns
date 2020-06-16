package behavioral.State;

public class Developer {
    private State state;

    public Developer(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeState(){
        if(this.state instanceof Sleeping){
            setState(new Training());
        }else if(this.state instanceof Training){
            setState(new Coding());
        }else if(this.state instanceof Coding){
            setState(new Reading());
        }else if(this.state instanceof Reading){
            setState(new Sleeping());
        }
    }

    public void doing(){
        state.state();
    }
}
