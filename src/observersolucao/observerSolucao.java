package observersolucao;

import observers.Cliente;
import observers.Fornecedor;
import observers.Parceiro;
import subjects.Newsletter;

public class observerSolucao {
    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter();

        Cliente cliente1 = new Cliente("Bruno Soares", "brunoSoares@gmail.com");
        Cliente cliente2 = new Cliente("Mateus Gil", "mateusGil@gmail.com");
        newsletter.registerObserver(cliente1);
        newsletter.registerObserver(cliente2);

        Fornecedor fornecedor1 = new Fornecedor("Wesley", "wesley@gamil.com");
        newsletter.registerObserver(fornecedor1);

        Parceiro parceiro1 = new Parceiro("Pedro", "pedro@gmail.com");
        newsletter.registerObserver(parceiro1);



        System.out.println("=================================");
        System.out.println("TESTE PRIMEIRA MENSAGEM");
        newsletter.addMessage("Primeira mensagem");

        newsletter.removeObserver(fornecedor1);
        System.out.println("TESTE SEGUNDA MENSAGEM");
        newsletter.addMessage("Segunda mensagem");

        newsletter.registerObserver(fornecedor1);
        System.out.println("TESTE TERCEIRA MENSAGEM");
        newsletter.addMessage("Terceira mensagem");
    }
}