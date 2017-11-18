package it.xpug.ocp.fizzbuzz;

public class StupidGame implements Game {

    private Regola regola;

    public StupidGame(Regola regola) {
        this.regola = regola;
    }
    @Override
    public String say(int number) {
        if(regola.itIsTime(number)) {
            return regola.word();
        }
        return ""+ number;
    }
}
