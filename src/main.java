import bolo.*;

public class main {
    public static void main(String[] args) {
        Bolo boloDeChocolate = new BoloDeChocolate("Super Bolo de Chocolate"); // Criando um Bolo
        boloInfo(boloDeChocolate); // Exibindo as informações do Bolo

        // Decorando o Objeto Bolo uma class Decorator
        System.out.println("--------------------------------------"); // Separador
        boloDeChocolate = new CB_Chocolate(boloDeChocolate); // Adiciona cobertura de chocolate
        boloInfo(boloDeChocolate); // Exibe informaçoes do bolo

        // Decorando o Objeto Bolo com várias class Decoretor
        System.out.println("--------------------------------------"); // Separador
        boloDeChocolate = new CB_Chantili(boloDeChocolate); // Adiciona Cobertura de chantili
        boloDeChocolate = new DC_GranuladoDeChocolate(boloDeChocolate); // Adiciona Granulados de Chocolate
        boloDeChocolate = new DC_RaspasDeChocolate(boloDeChocolate); // Adiciona Raspas de Chocolate
        boloInfo(boloDeChocolate); // Exibe as informações do bolo
    }

    // Exibe as informações de um Bolo
    public static void boloInfo(Bolo bolo) {
        System.out.println("Nome: " + bolo.getNome());
        System.out.println("Sabor: " + bolo.getSabor());
        System.out.println("Cobertura: " + bolo.getCobertura());
        System.out.println("Decoração: " + bolo.getDecoracao());
        System.out.println("Valor: " + bolo.getValor());
    }
}
