package observers;

import java.util.Objects;

public class Parceiro extends Pessoa {

    public Parceiro(String nome, String email) {
        super(nome, email);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parceiro parceiro = (Parceiro) o;
        return Objects.equals(getNome(), parceiro.getNome()) && Objects.equals(getEmail(), parceiro.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getEmail());
    }
}
