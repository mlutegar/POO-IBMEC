public class Evento {
    String nome, local, palestrantes, infoAdicional, alunos;
    int data, numeroParticipantes, numeroMaximoParticipantes;

    Evento(String nome, int data, String local, int numeroMaximoParticipantes, String palestrantes){
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.numeroMaximoParticipantes = numeroMaximoParticipantes;
        this.palestrantes = palestrantes;

        this.numeroParticipantes = 0;
        this.alunos = "";
    }
}
