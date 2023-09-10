public class Livro {
    String nome;
    String autor;
    String estado;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
        this.estado = "Guardado";
    }

    public void reservar(){}

    public void emprestar() {}

    public void cancelarReserva(){}

    public void devolver(){}
}
