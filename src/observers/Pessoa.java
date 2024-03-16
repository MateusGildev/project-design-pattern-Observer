package observers;

import subjects.Email;

public class Pessoa implements Observer {
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }


    @Override
    public void update(String mensagem) {
        Email.enviarEmail(this, mensagem);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}
