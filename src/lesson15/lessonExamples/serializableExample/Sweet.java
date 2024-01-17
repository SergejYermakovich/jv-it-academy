package lesson15.lessonExamples.serializableExample;

import java.io.Serializable;

public class Sweet implements Serializable {
    private int size;
    private String name;

    public Sweet(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
