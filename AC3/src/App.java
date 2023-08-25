/*
    Sistema de gestão de eventos universitários, para simplificar a administração
    e melhorar o engajamento dos alunos por meio de uma solução tecnológica eficiente.
*/

public class App {
    public static void main(String[] args) throws Exception {
        // criando instancias das classes
        PainelControle pc = new PainelControle();
        Aluno al = new Aluno("Michel", "Engenharia da Computação");

        // testando o método de cadastro de evento
        Evento ev = pc.cadastrarEvento("XP Business", 25, "Rio de Janeiro", 10, "Elon");

        // testando métodos das classes
        pc.visualizarEventosFuturos(ev, 10);
        pc.visualizarDisponibilidadeDeVagas(ev);
        pc.visualizarPalestrantes(ev);
        pc.inscreverAluno(ev, al);
        pc.visualizarDisponibilidadeDeVagas(ev);
        pc.adicionarInformaçãoAdicional(ev, "O maior evento financeiro do mundo!");
        System.out.println(ev.infoAdicional);
    }
}