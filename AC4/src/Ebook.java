public class Ebook extends Livro {
    String tipo;

    public Ebook(String nome, String autor, String tipo) {
        super(nome, autor);
        this.tipo = tipo;
    }

    @Override
    public void reservar(){
        System.out.println("Ebook \"" + super.nome + "\" reservado.");
        super.estado = "Reservado";
    }

    @Override
    public void emprestar() {
        System.out.println("Ebooks não podem ser emprestados. Apenas reservados.");
    }

    @Override
    public void cancelarReserva(){
        System.out.println("Reserva do Ebook \"" + super.nome + "\" cancelado.");
        super.estado = "Guardado";
    }

    @Override
    public void devolver(){
        System.out.println("Ebook \"" + super.nome + "\" devolvido.");
        super.estado = "Guardado";
    }
}
