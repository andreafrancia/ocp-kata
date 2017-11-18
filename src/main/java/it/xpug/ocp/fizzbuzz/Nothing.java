package it.xpug.ocp.fizzbuzz;

public class Nothing implements Regola {
    @Override
    public boolean itIsTime(int number) {
        return false;
    }

    @Override
    public String word() {
        return null;
    }
}
