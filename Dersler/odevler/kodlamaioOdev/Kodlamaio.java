package Dersler.odevler.kodlamaioOdev;

public class Kodlamaio {
    public static void main(String[] args) {
        Lesson lesson1 = new Lesson(1, "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)"); //Add new lessons to system
        Lesson lesson2 = new Lesson(2, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)");
        Lesson lesson3 = new Lesson(3, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
        Lesson lesson4 = new Lesson(4, "Programlamaya Giriş için Temel Kurs");

        Lesson[] lessons = {lesson1, lesson2, lesson3, lesson4};

        for(Lesson lesson : lessons) { //List all lessons
            System.out.println(lesson.name);
        }
        LessonManager lessonManager = new LessonManager();
        lessonManager.joinProgram(lesson4);
        lessonManager.joinProgram(lesson2);
        lessonManager.exitProgram(lesson2);
        lessonManager.listMyLessons(); // List lesson which i took
    }
}
