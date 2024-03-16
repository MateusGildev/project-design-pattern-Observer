package observers;

import subjects.Email;

import java.util.Objects;

public class Cliente extends Pessoa {


    public Cliente(String nome, String email) {
        super(nome,email);
    }

    @Override
    public void update(String mensagem) {
        Email.enviarEmail(this,mensagem);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(getNome(), cliente.getNome()) && Objects.equals(getEmail(), cliente.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getEmail());
    }
}
