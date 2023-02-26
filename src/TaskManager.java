import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskManager {

    private ArrayList<Task> tasks;
    private int percentage;

    public TaskManager(ArrayList<Task> tasks) {
        this.tasks = tasks;
        setPercentage();
    }

    public ArrayList<Task> getTasks() {
        return this.tasks;
    }

    public ArrayList<Task> getCompletedTasks() {
        ArrayList<Task> completedTasks = new ArrayList<>();
        for (Task T : tasks) {
            if (T.getIsComplete()) {
                completedTasks.add(T);
            }
        }
        return completedTasks;
    }

    public void setPercentage() {
        float CT = getCompletedTasks().size();
        float T = getTasks().size();
        float p = (CT / T) * 100;
        this.percentage = Math.round(p);
    }

    public int getPercentage() {
        setPercentage();
        return this.percentage;
    }

//    public void toggleTaskComplete(Scanner scanner) {
//        try {
//            if (tasks.size() <= 0) {
//                System.out.println("Nothing to toggle, tasks list is empty.");
//            }
//            else {
//                System.out.println("Enter number of task to complete.");
//                int index = scanner.nextInt();
//                scanner.nextLine();
//                Task taskAtIndex = tasks.get(index);
//                boolean TAIstatus = taskAtIndex.getIsComplete();
//                taskAtIndex.setComplete(!TAIstatus);
//            }
//        } catch (InputMismatchException ex) {
//            System.out.println("Please enter only numbers");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Invalid index number");
//        }
//    }

}
