public class App {
    public static void main(String[] args) {
        LivroFisico livro1 = new LivroFisico("Aventuras em Java", "João Autor");
        Ebook ebook1 = new Ebook("Programação Java Avançada", "João Autor", "PDF");

        livro1.emprestar(); // Vai exibir um texto dizendo que o livro precisa ser reservado primeiro.

        // As mensagens abaixo devem exibir na tela que os livros foram reservados com sucesso
        livro1.reservar();
        ebook1.reservar();

        ebook1.cancelarReserva(); // Deve dizer que a reserva foi cancelada

        livro1.emprestar(); // Vai informar que o livro foi emprestado com sucesso
        livro1.emprestar(); // Vai exibir um texto dizendo que o livro já está emprestado
        livro1.devolver(); // Vai exibir um texto dizendo que o livro foi devolvido
    }
}