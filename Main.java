public class Main {
    public static void main(String[] args) {
    Game game = new Game();
    game.start();
        try {
            Thread.sleep(5000); // Задержка 1 секунда
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();}
    game.stop();

    }
}