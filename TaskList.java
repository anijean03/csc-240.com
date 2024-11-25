public class TaskList {
    public static void main(String[] args) {
        Task[] tasks = {
                new Task("Attend class", 1),
                new Task("Homework", 2),
                new Task("Exercise", 3),
                new Task("Eat breakfast", 4),
                new Task("Eat lunch", 5)
        };

        System.out.println("Priority Task List");
        System.out.println("------------------");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}