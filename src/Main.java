void main() throws InterruptedException, ExecutionException {
    ExecutorService pool =
            Executors.newFixedThreadPool(
                    Runtime.getRuntime()
                            .availableProcessors()
            );

    List<Callable<Integer>> tasks = List.of(
            new MessageTask("поток 1"),
            new MessageTask("поток 2"),
            new MessageTask("поток 3"),
            new MessageTask("поток 4")
    );

    System.out.println("Запуск задач...");

    List<Future<Integer>> results = pool.invokeAll(tasks);

    System.out.println("\nРезультаты:");

    for (Future<Integer> future : results) {
        System.out.println(
                "Выведено сообщений: "
                        + future.get()
        );
    }

    pool.shutdown(); // Вызовом завершения всех групп потоков
}
