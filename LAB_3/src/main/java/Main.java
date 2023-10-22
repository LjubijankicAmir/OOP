import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        DataStructures d1 = new DataStructures();
        List <TaskItem> tasksCompleted;
        List <TaskItem> tasksIdTwo;
        tasksCompleted = d1.getByStatus(Status.COMPLETED);
        tasksIdTwo = d1.getIdGreaterThanTwo();

        d1.printAllDescriptions();

        System.out.println("---TASKS WITH STATUS COMPLETED---");
        for(TaskItem task: tasksCompleted){
            System.out.println("ID:"+task.getTaskId());
            System.out.println("Description:"+task.getTaskDescription());
            System.out.println("Status:"+task.getTaskStatus());
            System.out.println();
        }

        System.out.println("---TASKS WITH ID GREATER THAN TWO---");
        for(TaskItem task: tasksIdTwo){
            System.out.println("ID:"+task.getTaskId());
            System.out.println("Description:"+task.getTaskDescription());
            System.out.println("Status:"+task.getTaskStatus());
            System.out.println();
        }
    }
}