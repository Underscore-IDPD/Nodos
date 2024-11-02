package Clases;

public class Arista {
    private final char inicioId;
    private final char finalId;
    private final int peso;

    public Arista(char inicioId, char finalId, int peso) {
        this.inicioId = inicioId;
        this.finalId = finalId;
        this.peso = peso;
    }

    public char getinicioId() {
        return inicioId;
    }

    public char getfinalId() {
        return finalId;
    }

    public int getPeso(){
        return peso;
    }
}