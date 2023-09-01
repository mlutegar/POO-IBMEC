public class Transmissao1 implements ITransmiteDados{

        @Override
        public void enviaJson() {
            System.out.println("Enviando JSON");
        }

        @Override
        public String recebeMensagem(String protocolo) {
            return "Mensagem recebida";
        }
}
