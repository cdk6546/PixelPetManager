public class Task {
    private String name;
    private boolean isComplete;

    public Task(String name){
        this.name = name;
        this.isComplete = false;
    }

    public String getName() {
        return this.name;
    }

    public boolean getIsComplete() {
        return isComplete;
    }

    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    @Override
    public String toString() {
        return this.name + " " + this.isComplete;
    }
}
