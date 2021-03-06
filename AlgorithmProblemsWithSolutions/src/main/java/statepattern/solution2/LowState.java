package statepattern.solution2;

public class LowState implements State {

    final CeilingFan fan;

    public LowState(final CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void red() {
        fan.currentState = fan.offState;
    }

    @Override
    public void green() {
        fan.currentState = fan.mediumState;
    }
}
