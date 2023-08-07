public class CadastroDeLivros {
    public static void main(String[] args) {
        Autor autor1 = new Autor();
        autor1.nome = "Yago Gomes Varela";
        autor1.email = "yaguamineral@gmail.com";
        autor1.cpf = "067.313.733-38";

        Livro livro1 = new Livro();
        livro1.nome = "Yaguera, a origem";
        livro1.descricao ="A origem do universo como conhecemos.";
        livro1.valor = 79.90;
        livro1.isbn = "978-85-66250-23-0";

        livro1.autor = autor1;
        if(!livro1.aplicaDescontoDe(0.1)) {
            System.out.println("Desconto não pode ser maior do que 30%");
        } else{
            System.out.println("Valor com desconto: " + livro1.valor);
        }
        livro1.mostrarDetalhes();

        Autor autor2 = new Autor();
        autor2.nome = "Ednaldo Pereira";
        autor2.email = "EdnaldoPereira@chance.com.pr";
        autor2.cpf = "043.763.513-65";

        Livro livro2 = new Livro();
        livro2.nome = "Yaguera, a queda do caranguejo";
        livro2.descricao ="Ascenção e declinio do imperio Caranguejal";
        livro2.valor = 89.90;
        livro2.isbn = "978-15-76250-23-0";

        livro2.autor = autor2;
        if(!livro2.aplicaDescontoDe(0.5)) {
            System.out.println("Desconto não pode ser maior do que 30%");
        } else{
            System.out.println("Valor com desconto: " + livro2.valor);
        }
        livro2.mostrarDetalhes();

    }
}