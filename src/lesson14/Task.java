package lesson14;

import java.util.Objects;

public class Task {
    private String name;

    public Task() {
        super();
        this.name = "task";
    }


    @Override
    public boolean equals(Object that) {
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
