package lesson19.lesson.company;

import java.util.List;
import java.util.Set;

public class Company {
    private String name;
    private volatile Set<Developer> developers;

    public Company(String name, Set<Developer> developers) {
        this.name = name;
        this.developers = developers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(Set<Developer> developers) {
        this.developers = developers;
    }

    public synchronized void addDeveloper(Developer developer) {
        this.developers.add(developer);
    }

    public void deleteDeveloper(Developer developer) {
        this.developers.remove(developer);
    }

    public List<Developer> findByNameAndLanguage(String name,
                                                 ProgrammingLanguage programmingLanguage) {
        return this.developers.stream()
                .filter(developer -> developer.getName().equals(name))
                .filter(developer -> developer.getProgrammingLanguages().contains(programmingLanguage))
                .toList();
    }

}
