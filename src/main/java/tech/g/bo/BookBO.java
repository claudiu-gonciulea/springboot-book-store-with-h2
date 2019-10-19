package tech.g.bo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookBO {

	@Id
	private Long id;
	
	private String bookName;
	private String author;
	private String isbn;
	
	public BookBO() {
		
	}

	public BookBO(String bookName, String author, String isbn) {

		this.bookName = bookName;
		this.author = author;
		this.isbn = isbn;
	}

	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
