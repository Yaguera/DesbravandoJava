public class Ebook extends Livro {
    
    private String waterMark;

    public Ebook (Autor autor) {
        super(autor);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15){
            return false;
        }
        return super.aplicaDescontoDe(porcentagem);
    }
}
