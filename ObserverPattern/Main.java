package ObserverPattern;

public class Main {

    public static void main(String[] args){
        PodcastA podcast = new PodcastA();
        Student student = new Student(podcast);

        // 預設節目是英文廣播
        podcast.add(student);
        podcast.notifyObservers();

        // 節目變為今年流行歌
        ((PodcastA) podcast).name = "今年流行歌";
        podcast.notifyObservers();

    }
}
