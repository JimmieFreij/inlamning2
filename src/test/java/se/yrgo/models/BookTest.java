package se.yrgo.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(5, "Title", "Author", "isbn", "branch", 20);
		Book book2 = new Book(5, "Title", "Author", "isbn", "branch", 20);

		assertEquals(book1, book2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(5, "Title", "Author", "isbn", "branch", 20);
		Book book2 = new Book(6, "Titles", "Authors", "isbn", "branch", 20);
		assertNotEquals(book1, book2);
	}

}
