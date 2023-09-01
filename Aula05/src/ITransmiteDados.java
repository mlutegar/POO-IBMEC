public interface ITransmiteDados {

    // Métodos em interfaces são sempre abstratos
    // Então não precisamos colocar o abstract
    void enviaJson();
    String recebeMensagem(String protocolo);
}