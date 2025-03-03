public class Task {
    private String name;
    private boolean isCompleted;

    // Constructor
    public Task(String name) {
        this.name = name;
        this.isCompleted = false;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[✔] " : "[ ] ") + name;
    }
}