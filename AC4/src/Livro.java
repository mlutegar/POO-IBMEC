public class Livro {
    String nome;
    String autor;
    String estado;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
        this.estado = "Guardado";
    }

    public void reservar(){
        System.out.println("Livro " + this.nome + " reservado.");
        this.estado = "Reservado";
    }

    public void emprestar() {
        if (this.estado == "Reservado") {
            System.out.println("Livro " + this.nome + " emprestado.");
        } else{
            System.out.println("É preciso reserva primeiro.");
            this.estado = "Emprestado";
        }
    }

    public void cancelarReserva(){
        System.out.println("Reserva do livro " + this.nome + " cancelado.");
        this.estado = "Guardado";
    }

    public void devolver(){
        System.out.println("Livro " + this.nome + "  devolvido.");
        this.estado = "Guardado";
    }
}
