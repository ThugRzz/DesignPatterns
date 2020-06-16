package structural.Facade;

public class WorkflowFacade {
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();
    Developer developer = new Developer();
    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
