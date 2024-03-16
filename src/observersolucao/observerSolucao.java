package observersolucao;

import observers.Cliente;
import observers.Fornecedor;
import observers.Parceiro;
import subjects.Newsletter;

public class observerSolucao {
    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter();

        Parceiro parceiro1 = new Parceiro("Pedro", "pedro@gmail.com");
        newsletter.registerObserver(parceiro1);

        Cliente cliente1 = new Cliente("Mateus", "mateus@gmail.com");
        newsletter.registerObserver(cliente1);

        Fornecedor fornecedor1 = new Fornecedor("Maria", "maria@gmail.com");
        newsletter.registerObserver(fornecedor1);

        System.out.println("=================================");
        System.out.println("TESTE PRIMEIRA MENSAGEM");
        newsletter.addMessage("Primeira mensagem");

        newsletter.removeObserver(fornecedor1);
        System.out.println("=================================");
        System.out.println("TESTE SEGUNDA MENSAGEM");
        newsletter.addMessage("Segunda Mensagem");
    }
}