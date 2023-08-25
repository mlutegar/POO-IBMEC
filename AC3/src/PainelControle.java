public class PainelControle {

    public void visualizarEventosFuturos(Evento evento, int data) {
        if (evento.data > data) {
            System.out.println("Há eventos futuros! O evento: " + evento.nome);
        } else{
            System.out.println("Não há eventos futuros..");
        }
    }

    public void visualizarPalestrantes(Evento evento) {
        System.out.println(evento.palestrantes);
    }

    public void visualizarDisponibilidadeDeVagas(Evento evento) {
        if (evento.numeroParticipantes >= evento.numeroMaximoParticipantes) {
            System.out.println("Evento está cheio!");
        } else {
            System.out.println("Há " + (evento.numeroMaximoParticipantes - evento.numeroParticipantes) + " vagas");
        }
    }

    public Evento cadastrarEvento(String nome, int data, String local, int numeroMaximoParticipantes, String palestrantes) {
        Evento novoEvento = new Evento(nome, data, local, numeroMaximoParticipantes, palestrantes);
        return novoEvento;
    }

    public void inscreverAluno(Evento evento, Aluno aluno) {
        evento.alunos = aluno.nome;
        evento.numeroParticipantes++;
    }

    public void adicionarInformaçãoAdicional(Evento evento, String novaInfo) {
        evento.infoAdicional = novaInfo;
    }
}
