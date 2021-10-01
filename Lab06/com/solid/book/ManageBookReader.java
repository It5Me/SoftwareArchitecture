package com.solid.book;

import java.util.List;

public class ManageBookReader extends Book {

	public ManageBookReader(String title, List<String> pages) {
		super(title, pages);
		// TODO Auto-generated constructor stub
	}
	public void printToScreen() {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
