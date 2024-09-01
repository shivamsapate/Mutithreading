package Creation;

public class ThreadException {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            throw new RuntimeException("this is exception");
        });
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable throwable) {
                System.out.println("critical thread occured while running thread" +
                        thread.getName() + " with exception " + throwable.getMessage());

            }
        });

        thread.start();
    }

}
