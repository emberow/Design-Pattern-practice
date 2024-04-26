package ObserverPattern;

import ObserverPattern.Interface.IObserver;

public class Student implements IObserver {

    PodcastA podcastA;

    public Student(PodcastA podcastA){
        this.podcastA = podcastA;
    }

    @Override
    public void update() {
        System.out.println("聽了" + podcastA.getName());
    }

}