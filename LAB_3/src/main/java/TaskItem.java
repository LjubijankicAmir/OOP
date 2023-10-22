public class TaskItem{
    private int taskId;
    private String taskDescription;
    private Status taskStatus;
    public TaskItem(int x, String y, Status z){
        taskId=x;
        taskDescription=y;
        taskStatus=z;
    }

    public int getTaskId() {
        return taskId;
    }

    public Status getTaskStatus() {
        return taskStatus;
    }

    public String getTaskDescription() {
        return taskDescription;
    }
}
