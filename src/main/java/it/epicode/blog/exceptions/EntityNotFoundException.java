package it.epicode.blog.exceptions;

import javax.swing.text.html.parser.Entity;
import java.util.NoSuchElementException;

public class EntityNotFoundException extends NoSuchElementException {
    public EntityNotFoundException(String message) {
        super(message);
    }
}
