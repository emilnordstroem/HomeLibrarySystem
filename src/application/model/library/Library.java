package application.model.library;

import application.model.utilities.Address;

import java.util.ArrayList;

public class Library {
    private Address address;
    private ArrayList<Bookcase> bookcaseList = new ArrayList<>();

    public Library(Address address){
        this.address = address;
    }

    public void addBookcase(Bookcase bookcase){
        if(!bookcaseList.contains(bookcase)){
            bookcaseList.add(bookcase);
        }
    }

    // Incomplete
    public Bookcase getBookcase(Bookcase bookcase){
        return null;
    }
}
