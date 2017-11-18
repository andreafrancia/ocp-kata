package it.xpug.ocp.fizzbuzz;

public class StupidGame implements Game {
    @Override
    public String say(int number) {
        return ""+ number;
    }
}
