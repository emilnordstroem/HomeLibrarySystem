package application.model.library;

import java.util.ArrayList;

public class Bookcase {
    private String name;
    private Bookshelf[] bookshelfList;

    public Bookcase(String name, int numberOfShelfs){
        this.name = name;
        this.bookshelfList = new Bookshelf[numberOfShelfs];
        addBookshelfs(numberOfShelfs);
    }

    public void addBookshelfs(int numberOfShelfs){
        for(int index = 0; index < numberOfShelfs; index++){
            // Add bookshelf to list
        }
    }
}
