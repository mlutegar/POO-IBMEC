import controlador.AlunoDAO;
import modelo.Aluno;

public class App {

    // Teste de execução
    public static void main(String[] args) {
        // Instanciando objetos
        AlunoDAO alunoDAO = new AlunoDAO();

        // Teste de adicionar e listar alunos
        System.out.println("\nTESTE DE ADICIONAR ALUNO E LISTAR ALUNOS: ");
        alunoDAO.cadastrarAluno("André Costa", "202208385371", "Engenharia de Computação");
        alunoDAO.cadastrarAluno("Michel Lutegar", "2022083385192", "Engenharia de Computação");
        alunoDAO.cadastrarAluno("Kanye West", "2022083389321", "Design de moda");
        System.out.println(alunoDAO.listarAlunos());

        // Teste de remover aluno
        System.out.println("\nTESTE DE REMOVER ALUNO: ");
        alunoDAO.removerAluno("2022083389321");
        System.out.println(alunoDAO.buscarAluno("2022083389321"));

        // Teste de atualizar curso e buscar aluno
        System.out.println("\nTESTE DE ATUALIZAR CURSO E BUSCAR ALUNO: ");
        alunoDAO.atualizarCurso("2022083385192", "Administração");
        System.out.println(alunoDAO.buscarAluno("2022083385192"));
    }
}