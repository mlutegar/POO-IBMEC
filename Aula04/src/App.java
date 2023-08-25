public class App{
    public static void main(String[] args) throws Exception{
        Jogador jog1, jog2;
        jog1 = new Jogador();
        jog1.nome = "Neymar";
        jog1.posX = -15.2;
        jog1.posY = 25.4;
        jog1.numeroCamisa = 10;
        jog1.time = "Al Hilal";

        System.out.println(jog1.peso);
        System.out.println(jog1.posX + ", " + jog1.posY);
        jog1.andar(-10, 28);
        System.out.println(jog1.posX + ", " + jog1.posY);

        jog2 = new Jogador(null, null, 0, 0, null);
        jog2.nome = "Neymar";
        jog2.posX = -15.2;
        jog2.posY = 25.4;
        jog2.numeroCamisa = 10;
        jog2.time = "Al Hilal";
        jog1.andar(-10, 28);

        System.out.println(jog1);
        System.out.println(jog2);
        System.out.println(jog1 == jog2);

        Jogador jog3 = new Jogador("Zé", "Flamengo", 1.72, 60, "atacante");
        System.out.println(jog3.nome);
        System.out.println(jog3.velocidade);
    }
}