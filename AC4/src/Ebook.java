public class Ebook extends Livro {
    String tipo;

    public Ebook(String nome, String autor, String tipo) {
        super(nome, autor);
        this.tipo = tipo;
    }

    public void reservar(){
        System.out.println("Ebook \"" + this.nome + "\" reservado.");
        super.estado = "Reservado";
    }

    public void emprestar() {
        if (this.estado == "Reservado") {
            System.out.println("Ebook \"" + this.nome + "\" emprestado.");
        } else{
            System.out.println("É preciso fazer a reserva primeiro.");
            super.estado = "Emprestado";
        }
    }

    public void cancelarReserva(){
        System.out.println("Reserva do Ebook " + this.nome + " cancelado.");
        super.estado = "Guardado";
    }

    public void devolver(){
        System.out.println("Ebook " + this.nome + "  devolvido.");
        super.estado = "Guardado";
    }
}
