package se.yrgo.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookCatalogTest {

	private final BookCatalog bc;
	private final Book book1;
	private final Book book2;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		book2 = new Book(5, "Learning Maven","","","",0);

		bc.addBook(book1);

	}

	//G
	@Test
	public void testAddABook() {
		assertEquals(1, bc.getNumberOfBooks());
		bc.addBook(book2);
		assertEquals(2, bc.getNumberOfBooks());


	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
		Book testBook = bc.findBook("Learning Java");
		assertEquals(book1, testBook);
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
		Book testBook = bc.findBook("LeArNiNg JaVA");
		assertEquals(book1.getTitle(), testBook.getTitle());
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
		Book testBook = bc.findBook(" Learning Java  ");
		assertEquals(book1.getTitle(), testBook.getTitle());
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {

	}

}
