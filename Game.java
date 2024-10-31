public class Game {

    private boolean OnOrOff = true;
    private int FPS = 60;
    private boolean multiplayer = false;
    private String genre = "шутер";
    private String digging = "187Production";
    private String distributor = "Merlion";
    private boolean i;
    private Thread gameThread;

    public void start() {
        gameThread = new Thread(() -> {
            while (OnOrOff) {
                System.out.println("Игра запущена");
                try {
                    Thread.sleep(1000); // Задержка 1 секунда
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Восстановление состояния прерывания
                }
            }
        });

        gameThread.start(); // Запускаем поток
    }

    public void stop(){
        if (!OnOrOff) {
            System.out.println("Игра уже остановлена.");
            return;
        }
        OnOrOff = false;
        gameThread.interrupt(); // прерываем поток, если он находится в состоянии ожидания
        try {
            gameThread.join(); // ждем завершения потока
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("конец игры");
    }
}


