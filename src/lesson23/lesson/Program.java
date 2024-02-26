package lesson23.lesson;


import lesson23.customAnnotation.Executable;

@Version(value = "1.2", developer = "Sasha Beliy 2")
@Executable(value = "by developer!!!")
public class Program {

    private int year = 2023;

    public int getYear() {
        return year;
    }

    @Version(value = "1.2", developer = "Sasha Beliy")
    String currentVersion;


    @Executable(value = "by developer!!!")
    public void setUp(String[] args) {
        System.out.println(args);
    }
}
