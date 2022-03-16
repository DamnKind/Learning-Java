package Dersler.odevler.kodlamaioOdev;

import java.util.ArrayList;
import java.util.List;

public class LessonManager {
    List<String> myLesson = new ArrayList<String>();
    public void joinProgram (Lesson lesson) {
        System.out.println(lesson.name + " Programına dahil oldunuz. Başarılar!");
        myLesson.add(lesson.name);
    }
    public void exitProgram (Lesson lesson) {
        System.out.println(lesson.name + " Programından ayrıldığınız için üzgünüz.");
        myLesson.remove(lesson.name);
    }
    public void listMyLessons() {
        for(int i=0;i<myLesson.size();i++) {
            System.out.println(myLesson.get(i));
        }
    }
}
