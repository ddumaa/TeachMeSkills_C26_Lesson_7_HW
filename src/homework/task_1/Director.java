package homework.task_1;

public class Director implements IJobTitle{
    String jobTitle = "Director";
    @Override
    public void infoJobTitle() {
        System.out.println("Job title - " + jobTitle);
    }
}
