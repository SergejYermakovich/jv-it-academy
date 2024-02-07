package lesson19.lesson.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Developer misha = new Developer("Misha", Set.of(ProgrammingLanguage.C_PLUS_PLUS));
        Developer oxana = new Developer("Oxana", Set.of(ProgrammingLanguage.JAVA));
        Developer sava = new Developer("Savelii", Set.of(ProgrammingLanguage.JAVA));

        Set<Developer> developers = new HashSet<>();
        developers.add(misha);
        developers.add(oxana);
        developers.add(sava);

        Company company = new Company(
                "IT-Academy",
                developers
        );

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Runnable task = () -> {
            for (int i = 1; ; i++) {

                Developer developer = new Developer("Ivan " + i,
                        Set.of(ProgrammingLanguage.C_PLUS_PLUS));

                company.addDeveloper(developer);

                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        executorService.execute(task);

        Thread.sleep(1000);

        List<Developer> developersList =
                company.findByNameAndLanguage("Ivan 1", ProgrammingLanguage.C_PLUS_PLUS);
        System.out.println(developersList);

        executorService.shutdown();
    }
}
