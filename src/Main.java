void main() throws InterruptedException{
    System.out.println("СОздание потоков...");

    // Создаем группу потоков
    ThreadGroup group = new ThreadGroup("Workers");

    // СОздание потоков
    MyThread t1 = new MyThread(group, "поток 1");
    MyThread t2 = new MyThread(group, "поток 2");
    MyThread t3 = new MyThread(group, "поток 3");
    MyThread t4 = new MyThread(group, "поток 4");

    // Запуск потоков
    t1.start();
    t2.start();
    t3.start();
    t4.start();

    Thread.sleep(15000); // Главный поток спит 15 секунд

    System.out.println("\nЗавершение всех потоков!");

    group.interrupt(); // Вызовом завершения всех групп потоков
}
