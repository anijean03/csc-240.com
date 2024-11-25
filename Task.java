public class Task implements Priority {
    private String taskDescription;
    private int priority;

    public Task(String taskDescription, int priority) {
        this.taskDescription = taskDescription;
        setPriority(priority); 
    }

    @Override
    public void setPriority(int priority) {
        if (priority >= 1 && priority <= 5) {
            this.priority = priority;
        } else {
            throw new IllegalArgumentException("Priority must be between 1 and 5.");
        }
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return String.format("%-20s priority: %d", taskDescription, priority);
    }
}