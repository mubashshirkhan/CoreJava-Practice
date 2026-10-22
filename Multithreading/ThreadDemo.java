public class ThreadDemo {
    public static void main(String[] args) {

        // 1. Get the currently executing thread object
        Thread th1 = Thread.currentThread();

        // Display the default thread name, ID, priority and group
        System.out.println("Name: " + th1.getName());
        System.out.println("ID: " + th1.threadId());
        System.out.println("Priority: " + th1.getPriority());
        System.out.println("Group: " + th1.getThreadGroup().getName());

        // 2. Change the current thread's name and priority
        th1.setName("Main-Worker");
        th1.setPriority(8);

        // Display the updated name and priority
        System.out.println("\nUpdated Name: " + th1.getName());
        System.out.println("Updated Priority: " + th1.getPriority());

        // 3. Create a custom thread group named GroupA
        ThreadGroup group = new ThreadGroup("GroupA");

        // 4. Create a thread named Child-1 inside GroupA
        Thread th2 = new Thread(group, "Child-1");

        // Display the new thread's name, ID and group name
        System.out.println("\nThread Name: " + th2.getName());
        System.out.println("Thread ID: " + th2.threadId());
        System.out.println("Thread Group: "
                + th2.getThreadGroup().getName());

        // 5. Compare the thread object's name witgh the current thread's name
        // th2.getName() returns the name of the th2 object
        System.out.println("\nObject Name: " + th2.getName());

        // currentThread() returns the thread executing this code (main)
        System.out.println("Current Thread: "
                + Thread.currentThread().getName());

        // Note: th2 is created but not started, so main is still executing.
    }
}
