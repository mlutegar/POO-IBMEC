public class LivroFisico extends Livro{
    public LivroFisico(String nome, String autor) {
        super(nome, autor);
    }

    public void reservar(){
        System.out.println("Livro físico " + this.nome + " reservado.");
        super.estado = "Reservado";
    }

    public void emprestar() {
        if (this.estado == "Reservado") {
            System.out.println("Livro físico " + this.nome + " emprestado.");
        } else{
            System.out.println("É preciso reserva primeiro.");
            super.estado = "Emprestado";
        }
    }

    public void cancelarReserva(){
        System.out.println("Reserva do livro físico " + this.nome + " cancelado.");
        super.estado = "Guardado";
    }

    public void devolver(){
        System.out.println("Livro físico " + this.nome + "  devolvido.");
        super.estado = "Guardado";
    }
}
