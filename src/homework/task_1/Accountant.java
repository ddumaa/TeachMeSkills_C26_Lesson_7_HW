package homework.task_1;

public class Accountant implements IJobTitle{
    String jobTitle = "Accountant";
    @Override
    public void infoJobTitle() {
        System.out.println("Job title - " + jobTitle);
    }
}
