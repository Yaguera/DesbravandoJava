public class Autor{
    String nome;
    String email;
    String cpf;

    void mostrarDetalhes() {
        System.out.println("--Detalhes do Autor--");
        System.out.println("Nome: "+ nome);
        System.out.println("E-mail: " + email);
        System.out.println("CPF: " + cpf);
    }
}