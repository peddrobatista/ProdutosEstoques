package com.peddrobatista.classes;

import com.peddrobatista.entities.Produto;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = teclado.nextLine();
        System.out.print("Preço: ");
        produto.price = teclado.nextDouble();
        System.out.print("Quantidade: ");
        produto.quantidade = teclado.nextInt();
        System.out.println();

        System.out.println("Dados do produto: " + produto);
        System.out.println();

        System.out.print("Digite o número de produtos para serem adicionados ao estoque: ");
        int quantidade = teclado.nextInt();
        produto.addProducts(quantidade);
        System.out.println();

        System.out.println("Dados atualizados do produto: " + produto);
        System.out.println();

        System.out.print("Digite o número de produtos para serem removidos do estoque: ");
        quantidade = teclado.nextInt();
        produto.removeProducts(quantidade);
        System.out.println();

        System.out.println("Dados atualizados do produto: " + produto);

        teclado.close();
    }
}
