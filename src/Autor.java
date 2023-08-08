public class Autor{
    private String nome;
    private String email;
    private String cpf;

    void mostrarDetalhes() {
        System.out.println("--Detalhes do Autor--");
        System.out.println("Nome: "+ nome);
        System.out.println("E-mail: " + email);
        System.out.println("CPF: " + cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}