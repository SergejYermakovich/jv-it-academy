package lesson19.lesson.company;

public enum ProgrammingLanguage {

    C_PLUS_PLUS("C++"),
    JAVA;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ProgrammingLanguage(String name) {
        this.name = name;
    }

    ProgrammingLanguage() {
    }
}
