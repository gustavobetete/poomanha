package br.edu.fatecmm.prjesfera.model;

public class Esfera {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularVolume(){
        return 4/(float)3 * Math.PI * Math.pow(raio, 3.0);
    }
}
