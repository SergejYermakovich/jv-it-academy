package lesson13.lessonCode;

import java.io.FileNotFoundException;

public class FileHasNotValidNameException extends RuntimeException {
    public FileHasNotValidNameException(String message, Throwable cause) {
        super(message, cause);
    }
}
