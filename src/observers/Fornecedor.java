package observers;

import subjects.Email;

import java.util.Objects;

public class Fornecedor extends Pessoa{

    public Fornecedor(String nome, String email) {
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
        Fornecedor that = (Fornecedor) o;
        return Objects.equals(getNome(), that.getNome()) && Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getEmail());
    }
}
