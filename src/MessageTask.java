import java.util.concurrent.Callable;

public class MessageTask implements Callable<Integer> {
    private final String name;

    public MessageTask(String name) {
        this.name = name;
    }

    @Override
    public Integer call() throws Exception {

        int counter = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.printf(
                    "%s: сообщение №%d%n",
                    name,
                    i
            );

            counter++;

            Thread.sleep(2000);
        }

        return counter;
    }
}
