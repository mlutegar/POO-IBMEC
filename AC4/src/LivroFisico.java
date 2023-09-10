public class LivroFisico extends Livro{

    public LivroFisico(String nome, String autor) {
        super(nome, autor);
    }

    @Override
    public void reservar(){
        System.out.println("Livro físico \"" + super.nome + "\" reservado.");
        super.estado = "Reservado";
    }

    @Override
    public void emprestar() {
        if (super.estado == "Reservado") {
            System.out.println("Livro físico \"" + super.nome + "\" emprestado.");
            super.estado = "Emprestado";
        } else if (super.estado == "Emprestado"){
            System.out.println("Livro físico \"" + super.nome + "\" já está emprestado.");
        } else{
            System.out.println("É preciso reserva primeiro.");
        }
    }

    @Override
    public void cancelarReserva(){
        System.out.println("Reserva do livro físico \"" + super.nome + "\" cancelado.");
        super.estado = "Guardado";
    }

    @Override
    public void devolver(){
        System.out.println("Livro físico \"" + super.nome + "\" devolvido.");
        super.estado = "Guardado";
    }
}
