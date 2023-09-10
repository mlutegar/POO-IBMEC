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
        if (super.estado == "Reservado") {
            System.out.println("Ebook \"" + super.nome + "\" emprestado.");
            super.estado = "Emprestado";
        } else if (super.estado == "Emprestado"){
            System.out.println("Ebook \"" + super.nome + "\" já está emprestado.");
        } else{
            System.out.println("É preciso fazer a reserva primeiro.");
        }
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
