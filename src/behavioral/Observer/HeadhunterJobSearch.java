package behavioral.Observer;

public class HeadhunterJobSearch {
    public static void main(String[] args) {
        Observer firstSubscriber = new Subscriber("Andrew Kim");
        Observer secondSubscriber = new Subscriber("Kate Smirnova");
        JobSearch jobSearch = new JobSearch();
        jobSearch.addVacancy("Junior java developer");
        jobSearch.addVacancy("Middle java developer");
        jobSearch.addObserver(firstSubscriber);
        jobSearch.addObserver(secondSubscriber);
        jobSearch.addVacancy("Senior java developer");
        System.out.println("```````````````````````````````````");
        jobSearch.removeObserver(secondSubscriber);
        jobSearch.removeVacancy("Middle java developer");
    }
}
