public class CadastroDeLivros {
    public static void main(String[] args) {
        Autor autor1 = new Autor();
        autor1.setNome("Yago Gomes Varela");
        autor1.setEmail("yaguamineral@gmail.com");
        autor1.setCpf("067.313.733-38");

        Livro livro1 = new Livro(autor1);
        livro1.setNome("Yaguera, a origem");
        livro1.setDescricao("A origem do universo como conhecemos.");
        livro1.setValor(79.90);
        livro1.setIsbn("978-85-66250-23-0"); 

        livro1.setAutor(autor1);
        if(!livro1.aplicaDescontoDe(0.1)) {
            System.out.println("Desconto não pode ser maior do que 30%");
        } else{
            System.out.println("Valor com desconto: " + livro1.getValor());
        }
        livro1.mostrarDetalhes();

        Autor autor2 = new Autor();
        autor2.setNome("Ednaldo Pereira");
        autor2.setEmail("EdnaldoPereira@chance.com.pr");
        autor2.setCpf("043.763.513-65");

        Livro livro2 = new Livro(autor2);
        livro2.setNome("Yaguera, a queda do caranguejo");
        livro2.setDescricao("Ascenção e declinio do imperio Caranguejal");
        livro2.setValor(89.90);
        livro2.setIsbn("978-15-76250-23-0");

        livro2.setAutor(autor2);
        if(!livro2.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto não pode ser maior do que 30%");
        } else{
            System.out.println("Valor com desconto: " + livro2.getValor());
        }
        livro2.mostrarDetalhes();
        
        Ebook ebook = new Ebook(autor2);
        ebook.setNome("Yaguera, a queda do caranguejo"); 
        ebook.setDescricao("Ascenção e declinio do imperio Caranguejal");
        ebook.setValor(49.90);
        double valorOriginal = ebook.getValor();
        ebook.setIsbn("978-15-76250-23-0");
        if(!ebook.aplicaDescontoDe(0.15)) {
            System.out.println("Desconto não pode ser maior do que 15%");
        } else{
            System.out.println("Valor sem desconto: " + valorOriginal);
            System.out.println("Valor com desconto: " + ebook.getValor());
        }
        ebook.mostrarDetalhes();

    }
}