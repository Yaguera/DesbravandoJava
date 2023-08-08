public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Maurico De Sousa");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Turma da Mônica");

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Turma da Mônica");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
    }
}
