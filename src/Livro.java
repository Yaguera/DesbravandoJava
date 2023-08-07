public class Livro {
    
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes(){
        System.out.println("--Detalhes do Livro--");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if(this.temAutor()){
            autor.mostrarDetalhes();
        } else {
            System.out.println("Autoria Desconhecida.");
        }
        System.out.println("--");
        
    }

    public Livro() {
        System.out.println("Novo Livro Cadastrado.");
    }

    public void aplicaDescontoDe(double porcentagem) {
        this.valor -= this.valor * porcentagem;
    }

    boolean temAutor() {
        return this.autor != null;
    }
}