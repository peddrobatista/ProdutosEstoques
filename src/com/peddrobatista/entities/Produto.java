package com.peddrobatista.entities;

public class Produto {
    public String nome;
    public double price;
    public int quantidade;

    public double totalValueInStock() {
        return price * quantidade;
    }

    public void addProducts(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProducts(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome + ", R$ "
                + String.format("%.2f", price)
                + ", " + quantidade + " units, Total: R$ "
                + String.format("%.2f",totalValueInStock());
    }

}
