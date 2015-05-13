
package main;

public class Evento {

    private int tempo;
    private static final String bloqueio = "BLOQUEIO";
    private static final String desbloqueio = "DESBLOQUEIO";
    private static final String termino = "TERMINO";

    public Evento() {
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    
}
