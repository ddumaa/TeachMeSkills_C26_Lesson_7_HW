package homework.task_1;

public class Worker implements IJobTitle{
    String jobTitle = "Worker";
    @Override
    public void infoJobTitle() {
        System.out.println("Job title - " + jobTitle);
    }
}
