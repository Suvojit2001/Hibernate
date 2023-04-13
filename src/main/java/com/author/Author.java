package com.author;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {
	@Id
	int author_id;
	String author_name;
	@OneToMany(mappedBy = "author")
	List<Book> book;
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	public Author(int author_id, String author_name, List<Book> book) {
		super();
		this.author_id = author_id;
		this.author_name = author_name;
		this.book = book;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
